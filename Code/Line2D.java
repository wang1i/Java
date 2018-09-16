package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��20������3:45:21
 * @type ��ϰ��
 */
public class Line2D {
	private double x1;
	private double x2;
	private double y1;
	private double y2;

	public Line2D(MyPoint p1, MyPoint p2) {
		x1 = p1.getX();
		x2 = p2.getX();

		y1 = p1.getY();
		y2 = p2.getY();

	}

	public double getX1() {
		return x1;
	}

	public double getX2() {
		return x2;
	}

	public double getY1() {
		return y1;
	}

	public double getY2() {
		return y2;
	}

}
