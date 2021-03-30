package transaction;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

public class AccountImpl implements Account{

	private JdbcTemplate jt1;
	private JdbcTemplate jt2;
	
	public void setJt1(JdbcTemplate jt1) {
		this.jt1 = jt1;
	}


	public void setJt2(JdbcTemplate jt2) {
		this.jt2 = jt2;
	}


	@Override
	@Transactional(timeout=3)
	public void transferMoney(int accno1, int accno2, int amount) {
		int s1 = jt1.queryForInt("select bal from Account1 where accno=?", accno1);
		int s2 = s1-amount;
		int s3 = jt2.queryForInt("select bal from Account2 where accno=?", accno2);
		int s4 = s3 + amount;
		jt1.update("update Account1 set bal=? where accno=?",new Object[] {s2, accno1});
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			System.err.println(e);
		}
		jt2.update("update Account2 set bal=? where accno=?", new Object[] {s4,accno2});
		System.out.println("Done");
	}

}
