package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月8日上午11:07:17
 * @type 练习题
 */
public class Fan {
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;

	private int speed;
	private boolean on;
	private double radius;
	private String color;

	public Fan() {
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}

	public int speed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean on() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double radius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String color() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		if (on)
			return "speed：" + toStr(speed) + "\tcolor：" + color + "\tradius：" + radius;
		return "fan is off\tcolor：" + color + "\tradius：" + radius;
	}

	private String toStr(int speed) {
		if (speed == 1)
			return "FAST";
		else if (speed == 2)
			return "MIDIUM";
		else
			return "SLOW";
	}
}
