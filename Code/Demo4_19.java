package myjava;

import java.util.Scanner;

public class Demo4_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("输入ISBN-10的前9位数字：");
		String s = input.nextLine();
		int []d =new int[10];
		d[9] = 0;
		for(int i = 0 ; i < 9 ; i ++) {
			d[i] = s.charAt(i) - '0';
			d[9] += (i + 1) * d[i];
		}
		d[9] %= 11;
		if(d[9] == 10) 
			System.out.println("ISBN-10的十位数字为：" + s + 'X');
		else 
			System.out.println("ISBN-10的十位数字为：" + s + d[9]);
		

	}

}
