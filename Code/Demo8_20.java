package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��11������4:37:43
 * @type ��ϰ��
 */
public class Demo8_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[][] chess = new char[6][7];
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 7; j++)
				chess[i][j] = ' ';
		printChess(chess);
		while (!full(chess)) {
			System.out.print("Rѡ������ �У�");
			int m = input.nextInt();
			System.out.print("Rѡ������ �У�");
			int n = input.nextInt();
			chess[m][n] = 'R';
			printChess(chess);
			if (victor(chess, 'R') || full(chess))
				break;
			System.out.print("Yѡ������ �У�");
			m = input.nextInt();
			System.out.print("Yѡ������ �У�");
			n = input.nextInt();
			chess[m][n] = 'Y';
			printChess(chess);
			if (victor(chess, 'Y') || full(chess))
				break;
		}
		if (victor(chess, 'R'))
			System.out.println("Rѡ�ֻ�ʤ");
		if (victor(chess, 'Y'))
			System.out.println("Yѡ�ֻ�ʤ");
		if (full(chess))
			System.out.println("ƽ��");

	}

	private static boolean full(char[][] chess) {
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 7; j++)
				if (chess[i][j] == ' ')
					return false;
		return true;
	}

	private static void printChess(char[][] chess) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++)
				System.out.print("|" + chess[i][j]);
			System.out.println("|");
		}
		System.out.println("----------");
	}

	private static boolean victor(char[][] chess, char c) {
		int flagR, flagC, flagD = 0, flagS = 0;
		for (int i = 0; i < 6; i++) {// ��
			flagR = 0;
			for (int j = 0; j < 7; j++) {
				if (chess[i][j] == c)
					flagR++;
				if (flagR == 4)
					return true;
			}
		}

		for (int j = 0; j < 7; j++) {// ��
			flagC = 0;
			for (int i = 0; i < 6; i++) {
				if (chess[i][j] == c)
					flagC++;
				if (flagC == 4)
					return true;
			}
		}

		int i = 0, j = 0;
		while (i < 6) {// ���Խ���������
			int t = i;
			flagD = 0;
			while (i < 6 && j < 7) {
				if (chess[i][j] == c)
					flagD++;
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
			while (i < 6 && j < 7) {
				if (chess[i][j] == c)
					flagD++;
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
			while (i < 6 && j >= 0) {
				if (chess[i][j] == c)
					flagS++;
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
			while (i < 6 && j >= 0) {
				if (chess[i][j] == c)
					flagD++;
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
