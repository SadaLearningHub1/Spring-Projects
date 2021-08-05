package transaction;

import org.springframework.jdbc.core.JdbcTemplate;

public class DemoBean implements Demo {
	
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	@Override
	public void method1() {
		jt.update("insert into dept values(100,'rajesh','hyd')");
		jt.update("update emp1 set sal=100 where empno=1");
		try {
			Thread.sleep(10000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		jt.update("delete from dept where id=99");
	}

}
