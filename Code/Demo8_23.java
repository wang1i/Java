package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��13������12:12:18
 * @type ��ϰ��
 */
public class Demo8_23 {

	public static void main(String[] args) {
		int[][] a = new int[6][6];
		Scanner input = new Scanner(System.in);
		System.out.println("������6 * 6�ľ���");
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 6; j++)
				a[i][j] = input.nextInt();
		int row = 0, col = 0, countRow, countCol;
		for (int i = 0; i < 6; i++) {
			countRow = 0;
			for (int j = 0; j < 6; j++)
				if (a[i][j] == 1)
					countRow++;
			if (countRow % 2 != 0) {
				row = i;
				break;
			}
		}
		for (int j = 0; j < 6; j++) {
			countCol = 0;
			for (int i = 0; i < 6; i++)
				if (a[i][j] == 1)
					countCol++;
			if (countCol % 2 != 0) {
				col = j;
				break;
			}
		}
		System.out.println("���� " + row + "��" + col + "��");

	}

}
