package myjava;

import java.util.Date;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��8������10:02:16
 * @type ��ϰ��
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
		return "�˻���" + id + "\n��" + balance + "\n����ʱ��" + dateCreated.toString();
	}
}
