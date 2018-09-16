package myjava;

import java.util.GregorianCalendar;

/**
 * @author wl
 * @date 创建时间：2018年6月20日下午11:05:55
 * @type 练习题
 */
public class Demo10_14 {

	public static void main(String[] args) {
		MyDate d1 = new MyDate();
		MyDate d2 = new MyDate(561555550000L);
		GregorianCalendar g = new GregorianCalendar();
		g.setTimeInMillis(561555550000L);
		System.out.println(d1.getYear() + "年\t" + d1.getMonth() + "月\t" + d1.getDays() + "日\n" + d2.getYear() + "年\t"
				+ d2.getMonth() + "月\t" + d2.getDays() + "日");
		System.out.println(g.getTime());
	}

}
