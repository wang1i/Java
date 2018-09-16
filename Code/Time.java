package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��10������8:57:46
 * @type ��ϰ��
 */
public class Time {
	private long hour;
	private long minute;
	private long second;

	public Time() {
		this(System.currentTimeMillis());
	}

	public Time(long elapseTime) {
		long seconds = elapseTime / 1000;
		second = seconds % 60;
		long minutes = seconds / 60;
		minute = minutes % 60;
		long hours = minutes / 60;
		hour = hours % 24;
	}

	public Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	public void setTime(long elapseTime) {
		long seconds = elapseTime / 1000;
		second = seconds % 60;
		long minutes = seconds / 60;
		minute = minute % 60;
		long hours = minutes / 60;
		hour = hours % 24;
	}

}
