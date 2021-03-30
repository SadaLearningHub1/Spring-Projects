package transaction;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class DemoBean implements Demo {
	private JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public void transMethod1() {
		try {
			jt.update("insert into emp values(2,'sada',300,20)");
			jt.update("update emp set sal=600 where empno=1");
			jt.update("delete from emp where empno=3");
			System.out.println("tx committed");
		}catch(Exception e) {
			System.out.println("tx rollbacked");
			e.printStackTrace();
		}
	}

}
