package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月20日下午8:13:13
 * @type 练习题
 */
public class MyRectangle2D {
	private double x;
	private double y;
	private double width;
	private double height;

	public MyRectangle2D() {
		this(0, 0, 1, 1);
	}

	public MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

	public boolean contains(double x, double y) {
		if (Math.abs(this.x - x) <= width / 2 && Math.abs(this.y - y) <= height / 2)
			return true;
		return false;
	}

	public boolean contains(MyRectangle2D r) {
		if (r.getX() > x - width / 2 + r.getWidth() / 2 && r.getX() < x + width / 2 - r.getWidth() / 2)
			if (r.getY() > y - height / 2 + r.getHeight() / 2 && r.getY() < y + height / 2 - r.getHeight() / 2)
				return true;
		return false;
	}

	public boolean overlap(MyRectangle2D r) {
		if (r.getX() > x - width / 2 - r.getWidth() / 2 && r.getX() < x + width / 2 + r.getWidth() / 2
				&& r.getY() > y - height / 2 - r.getHeight() / 2 && r.getY() < y + height / 2 + r.getHeight() / 2)
			return true;
		return false;
	}
}
