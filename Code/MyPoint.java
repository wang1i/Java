package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��14������9:51:03
 * @type ��ϰ��
 */
public class MyPoint {
	private double x;
	private double y;

	public MyPoint() {
		this(0, 0);
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distance(MyPoint p) {
		double d = Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2);
		return Math.sqrt(d);
	}

	public double distance(double x, double y) {
		double d = Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2);
		return Math.sqrt(d);
	}

}
