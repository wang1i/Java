package myjava;

import java.util.Scanner;

public class Demo5_30 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("�������´洢����");
		double monthAmount = input.nextDouble();
		System.out.print("�����������ʣ���5������5%����");
		double yearRate = input.nextDouble();
		System.out.print("������洢������");
		int months = input.nextInt();
		double amount = 0;
		double monthRate = yearRate / 1200;
		
		for(int i = 1 ; i <= months ; i ++) {
			amount = (monthAmount + amount) * (1 + monthRate);
		}
		System.out.println("�˻���" + amount);

	}

}
