package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��8������9:38:55
 * @type ��ϰ��
 */
public class Demo9_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������a,b,c,d,e,f��");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		LinearEquation equa = new LinearEquation(a, b, c, d, e, f);
		if (!equa.isSolvable()) {
			System.out.println("�����޽�");
			System.exit(0);
		}
		System.out.println("x = " + equa.getX() + "\ny = " + equa.getY());

	}

}
