package myjava;

import java.util.Scanner;

public class Demo3_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����������������֣�0��������һ......6��������������");
		int today = input.nextInt();
		System.out.print("�����������δ�����ڣ�");
		int future = input.nextInt();
		
		switch(today){
		case 0 :System.out.println("����������");break;
		case 1 :System.out.println("��������һ");break;
		case 2 :System.out.println("�������ڶ�");break;
		case 3 :System.out.println("����������");break;
		case 4 :System.out.println("����������");break;
		case 5 :System.out.println("����������");break;
		case 6 :System.out.println("����������");break;
		default : System.out.println("�������󣬱�ʾ���������Ӧ��0~6֮��");
		}
		
		future = (today + future) % 7;
		switch(future) {
		case 0 :System.out.println("δ��������");break;
		case 1 :System.out.println("δ������һ");break;
		case 2 :System.out.println("δ�����ڶ�");break;
		case 3 :System.out.println("δ��������");break;
		case 4 :System.out.println("δ��������");break;
		case 5 :System.out.println("δ��������");break;
		case 6 :System.out.println("δ��������");break;
		}

	}

}
