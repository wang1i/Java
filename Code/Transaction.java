package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��2������11:23:21
 * @type ��ϰ��
 */
public class Transaction {
	private java.util.Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;

	public Transaction(java.util.Date date, char type, double amount, double balance, String description) {
		this.date = date;
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}

	public java.util.Date getDate() {
		return date;
	}

	public char getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	public double getBalance() {
		return balance;
	}

	public String getDescription() {
		return description;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public void setType(char type) {
		this.type = type;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "����ʱ�䣺" + date + "\t�������ͣ�" + type + "\t��������" + amount + "\t���׺���" + balance + "\t����������" + description;
	}
}
