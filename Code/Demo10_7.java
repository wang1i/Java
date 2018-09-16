package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年6月14日下午11:52:03
 * @type 练习题
 */
public class Demo10_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int id, choice;
		do {
			System.out.print("请输入一个id：");
			id = input.nextInt();
		} while (id < 0 && id > 9);
		Account ac = new Account(id, 100);
		ac.setAnnualInterestRate(4.5);
		do {
			System.out.print("\n主菜单\n1：查看余额\n2：取款\n3：存款\n4：退出\n");
			System.out.print("请输入你的选项：");
			do {
				choice = input.nextInt();
				if (choice == 1)
					System.out.println("余额为：" + ac.getBalance());
				else if (choice == 2) {
					System.out.print("请输入取款金额：");
					double amount = input.nextDouble();
					ac.withDraw(amount);
				} else if (choice == 3) {
					System.out.print("请输入存款金额：");
					double amount = input.nextDouble();
					ac.deposit(amount);
				} else if (choice != 4)
					System.out.print("输入选项有误，请重新输入：");
			} while (choice < 0 || choice > 4);
		} while (choice != 4);
		System.out.print("\n请输入你的id：");
	}

}
