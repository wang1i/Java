package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��14������11:52:03
 * @type ��ϰ��
 */
public class Demo10_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int id, choice;
		do {
			System.out.print("������һ��id��");
			id = input.nextInt();
		} while (id < 0 && id > 9);
		Account ac = new Account(id, 100);
		ac.setAnnualInterestRate(4.5);
		do {
			System.out.print("\n���˵�\n1���鿴���\n2��ȡ��\n3�����\n4���˳�\n");
			System.out.print("���������ѡ�");
			do {
				choice = input.nextInt();
				if (choice == 1)
					System.out.println("���Ϊ��" + ac.getBalance());
				else if (choice == 2) {
					System.out.print("������ȡ���");
					double amount = input.nextDouble();
					ac.withDraw(amount);
				} else if (choice == 3) {
					System.out.print("���������");
					double amount = input.nextDouble();
					ac.deposit(amount);
				} else if (choice != 4)
					System.out.print("����ѡ���������������룺");
			} while (choice < 0 || choice > 4);
		} while (choice != 4);
		System.out.print("\n���������id��");
	}

}
