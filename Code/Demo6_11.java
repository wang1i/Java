package myjava;

public class Demo6_11 {

	public static void main(String[] args) {
		double salesAmount;
		System.out.println("销售总额                    酬金");
		for (salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
			System.out.printf("%-10.0f%20.1f", salesAmount, computerCommission(salesAmount));
			System.out.println();
		}

	}

	public static double computerCommission(double salesAmount) {
		double reward;
		if (salesAmount <= 5000)
			reward = salesAmount * 0.08;
		else if (salesAmount <= 10000)
			reward = 5000 * 0.08 + (salesAmount - 5000) * 0.1;
		else
			reward = 5000 * 0.08 + 5000 * 0.1 + (salesAmount - 10000) * 0.12;
		return reward;
	}

}
