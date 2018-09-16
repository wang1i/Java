package myjava;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author wl
 * @date 创建时间：2018年7月2日上午11:19:50
 * @type 练习题
 */
public class Account1 {
	private String name;
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	private ArrayList<Transaction> transaction;

	public Account1() {

	}

	public Account1(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
		transaction = new ArrayList<>();
		dateCreated = new Date();
	}

	public String getName() {
		return name;
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

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date dateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 1200;
	}

	public void withDraw(double amount) {
		balance -= amount;
		transaction.add(new Transaction(new Date(), 'W', amount, balance, "取款"));
	}

	public void deposit(double amount) {
		balance += amount;
		transaction.add(new Transaction(new Date(), 'D', amount, balance, "存款"));
	}

	@Override
	public String toString() {
		String s1 = "账户：" + id + "\n余额：" + balance + "\n开户时间" + dateCreated.toString() + "\n交易纪录：";
		for (int i = 0; i < transaction.size(); i++)
			s1 += "\n" + transaction.get(i).toString();
		return s1;
	}
}
