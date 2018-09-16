package myjava;

/**
 * @author wl
 * @date 创建时间：2018年5月7日下午11:15:10
 * @type 练习题
 */
public class Demo7_29 {

	public static void main(String[] args) {
		int[] suit = new int[4];
		int sum = 0, picks = 0;
		while (sum != 24) {
			sum = 0;
			for (int i = 0; i < 4; i++) {
				suit[i] = (int) (Math.random() * 13) + 1;
				picks++;
				sum += suit[i];
			}
		}
		for (int i = 0; i < 4; i++)
			System.out.print(suit[i] + "\t");
		System.out.println("选牌" + picks + "次");

	}

}
