package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��9������6:51:06
 * @type ��ϰ��
 */
public class Demo8_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������Ա��ʱ��");
		int[][] time = new int[8][7];
		int[] em = new int[8];
		int k = 0;
		int[] flag = new int[8];
		for (int i = 0; i < 8; i++) {
			int timeTotal = 0;
			for (int j = 0; j < 7; j++) {
				time[i][j] = input.nextInt();
				timeTotal += time[i][j];
			}
			em[k++] = timeTotal;
		}
		for (int i = 0; i < k - 1; i++) {
			int max = -1, maxj = -1;
			for (int j = 0; j < k; j++)
				if (em[j] > max && flag[j] == 0) {
					max = em[j];
					maxj = j;
				}
			flag[maxj] = 1;
			System.out.println("��" + (i + 1) + "����Ա��" + maxj + "��" + "�ܹ�ʱ��" + em[maxj]);
		}

	}

}
