package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月15日上午7:16:32
 * @type 练习题
 */
public class Tax {
	public static final int S = 0;
	public static final int MJ = 1;
	public static final int MS = 2;
	public static final int H = 3;
	private int fillingStatus;
	private double[][] brackets;
	private double[] rates;
	private double taxableIncome;

	public Tax() {
		this.brackets = new double[5][4];
		this.rates = new double[5];
	}

	public Tax(int fillingStatus, double[][] brackets, double[] rates, double taxableIncome) {
		this.fillingStatus = fillingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}

	public int getFillingStatus() {
		return fillingStatus;
	}

	public void setFillingStatus(int fillingStatus) {
		this.fillingStatus = fillingStatus;
	}

	public double[][] getBrackets() {
		return brackets;
	}

	public void setBrackets(double[][] brackets) {
		this.brackets = brackets;
	}

	public double[] getRates() {
		return rates;
	}

	public void setRates(double[] rates) {
		this.rates = rates;
	}

	public double getTaxableIncome() {
		return taxableIncome;
	}

	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}

	public double getTax() {
		int i;
		double tax = 0;
		for (i = 0; brackets[i + 1][fillingStatus] < taxableIncome && i < 4; i++) {
			tax += (brackets[i + 1][fillingStatus] - brackets[i][fillingStatus]) * rates[i] / 100;
		}
		tax += (taxableIncome - brackets[i][fillingStatus]) * rates[i] / 100;
		return tax;
	}
}
