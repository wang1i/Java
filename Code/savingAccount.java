package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��1������2:08:31
 * @type ��ϰ��
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
