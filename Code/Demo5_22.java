package myjava;

import java.util.Scanner;

public class Demo5_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������");
		double amount = input.nextDouble();
		System.out.print("���������������");
		int year = input.nextInt();
		System.out.print("�����������ʣ�����3��ʾ3%����");
		double yearRate = input.nextDouble();
		System.out.println();
		double interest, principal;
		double balance = amount;
		
		double monthlyRate = yearRate / 1200;
		double monthlyPay = (amount * monthlyRate) / (1 - 1 / Math.pow(1 + monthlyRate, year * 12));
		double totalPay = monthlyPay * year * 12;
		System.out.println("��֧���" + (int)(monthlyPay * 100) / 100.0);
		System.out.println("��֧���" + (int)(totalPay * 100) / 100.0 + "\n");
		
		System.out.println("�·�          ��Ϣ            ����               ���");
		for(int i = 1 ; i <= year * 12 ; i ++) {
			interest = balance * monthlyRate ;
			principal =monthlyPay - interest;
			balance -= principal;
			System.out.printf("%-5d%15.2f%17.2f%18.2f", i , interest , principal , balance);
			System.out.println();
		}
		

	}

}
