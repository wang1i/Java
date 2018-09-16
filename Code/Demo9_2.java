package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��2������11:49:37
 * @type ��ϰ��
 */
public class Demo9_2 {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;

	public static void main(String[] args) {
		Demo9_2 stock = new Demo9_2();
		stock.currentPrice = 34.35;
		System.out.println("��ֵ�仯��" + stock.getChangePercent());
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
