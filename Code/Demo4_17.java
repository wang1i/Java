package myjava;

import java.util.Scanner;

public class Demo4_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年份（如2018）：");
		String Year = input.nextLine();
		for(int i = Year.length() - 1; i >=0 ; i --) {
			if(!Character.isDigit(Year.charAt(i))) {
				System.out.println("年份输入值非法");
				System.exit(1);
			}
		}
		int year = Integer.parseInt(Year);
		System.out.print("请输入月份（如Aug）：");
		String month = input.nextLine();
		
		if(month.equals("Jan"))
			System.out.println(year + "  " + month + "有31天");
		else if(month.equals("Feb")) {
			if(year % 4 == 0 && year % 100 !=0 || year % 400 ==0)
				System.out.println(year + "  " + month + "有28天");
			else
				System.out.println(year + "  " + month + "有29天");
		}
		else if(month.equals("Mar"))
			System.out.println(year + "  " + month + "有31天");
		else if(month.equals("Apr"))
			System.out.println(year + "  " + month + "有30天");
		else if(month.equals("May"))
			System.out.println(year + "  " + month + "有31天");
		else if(month.equals("Jun"))
			System.out.println(year + "  " + month + "有30天");
		else if(month.equals("Jul"))
			System.out.println(year + "  " + month + "有31天");
		else if(month.equals("Aug"))
			System.out.println(year + "  " + month + "有31天");
		else if(month.equals("Sep"))
			System.out.println(year + "  " + month + "有30天");
		else if(month.equals("Oct"))
			System.out.println(year + "  " + month + "有31天");
		else if(month.equals("Nov"))
			System.out.println(year + "  " + month + "有30天");
		else if(month.equals("Dce"))
			System.out.println(year + "  " + month + "有31天");
		else
			System.out.println("月份输入值非法");
		

	}

}
