package myjava;

import java.util.Scanner;

public class Demo3_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����������꣨x��y����");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double dist_x = Math.abs(x);
		double dist_y = Math.abs(y);
		if(dist_x <=10.0 /2 && dist_y<=5.0 / 2)
			System.out.print("�㣨" + x + "," + y +")��");
		else
			System.out.print("�㣨" + x + "," + y +")����");
		System.out.println("��ԭ��Ϊ���ģ���Ϊ10����Ϊ5�ľ�����");

	}

}
