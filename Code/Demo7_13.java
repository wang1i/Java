package myjava;

/**
 * @author wl
 * @date 创建时间：2018年5月6日上午11:47:27
 * @type 练习题
 */
public class Demo7_13 {

	public static void main(String[] args) {
		final double num = 48.8;
		System.out.println("不包括" + num + "的1~54之间的随机数为：" + getRandom(num));

	}

	private static double getRandom(double num) {
		double random = 0;
		do {
			random = Math.random() * 54;
		} while (random == num);
		return random;
	}

}
