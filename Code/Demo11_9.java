package myjava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��2������1:35:14
 * @type ��ϰ��
 */
public class Demo11_9 {

	public static void main(String[] args) {
		ArrayList<Integer> row = new ArrayList<>();
		ArrayList<Integer> col = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("��������������");
		int n = input.nextInt();
		int[][] a = new int[n][n];
		System.out.println("���" + n + "�׾���Ϊ��");
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				int t = (int) (Math.random() * 2);
				a[i][j] = t;
				System.out.print(t);
				if (t == 1)
					count++;
			}
			row.add(new Integer(count));
			System.out.println();
		}
		for (int j = 0; j < n; j++) {
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (a[i][j] == 1)
					count++;
			}
			col.add(new Integer(count));
		}
		int max = -1;
		int maxi = 0;
		for (int i = 0; i < row.size(); i++)
			if (row.get(i) > max) {
				max = row.get(i);
				maxi = i;
			}
		max = -1;
		int maxj = 0;
		for (int j = 0; j < row.size(); j++)
			if (col.get(j) > max) {
				max = col.get(j);
				maxj = j;
			}
		System.out.println("���1���У�" + maxi);
		System.out.println("���1���У�" + maxj);
	}

}
