package myjava;

/**
 * @author wl
 * @date 创建时间：2018年7月1日下午1:40:40
 * @type 练习题
 */
public class Demo11_3 {

	public static void main(String[] args) {
		CheckingAccount c = new CheckingAccount(101, 1000, 5, 500);
		c.withDraw(1200);
		savingAccount s = new savingAccount(102, 2000, 5);
		s.deposit(100);
		System.out.println(c.toString() + "\n" + s.toString());

	}

}
