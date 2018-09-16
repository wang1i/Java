package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年5月11日下午4:37:43
 * @type 练习题
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
			System.out.print("R选手落子 行：");
			int m = input.nextInt();
			System.out.print("R选手落子 列：");
			int n = input.nextInt();
			chess[m][n] = 'R';
			printChess(chess);
			if (victor(chess, 'R') || full(chess))
				break;
			System.out.print("Y选手落子 行：");
			m = input.nextInt();
			System.out.print("Y选手落子 列：");
			n = input.nextInt();
			chess[m][n] = 'Y';
			printChess(chess);
			if (victor(chess, 'Y') || full(chess))
				break;
		}
		if (victor(chess, 'R'))
			System.out.println("R选手获胜");
		if (victor(chess, 'Y'))
			System.out.println("Y选手获胜");
		if (full(chess))
			System.out.println("平局");

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
		for (int i = 0; i < 6; i++) {// 行
			flagR = 0;
			for (int j = 0; j < 7; j++) {
				if (chess[i][j] == c)
					flagR++;
				if (flagR == 4)
					return true;
			}
		}

		for (int j = 0; j < 7; j++) {// 列
			flagC = 0;
			for (int i = 0; i < 6; i++) {
				if (chess[i][j] == c)
					flagC++;
				if (flagC == 4)
					return true;
			}
		}

		int i = 0, j = 0;
		while (i < 6) {// 正对角线下三角
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
		while (j < 7) {// 正对角线上三角
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
		while (i < 6) {// 反对角线下三角
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
		while (j >= 0) {// 反对角线上三角
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
