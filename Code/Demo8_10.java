package myjava;

/**
 * @author wl
 * @date 创建时间：2018年5月10日下午3:27:29
 * @type 练习题
 */
public class Demo8_10 {

	public static void main(String[] args) {
		int[][] a = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = (int) (Math.random() * 2);
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		int max1 = 0, count1 = 0, maxRow = 0, maxColumn = 0;
		for (int i = 0; i < 4; i++) {
			count1 = 0;
			for (int j = 0; j < 4; j++)
				if (a[i][j] == 1)
					count1++;
			if (count1 > max1) {
				max1 = count1;
				maxRow = i;
			}
		}
		System.out.println("最多1的行是第" + (maxRow + 1) + "行");

		for (int j = 0; j < 4; j++) {
			count1 = 0;
			for (int i = 0; i < 4; i++)
				if (a[i][j] == 1)
					count1++;
			if (count1 > max1) {
				max1 = count1;
				maxColumn = j;
			}
		}
		System.out.println("最多1的列是第" + (maxColumn + 1) + "列");
	}

}
