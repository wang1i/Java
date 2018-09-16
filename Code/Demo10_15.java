package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��21������9:57:50
 * @type ��ϰ��
 */
public class Demo10_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������㣺");
		double[][] points = new double[5][2];
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 2; j++)
				points[i][j] = input.nextDouble();
		MyRectangle2D r = getRectangle(points);
		System.out.println(
				"�߽���ε�������" + "(" + r.getX() + "," + r.getY() + ")\n" + "��ȣ�" + r.getWidth() + "\t�߶ȣ�" + r.getHeight());
	}

	public static MyRectangle2D getRectangle(double[][] points) {
		MyRectangle2D r = new MyRectangle2D();
		double xl = 65535;
		double xr = -65535;
		double yd = 65535;
		double yu = -65535;
		for (int i = 0; i < 5; i++) {
			if (points[i][0] > xr)
				xr = points[i][0];
			if (points[i][0] < xl)
				xl = points[i][0];
			if (points[i][1] > yu)
				yu = points[i][1];
			if (points[i][1] < yd)
				yd = points[i][1];
		}
		r.setWidth(xr - xl);
		r.setHeight(yu - yd);
		r.setX((xr + xl) / 2);
		r.setY((yu + yd) / 2);
		return r;
	}

}
