package myjava;

import java.util.Scanner;

public class Demo3_29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������Բ1���������꣨x��y�����뾶��");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();
		System.out.print("������Բ2���������꣨x��y�����뾶��");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();
		
		double dist = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 -y2, 2), 0.5);
		if(dist <= Math.abs(r1 -r2))
			System.out.println("Բ2��Բ1�ڣ�");
		else if(dist <=Math.abs(r1 + r2))
			System.out.println("Բ2��Բ1�ص���");
		else
			System.out.println("Բ2����Բ1�ص���");

	}

}
