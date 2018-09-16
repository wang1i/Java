package myjava;

import java.util.Scanner;

public class Demo4_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个社保号码（如222-22-2222）");
		String s = input.nextLine();
		if(s.length() != 11) {
			System.out.println("输入非法");
		    System.exit(1);
		}
		for(int i =0 ; i < s.length() ; i ++) {
			if(i == 3 || i == 6) {
				if(s.charAt(i) != '-') {
					System.out.println("输入非法");
				    System.exit(1);
				}
			}
		    else
		    	if(!Character.isDigit(s.charAt(i))) {
		    		System.out.println("输入非法");
		    		System.exit(1);
		    	}
		}
		System.out.println("输入正确" );

	}

}
