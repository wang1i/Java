package myjava;

import java.util.Scanner;

public class Demo3_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入代表今天的数字（0代表星期一......6代表星期六）：");
		int today = input.nextInt();
		System.out.print("请输入距今？天的未来日期：");
		int future = input.nextInt();
		
		switch(today){
		case 0 :System.out.println("今天星期天");break;
		case 1 :System.out.println("今天星期一");break;
		case 2 :System.out.println("今天星期二");break;
		case 3 :System.out.println("今天星期三");break;
		case 4 :System.out.println("今天星期四");break;
		case 5 :System.out.println("今天星期五");break;
		case 6 :System.out.println("今天星期六");break;
		default : System.out.println("输入有误，表示今天的数字应在0~6之间");
		}
		
		future = (today + future) % 7;
		switch(future) {
		case 0 :System.out.println("未来星期天");break;
		case 1 :System.out.println("未来星期一");break;
		case 2 :System.out.println("未来星期二");break;
		case 3 :System.out.println("未来星期三");break;
		case 4 :System.out.println("未来星期四");break;
		case 5 :System.out.println("未来星期五");break;
		case 6 :System.out.println("未来星期六");break;
		}

	}

}
