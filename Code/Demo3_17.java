package myjava;

import java.util.Scanner;

public class Demo3_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������ʯͷ��0����������1��������2����");
		int user = input.nextInt();
		int computer =(int)(Math.random() * 30) / 10; 
		System.out.println(computer);
		
		if(user == computer)
			System.out.println("ƽ�֣�");
		else if(user < computer && (user !=0 && computer !=2) )
			System.out.println("ʤ��");
		else 
			System.out.println("��");

	}

}
