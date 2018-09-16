package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��10������4:10:52
 * @type ��ϰ��
 */
public class Demo8_12 {

	public static void main(String[] args) {
		double[] rates = { 0.1, 0.15, 0.25, 0.28, 0.33, 0.35 };
		double[][] brackets = { { 8350, 33950, 82250, 171550, 372950 }, { 16700, 67900, 137050, 20885, 372950 },
				{ 8350, 33950, 68525, 104425, 186475 }, { 11950, 45500, 117450, 190200, 372950 } };
		Scanner input = new Scanner(System.in);
		System.out.print("������״̬��");
		int status = input.nextInt();
		System.out.print("���������룺");
		double income = input.nextDouble();
		int n = 0;
		for (int i = 0; i < 5; i++)
			if (brackets[status][i] < income)
				n++;
		double tax = 0;
		for (int i = 1, j = 0; i < n; i++, j++)
			tax += (brackets[status][i] - brackets[status][j]) * rates[i];
		tax += brackets[status][0] * rates[0] + (income - brackets[status][n - 1]) * rates[n];
		System.out.println("˰�գ�" + tax);

	}

}
