package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��6������11:07:20
 * @type ��ϰ��
 */
public class Demo7_12 {

	public static void main(String[] args) {
		int i;
		int[] a = new int[100], b = new int[100], counts = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, };
		System.out.print("����Ϊ��");
		for (i = 0; i < 10; i++) {
			a[i] = (int) (Math.random() * 10);
			counts[a[i]]++;
			System.out.print(a[i] + " ");
		}
		System.out.println();
		b = reverse(a, b);
		System.out.print("����Ϊ��");
		for (i = 0; i < 10; i++)
			System.out.print(b[i] + " ");
		System.out.println();
		for (i = 0; i < 10; i++)
			System.out.println(i + "����" + counts[i] + "��");

	}

	private static int[] reverse(int[] a, int[] b) {
		for (int i = 9; i >= 0; i--)
			b[9 - i] = a[i];
		return b;
	}
}
