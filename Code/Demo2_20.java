package myjava;

import java.util.Scanner;

public class Demo2_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��������֧���������ʣ�����3������3%����");
		double balance = input.nextDouble();
		double yearRate = input.nextDouble();
		
		double interst = balance * (yearRate / 1200);
		
		System.out.println("��Ϣ��Ϊ��" + interst);

	}

}
