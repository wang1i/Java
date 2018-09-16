package myjava;

import java.util.GregorianCalendar;

/**
 * @author wl
 * @date 创建时间：2018年6月7日下午9:06:39
 * @type 练习题
 */
public class Demo9_5 {

	public static void main(String[] args) {
		GregorianCalendar date = new GregorianCalendar();
		print(date);
		date.setTimeInMillis(1234567898765L);
		print(date);
	}

	private static void print(GregorianCalendar date) {
		System.out.println(+date.get(date.YEAR) + "年" + date.get(date.MONTH) + "月" + date.get(date.DAY_OF_MONTH) + "日");

	}

}
