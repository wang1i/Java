package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��4��24������9:18:50
 * @type ��ϰ��
 */
public class Demo6_25 {

	public static void main(String[] args) {
		long mills = System.currentTimeMillis();
		String s = convertMillis(mills);
		System.out.println(s);

	}

	public static String convertMillis(long mills) {
		long totalSecond = mills / 1000;
		long currentSecond = totalSecond % 60;
		long totalMinute = totalSecond / 60;
		long currentMinute = totalMinute % 60;
		long totalHour = totalMinute / 60;
		long currentHour = totalHour % 24;
		String str = "";
		str += currentHour + " : " + currentMinute + " : " + currentSecond;
		return str;
	}
}
