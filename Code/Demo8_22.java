package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��12������8:30:10
 * @type ��ϰ��
 */
public class Demo8_22 {

	public static void main(String[] args) {
		int[][] a = new int[6][6];
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 6; j++)
				a[i][j] = (int) (Math.random() * 2);
		printArray(a);
		if (isDouble1(a))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	private static void printArray(int[][] a) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++)
				System.out.print(a[i][j] + "  ");
			System.out.println();
		}

	}

	private static boolean isDouble1(int[][] a) {
		int countRow, countCol, count = 0;
		for (int i = 0; i < 6; i++) {
			countRow = 0;
			countCol = 0;
			for (int j = 0; j < 6; j++) {
				if (a[i][j] == 1)
					countRow++;
				if (a[j][i] == 1)
					countCol++;
			}
			if (countRow % 2 == 0)
				count++;
			if (countCol % 2 == 0)
				count++;
		}
		if (count == 12)
			return true;
		return false;

	}
}
