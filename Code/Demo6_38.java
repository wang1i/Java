package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��4��25������10:22:17
 * @type ��ϰ��
 */
public class Demo6_38 {

	public static void main(String[] args) {
		int count = 0;
		char ch;
		while (count < 100) {
			ch = (char) (Math.random() * 26 + 'A');
			System.out.print(ch + "  ");
			count++;
			if (count % 10 == 0)
				System.out.println();
		}

	}

}
