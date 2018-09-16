package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月2日下午11:49:37
 * @type 练习题
 */
public class Demo9_2 {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;

	public static void main(String[] args) {
		Demo9_2 stock = new Demo9_2();
		stock.currentPrice = 34.35;
		System.out.println("市值变化：" + stock.getChangePercent());
	}

	public Demo9_2() {
		symbol = "ORCL";
		name = "Oracle Corporation";
		previousClosingPrice = 34.5;
	}

	public double getChangePercent() {
		return (currentPrice - previousClosingPrice) / previousClosingPrice;
	}

}
