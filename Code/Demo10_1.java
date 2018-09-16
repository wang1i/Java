package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月10日下午7:21:58
 * @type 练习题
 */
public class Demo10_1 {

	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		System.out.println("时间1：" + t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond() + "\n时间2：" + t2.getHour()
				+ ":" + t2.getMinute() + ":" + t2.getSecond());
		System.out.println(System.currentTimeMillis());
	}

}
