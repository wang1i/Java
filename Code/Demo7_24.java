package myjava;

/**
 * @author wl
 * @date 创建时间：2018年5月7日下午4:41:29
 * @type 练习题
 */
public class Demo7_24 {

	public static void main(String[] args) {
		String[] digit = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String[] color = { "spades", "hearts", "diamonds", "club" };
		chooseCard(digit, color);
	}

	private static void chooseCard(String[] digit, String[] color) {
		int picks = 0, num = 0;
		int[] suit = new int[4];
		int[] size = new int[4];
		while (num < 4) {
			int rand1 = (int) (Math.random() * 4);
			int rand2 = (int) (Math.random() * 13);
			if (suit[rand1] == 0) {
				suit[rand1]++;
				size[rand1] = rand2;
				num++;
			}
			picks++;
		}
		System.out.println("总共选牌" + picks + "次\n四张牌为：");
		for (int i = 0; i < 4; i++) {
			System.out.print(color[i] + " " + digit[size[i]] + "\t");
		}

	}

}
