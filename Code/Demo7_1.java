package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年4月26日下午7:33:42
 * @type 练习题
 */
public class Demo7_1 {

	public static void main(String[] args) {
		int i;
		double best = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入学生人数：");
		int n = input.nextInt();
		double[] arr = new double[n];
		System.out.print("请输入所有学生成绩：");
		for (i = 0; i < n; i++) {
			arr[i] = input.nextInt();
			if (arr[i] > best)
				best = arr[i];
		}
		for (i = 0; i < n; i++) {
			System.out.print(i + "号学生成绩为" + arr[i] + ",等级为");
			if (arr[i] >= best - 10)
				System.out.println('A');
			else if (arr[i] >= best - 20)
				System.out.println('B');
			else if (arr[i] >= best - 30)
				System.out.println('C');
			else if (arr[i] >= best - 40)
				System.out.println('D');
			else
				System.out.println('F');
		}
	}

}
