package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��10������7:21:58
 * @type ��ϰ��
 */
public class Demo10_1 {

	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		System.out.println("ʱ��1��" + t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond() + "\nʱ��2��" + t2.getHour()
				+ ":" + t2.getMinute() + ":" + t2.getSecond());
		System.out.println(System.currentTimeMillis());
	}

}
