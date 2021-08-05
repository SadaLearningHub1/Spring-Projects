package transaction;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class DemoBean {
	
	private PlatformTransactionManager txManager;
	private JdbcTemplate jt;
	
	public void setTxManager(PlatformTransactionManager txManager) {
		this.txManager = txManager;
	}
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	public void method1() {
		
		DefaultTransactionDefinition dtd = new DefaultTransactionDefinition();
		dtd.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		dtd.setIsolationLevel(TransactionDefinition.ISOLATION_SERIALIZABLE);
		dtd.setTimeout(5);
		
		TransactionStatus status = txManager.getTransaction(dtd);
		if(status.isNewTransaction()) {
			System.out.println("Transaction is newly started");
		}else {
			System.out.println("Transaction is already exist");
		}
		
		try {
			jt.update("insert into dept values(99, 'ABC','XYZ')");
			jt.update("update emp set sal=7888 where empno=1");
			jt.update("delete from emp1 where empno=2");
			txManager.commit(status);
			System.err.println("Transaction Commited");
		}catch (Exception e) {
			txManager.rollback(status);
			System.out.println("Transaction rollback");
		}
	}
	

}
