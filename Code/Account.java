package myjava;

import java.util.Date;

/**
 * @author wl
 * @date 创建时间：2018年6月8日上午10:02:16
 * @type 练习题
 */
public class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double annualInterestRate() {
		return annualInterestRate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	public Date dateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 1200;
	}

	public void withDraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public String toString() {
		return "账户：" + id + "\n余额：" + balance + "\n开户时间" + dateCreated.toString();
	}
}
