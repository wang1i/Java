package myjava;

import java.util.Scanner;

public class Demo2_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������ٶ�1(m/s)���ٶ�2(m/s)��ʱ��(s): ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double a = ( v1 - v0 ) / t;
		
		System.out.println("���ٶ�Ϊ��" + a );

	}

}
