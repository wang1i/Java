package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月8日上午9:50:56
 * @type 练习题
 */
public class Demo9_7 {

	public static void main(String[] args) {
		Account ac = new Account(1122, 20000);
		ac.setAnnualInterestRate(4.5);
		ac.withDraw(2500);
		ac.deposit(3000);
		System.out.println("余额：" + ac.getBalance() + "\t月利息：" + ac.getBalance() * ac.getMonthlyInterestRate()
				+ "\t开户日期：" + ac.dateCreated().toString());
	}

}
