package myjava;

import java.util.Scanner;

public class Demo3_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�����������ε������߳���");
		double edge1 = input.nextDouble();
		double edge2 = input.nextDouble();
		double edge3 = input.nextDouble();
		
		if(edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1)
			System.out.println("�������ܳ�Ϊ��" + (edge1 + edge2 + edge3));
		else
			System.out.println("����ֵ�Ƿ�����������֮������ڵ�����");

	}

}
