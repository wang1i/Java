package myjava;

import java.util.Scanner;

public class Demo5_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入两个正整数：");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int d = Math.max(n1, n2);
		while(d > 1){
			if(n1 % d == 0 && n2 % d ==0)
				break;
			else
				d --;
		}
		System.out.println("最大公约数为：" + d);


	}

}
