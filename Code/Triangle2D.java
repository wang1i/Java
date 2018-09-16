package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月20日下午2:25:03
 * @type 练习题
 */
public class Triangle2D {
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;

	public Triangle2D() {
		this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
	}

	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public MyPoint getP1() {
		return p1;
	}

	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}

	public MyPoint getP2() {
		return p2;
	}

	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}

	public MyPoint getP3() {
		return p3;
	}

	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}

	public double getArea() {
		double e1 = p1.distance(p2);
		double e2 = p1.distance(p3);
		double e3 = p2.distance(p3);
		double p = (e1 + e2 + e3) / 2;
		return Math.sqrt(p * (p - e1) * (p - e2) * (p - e3));
	}

	public double getPerimeter() {
		double e1 = p1.distance(p2);
		double e2 = p1.distance(p3);
		double e3 = p2.distance(p3);
		return e1 + e2 + e3;
	}

	public boolean contains(MyPoint p) {
		if (isIntersect(p, p1, p2, p3))
			return true;
		return false;
	}

	public boolean contains(Triangle2D t) {
		if (contains(t.p1) && contains(t.p2) && contains(t.p3))
			return true;
		return false;
	}

	public boolean overlaps(Triangle2D t) {
		Line2D e1 = new Line2D(this.p1, this.p2);
		Line2D e2 = new Line2D(this.p1, this.p3);
		Line2D e3 = new Line2D(this.p2, this.p3);
		Line2D e4 = new Line2D(t.p1, t.p2);
		Line2D e5 = new Line2D(t.p1, t.p3);
		Line2D e6 = new Line2D(t.p2, t.p3);
		if (isCross(e1, e4) || isCross(e1, e5) || isCross(e1, e6) || isCross(e2, e4) || isCross(e2, e5)
				|| isCross(e2, e6) || isCross(e3, e4) || isCross(e3, e5) || isCross(e3, e6))
			return true;
		return false;
	}

	public boolean isCross(Line2D e1, Line2D e2) {
		double a = e1.getY1() - e1.getY2();
		double b = e1.getX2() - e1.getX1();
		double e = (e1.getY1() - e1.getY2()) * e1.getX1() - (e1.getX1() - e1.getX2()) * e1.getY1();
		double c = e2.getY1() - e2.getY2();
		double d = e2.getX2() - e2.getX1();
		double f = (e2.getY1() - e2.getY2()) * e2.getX1() - (e2.getX1() - e2.getX2()) * e2.getY1();
		if (Math.abs(a * d - b * c) > 1e-6) {
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			if (isInLine(e1, x, y) && isInLine(e2, x, y))
				return true;
		}
		return false;
	}

	public boolean isInLine(Line2D e, double x, double y) {
		double x1 = e.getX1();
		double x2 = e.getX2();
		double y1 = e.getY1();
		double y2 = e.getY2();
		if (x1 > x2) {
			double temp = x1;
			x1 = x2;
			x2 = temp;
		}
		if (y1 > y2) {
			double temp = y1;
			y1 = y2;
			y2 = temp;
		}
		if (x > x1 && x < x2 && y > y1 && y < y2)
			return true;
		return false;
	}

	public boolean isIntersect(MyPoint p, MyPoint p1, MyPoint p2, MyPoint p3) {
		double area1 = area(p, p1, p2);
		double area2 = area(p, p1, p3);
		double area3 = area(p, p2, p3);
		double area = area(p1, p2, p3);
		if (area == area1 + area2 + area3)
			return true;
		return false;
	}

	public double area(MyPoint p1, MyPoint P2, MyPoint p3) {
		double e1 = p1.distance(p2);
		double e2 = p1.distance(p3);
		double e3 = p2.distance(p3);
		double s = (e1 + e2 + e3) / 2;
		double area = Math.sqrt(s * (s - e1) * (s - e2) * (s - e3));
		return area;
	}
}
