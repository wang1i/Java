package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��2������12:14:55
 * @type ��ϰ��
 */
public class Demo11_8 {

	public static void main(String[] args) {
		Account1 a = new Account1("WL", 9527, 1000);
		a.withDraw(200);
		a.deposit(500);
		a.deposit(100);
		a.withDraw(1100);
		System.out.println(a.toString());

	}

}
