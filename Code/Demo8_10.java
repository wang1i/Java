package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��10������3:27:29
 * @type ��ϰ��
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
		System.out.println("���1�����ǵ�" + (maxRow + 1) + "��");

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
		System.out.println("���1�����ǵ�" + (maxColumn + 1) + "��");
	}

}
