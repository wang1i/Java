package myjava;

import java.util.Scanner;

public class Demo5_34 {

	public static void main(String[] args) {
		int computer , user , count1 = 0 , count2 = 0;
		Scanner input = new Scanner(System.in);
		do {
			computer = (int)(Math.random() * 3);
			System.out.println("���ԣ�" + computer);
			System.out.print("������ʯͷ��0����������1��������2����");
			user = input.nextInt();
			if((computer == 0 && user == 1) || (computer == 1 && user == 2) || (computer == 2 && user == 0))
				count1 ++;
			if((computer == 0 && user == 2) || (computer == 1 && user == 0) || (computer == 2 && user == 1))
				count2 ++;
			System.out.println("����ʤ" + count1 + "��\n" + "�û�ʤ" + count2 + "��");
		}while(count1 <= 2 && count2 <= 2);
	}

}
