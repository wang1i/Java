package myjava;

/**
 * @author wl
 * @date 创建时间：2018年7月1日下午1:57:38
 * @type 练习题
 */
public class CheckingAccount extends Account {
	private double limit;

	public CheckingAccount(int id, double balance, double annualInterestRate, double limit) {
		super(id, balance);
		this.limit = limit;
		super.setAnnualInterestRate(annualInterestRate);
	}

	@Override
	public void withDraw(double amount) {
		if (getBalance() >= amount)
			setBalance(getBalance() - amount);
		else if (getBalance() + limit > amount) {
			limit = limit - (amount - getBalance());
			setBalance(0);
		} else
			System.exit(1);
	}

	@Override
	public String toString() {
		return "账户：" + getId() + "\n余额：" + getBalance() + "额度：" + limit + "\n开户时间" + dateCreated().toString();
	}
}
