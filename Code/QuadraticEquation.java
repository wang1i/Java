package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��8������9:06:23
 * @type ��ϰ��
 */
public class QuadraticEquation {
	private double a;
	private double b;
	private double c;

	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double a() {
		return a;
	}

	public double b() {
		return b;
	}

	public double c() {
		return c;
	}

	public double getDiscriminant() {
		double dist = b * b - 4 * a * c;
		if (dist < 0)
			return 0;
		return dist;
	}

	public double getRoot1() {
		double dist = b * b - 4 * a * c;
		if (dist < 0)
			return 0;
		return (-b + Math.sqrt(dist)) / (2 * a);
	}

	public double getRoot2() {
		double dist = b * b - 4 * a * c;
		if (dist < 0)
			return 0;
		return (-b - Math.sqrt(dist)) / (2 * a);
	}
}
