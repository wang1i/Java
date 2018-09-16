package myjava;

import java.util.Scanner;

public class Demo3_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入相对于GMT的偏移时：");
		long bias = input.nextLong();
		
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		long correctHour = currentHour + bias;
		
		if(correctHour < 0) correctHour += 24;
		if(correctHour > 12) {
			correctHour -= 12; 
			System.out.println("现在时间是：" + correctHour + ": " + currentMinute + ": " + currentSecond + "PM");			
		}
		else
			System.out.println("现在时间是：" + correctHour + ": " + currentMinute + ": " + currentSecond + "AM");


	}

}
