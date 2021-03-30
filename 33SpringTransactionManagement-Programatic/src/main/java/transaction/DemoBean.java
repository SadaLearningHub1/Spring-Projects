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
	
	public void transMethod1() {
		DefaultTransactionDefinition dtd = new DefaultTransactionDefinition();
		//set the transaction attribute
		dtd.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		dtd.setIsolationLevel(TransactionDefinition.ISOLATION_SERIALIZABLE);
		dtd.setTimeout(5);
		
		//Begin transaction
		TransactionStatus status = txManager.getTransaction(dtd);
		if(status.isNewTransaction()) {
			System.out.println("tx is newly started");
		}else {
			System.out.println("tx is already existing");
		}
		try {
			jt.update("insert into emp values(3,'sada',300,20)");
			jt.update("update emp set sal=500 where empno=1");
			jt.update("delete from emp where empno=2");
			txManager.commit(status);
			System.out.println("tx committed");
		}catch(Exception e) {
			txManager.rollback(status);
			System.out.println("tx rollbacked");
			e.printStackTrace();
		}
	}

}
