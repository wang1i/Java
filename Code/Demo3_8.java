package myjava;

import java.util.Scanner;

public class Demo3_8 {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.print("请输入三个整数：");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
        
		int temp;
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		if(a > c) {
			temp = a;
			a = c;
			c = temp;
		}
		if(b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		System.out.println("从小到大为：" + a + "   " + b + "   " +c);
	}

}
