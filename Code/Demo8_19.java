package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��11������11:54:57
 * @type ��ϰ��
 */
public class Demo8_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����ά���飺");
		int[][] a = new int[6][7];
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 7; j++)
				a[i][j] = input.nextInt();
		if (isConsecutiveFour(a))
			System.out.println("��ά������4�����������־�����ͬ��ֵ");
		else
			System.out.println("��ά����û��4�����������־�����ͬ��ֵ");

	}

	private static boolean isConsecutiveFour(int[][] a) {
		int flagR, flagC, flagD = 0, flagS = 0;
		for (int i = 0; i < 6; i++) {// ��
			flagR = 0;
			int r = a[i][0];
			for (int j = 0; j < 7; j++) {
				if (a[i][j] == r)
					flagR++;
				else {
					flagR = 1;
					r = a[i][j];
				}
				if (flagR == 4)
					return true;
			}
		}

		for (int j = 0; j < 7; j++) {// ��
			flagC = 0;
			int c = a[0][j];
			for (int i = 0; i < 6; i++) {
				if (a[i][j] == c)
					flagC++;
				else {
					flagC = 1;
					c = a[i][j];
				}
				if (flagC == 4)
					return true;
			}
		}

		int i = 0, j = 0;
		while (i < 6) {// ���Խ���������
			int t = i;
			flagD = 0;
			int d = a[i][0];
			while (i < 6 && j < 7) {
				if (a[i][j] == d)
					flagD++;
				else {
					d = a[i][j];
					flagD = 1;
				}
				i++;
				j++;
				if (flagD == 4)
					return true;
			}
			i = t + 1;
			j = 0;
		}

		i = 0;
		j = 1;
		while (j < 7) {// ���Խ���������
			int t = j;
			flagD = 0;
			int d = a[0][j];
			while (i < 6 && j < 7) {
				if (a[i][j] == d)
					flagD++;
				else {
					d = a[i][j];
					flagD = 1;
				}
				i++;
				j++;
				if (flagD == 4)
					return true;
			}
			j = t + 1;
			i = 0;
		}

		i = 0;
		j = 6;
		while (i < 6) {// ���Խ���������
			int t = i;
			flagS = 0;
			int d = a[i][6];
			while (i < 6 && j >= 0) {
				if (a[i][j] == d)
					flagS++;
				else {
					d = a[i][j];
					flagS = 1;
				}
				i++;
				j--;
				if (flagS == 4)
					return true;
			}
			i = t + 1;
			j = 6;
		}

		i = 0;
		j = 5;
		while (j >= 0) {// ���Խ���������
			int t = j;
			flagS = 0;
			int s = a[0][j];
			while (i < 6 && j >= 0) {
				if (a[i][j] == s)
					flagD++;
				else {
					s = a[i][j];
					flagS = 1;
				}
				i++;
				j--;
				if (flagS == 4)
					return true;
			}
			j = t - 1;
			i = 0;
		}
		return false;
	}

}
