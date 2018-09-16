package myjava;

/**
 * @author wl
 * @date 创建时间：2018年7月1日下午2:08:31
 * @type 练习题
 */
public class savingAccount extends Account {

	public savingAccount(int id, double balance, double annualInterestRate) {
		super(id, balance);
		setAnnualInterestRate(annualInterestRate);
	}

	@Override
	public void withDraw(double amount) {
		if (getBalance() >= amount)
			setBalance(getBalance() - amount);
		else
			System.exit(1);
	}

}
