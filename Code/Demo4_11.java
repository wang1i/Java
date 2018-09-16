package myjava;

import java.util.Scanner;

public class Demo4_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入0~15之间的一个数：");
		int num = input.nextInt();
		if(num < 0 || num > 15)
			System.out.println("输入值非法");
		 if(num < 10) 
			 System.out.println(num + "对应的十六进制数为：" + num);
		 else
			 System.out.println(num + "对应的十六进制数为：" + (char)(num - 10 + 'A'));

	}

}
