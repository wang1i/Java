package myjava;

import java.util.GregorianCalendar;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��7������9:06:39
 * @type ��ϰ��
 */
public class Demo9_5 {

	public static void main(String[] args) {
		GregorianCalendar date = new GregorianCalendar();
		print(date);
		date.setTimeInMillis(1234567898765L);
		print(date);
	}

	private static void print(GregorianCalendar date) {
		System.out.println(+date.get(date.YEAR) + "��" + date.get(date.MONTH) + "��" + date.get(date.DAY_OF_MONTH) + "��");

	}

}
