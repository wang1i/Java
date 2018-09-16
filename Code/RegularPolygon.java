package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��8������8:12:20
 * @type ��ϰ��
 */
public class RegularPolygon {
	private int n;
	private double side;
	private double x;
	private double y;

	public RegularPolygon() {
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}

	public RegularPolygon(int n, double side) {
		this(n, side, 0, 0);
	}

	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	public int n() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double side() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double x() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double y() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getPerimeter() {
		return side * n;
	}

	public double getArea() {
		return n * side * side / (4 * Math.tan(Math.PI / 4));
	}
}
