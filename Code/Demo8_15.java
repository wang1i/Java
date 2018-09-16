package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��10������7:57:55
 * @type ��ϰ��
 */
public class Demo8_15 {

	public static void main(String[] args) {
		// (x1 - x0) * (y2 - y0) - (x2 -x0) * (y1 - y0) == 0 p2 ��p0p1��
		Scanner input = new Scanner(System.in);
		System.out.print("����5���㣺");
		double[][] points = new double[5][2];
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 2; j++)
				points[i][j] = input.nextDouble();
		if (sameLine(points))
			System.out.println("���������ͬһ��ֱ����");
		else
			System.out.println("������㲻��ͬһ��ֱ����");
	}

	private static boolean sameLine(double[][] points) {
		for (int i = 2; i < 5; i++) {
			double t = (points[1][0] - points[0][0]) * (points[i][1] - points[0][1])
					- (points[i][0] - points[0][0]) * (points[1][1] - points[0][1]);
			if (t != 0)
				return false;
		}
		return true;
	}

}
