package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��8������9:50:56
 * @type ��ϰ��
 */
public class Demo9_7 {

	public static void main(String[] args) {
		Account ac = new Account(1122, 20000);
		ac.setAnnualInterestRate(4.5);
		ac.withDraw(2500);
		ac.deposit(3000);
		System.out.println("��" + ac.getBalance() + "\t����Ϣ��" + ac.getBalance() * ac.getMonthlyInterestRate()
				+ "\t�������ڣ�" + ac.dateCreated().toString());
	}

}
