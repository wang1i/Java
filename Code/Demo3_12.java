package myjava;

import java.util.Scanner;

public class Demo3_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����λ����");
		int num = input.nextInt();
		
		int hundred = num / 100;
		int decade = (num / 10) % 10;
		int digit = num % 10;
	    if(hundred == digit) {
	    	System.out.println(num + "�ǻ�������");
	    }
	    else {
	    	System.out.print(num + "���ǻ�������");
	    }
	}

}
