package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��9������5:03:26
 * @type ��ϰ��
 */
public class Demo8_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������3��4�еľ���");
		double[][] matrix = new double[3][4];
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 4; column++)
				matrix[row][column] = input.nextDouble();
		}
		for (int column = 0; column < 4; column++) {
			double columnTotal = 0;
			for (int row = 0; row < 3; row++)
				columnTotal += matrix[row][column];
			System.out.println("��" + (column + 1) + "�еĺ�Ϊ��" + columnTotal);
		}

	}

}
