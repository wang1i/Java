package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月15日下午5:53:35
 * @type 练习题
 */
public class Demo8_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] adds = { { "Alabama", "Montgomery" }, { "Alaska", "Juneau" }, { "Arizona", "Phoenix" } };
		int count = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print(adds[i][0] + "的首都是：");
			String answer = input.nextLine();
			if (answer.equals(adds[i][1])) {
				count++;
				System.out.println("答案正确");
			} else
				System.out.println("正确答案是：" + adds[i][1]);
		}
		System.out.println("正确答案个数：" + count);
	}

}
