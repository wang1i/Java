package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��7������3:23:31
 * @type ��ϰ��
 */
public class Demo7_23 {

	public static void main(String[] args) {
		boolean[] state = new boolean[100];
		for (int i = 0; i < 100; i++) {
			for (int m = i; m < 100; m += i + 1) {
				if (state[m])
					state[m] = false;
				else
					state[m] = true;
			}
		}
		int count = 0;
		for (int i = 0; i < 100; i++) {
			if (state[i])
				System.out.print("��  ");
			else
				System.out.print("��  ");
			count++;
			if (count % 10 == 0)
				System.out.println();
		}

	}

}
