package myjava;

/**
 * @author wl
 * @date 创建时间：2018年4月24日下午8:04:25
 * @type 练习题
 */
public class Demo6_24 {

	public static void main(String[] args) {
		System.out.print("现在时间：");
		printDate();
		printTime();

	}

	private static long printTime() {
		long totalMillisecond = System.currentTimeMillis();
		long totalSecond = totalMillisecond / 1000;
		long currentSecond = totalSecond % 60;
		long totalMinute = totalSecond / 60;
		long currentMinute = totalMinute % 60;
		long totalHour = totalMinute / 60;
		long currentHour = totalHour % 24;
		System.out.println(currentHour + " : " + currentMinute + " : " + currentSecond + "GMT");
		return totalHour;
	}

	private static void printDate() {
		int year = 1970, daySum = 0, month;
		long days = printTime() / 24;
		while ((isLeap(year) && days > 366) || (!isLeap(year) && days > 366)) {
			if (isLeap(year))
				days -= 366;
			else
				days -= 365;
			year++;
		}
		long day = days;
		for (month = 1; month <= 12; month++) {
			daySum += getDaysOfMonth(month, year);
			if (daySum < days)
				day -= getDaysOfMonth(month, year);
			else
				break;
		}
		System.out.print(year + "年" + month + "月" + day + "日      ");
	}

	private static boolean isLeap(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			return true;
		else
			return false;
	}

	private static int getDaysOfMonth(int month, int year) {
		switch (month) {
		case 1:
			return 31;
		case 2:
			if (isLeap(year))
				return 29;
			else
				return 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		}
		return 0;
	}

}
