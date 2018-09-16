package myjava;

import java.util.Scanner;

public class Demo3_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入石头（0）、剪刀（1）、布（2）：");
		int user = input.nextInt();
		int computer =(int)(Math.random() * 30) / 10; 
		System.out.println(computer);
		
		if(user == computer)
			System.out.println("平局！");
		else if(user < computer && (user !=0 && computer !=2) )
			System.out.println("胜！");
		else 
			System.out.println("败");

	}

}
