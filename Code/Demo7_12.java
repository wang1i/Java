package myjava;

/**
 * @author wl
 * @date 创建时间：2018年5月6日上午11:07:20
 * @type 练习题
 */
public class Demo7_12 {

	public static void main(String[] args) {
		int i;
		int[] a = new int[100], b = new int[100], counts = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, };
		System.out.print("数组为：");
		for (i = 0; i < 10; i++) {
			a[i] = (int) (Math.random() * 10);
			counts[a[i]]++;
			System.out.print(a[i] + " ");
		}
		System.out.println();
		b = reverse(a, b);
		System.out.print("逆置为：");
		for (i = 0; i < 10; i++)
			System.out.print(b[i] + " ");
		System.out.println();
		for (i = 0; i < 10; i++)
			System.out.println(i + "出现" + counts[i] + "次");

	}

	private static int[] reverse(int[] a, int[] b) {
		for (int i = 9; i >= 0; i--)
			b[9 - i] = a[i];
		return b;
	}
}
