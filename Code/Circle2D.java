package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月19日下午11:28:22
 * @type 练习题
 */
public class Circle2D {
	private double x;
	private double y;
	private double radius;

	public Circle2D() {
		this(0, 0, 1);
	}

	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public boolean contains(double x, double y) {
		double d = Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2);
		if (Math.sqrt(d) < radius)
			return true;
		return false;
	}

	public boolean contains(Circle2D circle) {
		double d = Math.sqrt(Math.pow(this.x - circle.getX(), 2) + Math.pow(this.y - circle.getY(), 2));
		if (d <= this.getRadius() - circle.getRadius())
			return true;
		return false;
	}

	public boolean overlaps(Circle2D circle) {
		double d = Math.sqrt(Math.pow(this.x - circle.getX(), 2) + Math.pow(this.y - circle.getY(), 2));
		if (d > this.getRadius() - circle.getRadius() && d < this.radius + circle.getRadius())
			return true;
		return false;
	}
}
