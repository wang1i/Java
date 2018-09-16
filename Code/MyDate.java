package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月20日下午11:06:25
 * @type 练习题
 */
public class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate() {
		this(System.currentTimeMillis());
	}

	public MyDate(long mills) {
		long seconds = mills / 1000;
		long minutes = seconds / 60;
		long hours = minutes / 60;
		long days = hours / 24;
		int Year = 1970;
		while (true) {
			if (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
				if (days < 366)
					break;
				days -= 366;
				Year++;
			} else {
				if (days < 365)
					break;
				days -= 365;
				Year++;
			}
		}

		int i;
		int[] daysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (i = 0; i < 12; i++) {
			if (i == 1 && (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0)) {
				if (days <= 29)
					break;
				days -= 29;
			} else {
				if (days <= daysOfMonth[i])
					break;
				days -= daysOfMonth[i];
			}
		}

		year = Year;
		month = i + 1;
		day = (int) days + 1;
	}

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDays() {
		return day;
	}

	public void setDate(long elapsedTime) {
		long seconds = elapsedTime / 1000;
		long minutes = seconds / 60;
		long hours = minutes / 60;
		long days = hours / 24;
		int Year = 1970;
		while (true) {
			if (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
				if (days < 366)
					break;
				days -= 366;
				Year++;
			} else {
				if (days < 365)
					break;
				days -= 365;
				Year++;
			}
		}

		int i;
		int[] daysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (i = 0; i < 12; i++) {
			if (i == 1 && (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0)) {
				if (days <= 29)
					break;
				days -= 29;
			} else {
				if (days <= daysOfMonth[i])
					break;
				days -= daysOfMonth[i];
			}
		}
		year = Year;
		month = i + 1;
		day = (int) days + 1;
	}
}
