package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��7������11:15:10
 * @type ��ϰ��
 */
public class Demo7_29 {

	public static void main(String[] args) {
		int[] suit = new int[4];
		int sum = 0, picks = 0;
		while (sum != 24) {
			sum = 0;
			for (int i = 0; i < 4; i++) {
				suit[i] = (int) (Math.random() * 13) + 1;
				picks++;
				sum += suit[i];
			}
		}
		for (int i = 0; i < 4; i++)
			System.out.print(suit[i] + "\t");
		System.out.println("ѡ��" + picks + "��");

	}

}
