package myjava;

import java.util.Scanner;

public class Demo2_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������x1,y1��");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("������x2,y2��");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		
		System.out.println("����֮��ľ���Ϊ��" + distance);

	}

}
