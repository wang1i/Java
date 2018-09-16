package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月15日上午7:16:19
 * @type 练习题
 */
public class Demo10_8 {

	public static void main(String[] args) {
		double[][] brackets1 = { { 0, 0, 0, 0 }, { 8351, 16701, 8351, 11951 }, { 33951, 67901, 33951, 45501 },
				{ 52251, 137051, 68526, 117451 }, { 171551, 208851, 104426, 190201 } };
		double[] rates1 = { 10, 15, 25, 28, 33 };
		double[][] brackets2 = { { 0, 0, 0, 0 }, { 27051, 45201, 22601, 36251 }, { 65551, 109251, 54626, 93651 },
				{ 136751, 166501, 83251, 151651 }, { 297351, 297351, 148676, 297351 } };
		double[] rates2 = { 15, 27.5, 30.5, 35.5, 39.1 };
		double taxableIncome = 50000;
		int fillingStatus = 0;
		Tax t1 = new Tax(fillingStatus, brackets1, rates1, taxableIncome);
		Tax t2 = new Tax(fillingStatus, brackets2, rates2, taxableIncome);
		System.out.println("表一：\n");
		for (fillingStatus = 0; fillingStatus < 4; fillingStatus++) {
			for (taxableIncome = 50000; taxableIncome < 60000; taxableIncome += 1000) {
				t1.setFillingStatus(fillingStatus);
				t1.setTaxableIncome(taxableIncome);
				System.out.print(t1.getTax() + "\t");
			}
			System.out.println();
		}
		System.out.println("\n\n表二：\n");
		for (fillingStatus = 0; fillingStatus < 4; fillingStatus++) {
			for (taxableIncome = 50000; taxableIncome < 60000; taxableIncome += 1000) {
				t2.setFillingStatus(fillingStatus);
				t2.setTaxableIncome(taxableIncome);
				System.out.print(t2.getTax() + "\t");
			}
			System.out.println();
		}
	}

}