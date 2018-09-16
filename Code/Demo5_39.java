package myjava;

public class Demo5_39 {

	public static void main(String[] args) {
		final double goal = 30000;
		double sale;
		sale = goal - 5000 * 0.08 - 5000 * 0.1;
		sale = sale / 0.12 + 10000;
		System.out.println("最小销售额为：" + sale);

	}

}
