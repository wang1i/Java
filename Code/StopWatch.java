package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��7������10:22:23
 * @type ��ϰ��
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
