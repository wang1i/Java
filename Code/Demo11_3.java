package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��1������1:40:40
 * @type ��ϰ��
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
