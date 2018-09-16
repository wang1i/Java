package myjava;

import java.util.Scanner;

public class Demo5_34 {

	public static void main(String[] args) {
		int computer , user , count1 = 0 , count2 = 0;
		Scanner input = new Scanner(System.in);
		do {
			computer = (int)(Math.random() * 3);
			System.out.println("电脑：" + computer);
			System.out.print("请输入石头（0）、剪刀（1）、布（2）：");
			user = input.nextInt();
			if((computer == 0 && user == 1) || (computer == 1 && user == 2) || (computer == 2 && user == 0))
				count1 ++;
			if((computer == 0 && user == 2) || (computer == 1 && user == 0) || (computer == 2 && user == 1))
				count2 ++;
			System.out.println("电脑胜" + count1 + "次\n" + "用户胜" + count2 + "次");
		}while(count1 <= 2 && count2 <= 2);
	}

}
