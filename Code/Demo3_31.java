package myjava;

import java.util.Scanner;

public class Demo3_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��������Ԫ������ҵĻ��ʣ�");
		double rate = input.nextDouble();
		System.out.println("��ѡ������Ԫ�һ�����ң�����0����������Ҷһ���Ԫ������1����");
		int choice = input.nextInt();
		if(choice !=0 && choice !=1) {
			System.out.println("ѡ���������ֻ��Ϊ0��1��");
			System.exit(1);
		}
		System.out.print("��������Ԫ/����ҽ�");
		double amount = input.nextDouble();
		
		if(choice == 0) 
			System.out.println(amount + "��Ԫ�ɶһ�" + (amount * rate) + "�����");
		if(choice == 1)
			System.out.println(amount + "����ҿɶһ�" + (amount / rate) + "��Ԫ");
		

	}

}
