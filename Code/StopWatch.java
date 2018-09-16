package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月7日下午10:22:23
 * @type 练习题
 */
public class StopWatch {
	private double startTime;
	private double endTime;

	public StopWatch() {
		startTime = System.currentTimeMillis();
	}

	public double getStartTime() {
		return startTime;
	}

	public double getEndTime() {
		return endTime;
	}

	public void start() {
		startTime = System.currentTimeMillis();
	}

	public void end() {
		endTime = System.currentTimeMillis();
	}

	public double getElapsedTime() {
		return endTime - startTime;
	}
}
