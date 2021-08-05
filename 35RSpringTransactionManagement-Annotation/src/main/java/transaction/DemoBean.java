package transaction;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class DemoBean implements Demo{
	
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.SERIALIZABLE, timeout=12)
	public void method1() {
		jt.update("insert into dept values(100,'rajesh','hyd')");
		jt.update("update emp set sal=99 where empno=1");
		try {
			Thread.sleep(10000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		jt.update("delete from dept where id=99");
		
	}

}
