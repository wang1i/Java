package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月9日下午5:03:26
 * @type 练习题
 */
public class Demo8_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入3行4列的矩阵：");
		double[][] matrix = new double[3][4];
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 4; column++)
				matrix[row][column] = input.nextDouble();
		}
		for (int column = 0; column < 4; column++) {
			double columnTotal = 0;
			for (int row = 0; row < 3; row++)
				columnTotal += matrix[row][column];
			System.out.println("第" + (column + 1) + "列的和为：" + columnTotal);
		}

	}

}
