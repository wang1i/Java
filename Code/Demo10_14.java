package myjava;

import java.util.GregorianCalendar;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��20������11:05:55
 * @type ��ϰ��
 */
public class Demo10_14 {

	public static void main(String[] args) {
		MyDate d1 = new MyDate();
		MyDate d2 = new MyDate(561555550000L);
		GregorianCalendar g = new GregorianCalendar();
		g.setTimeInMillis(561555550000L);
		System.out.println(d1.getYear() + "��\t" + d1.getMonth() + "��\t" + d1.getDays() + "��\n" + d2.getYear() + "��\t"
				+ d2.getMonth() + "��\t" + d2.getDays() + "��");
		System.out.println(g.getTime());
	}

}
