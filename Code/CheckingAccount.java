package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��1������1:57:38
 * @type ��ϰ��
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
		return "�˻���" + getId() + "\n��" + getBalance() + "��ȣ�" + limit + "\n����ʱ��" + dateCreated().toString();
	}
}
