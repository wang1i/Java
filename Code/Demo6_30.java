package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��4��25������4:50:30
 * @type ��ϰ��
 */
public class Demo6_30 {

	public static void main(String[] args) {
		int digit1 = (int) (Math.random() * 6 + 1);
		int digit2 = (int) (Math.random() * 6 + 1);
		if (digit1 + digit2 == 2 || digit1 + digit2 == 3 || digit1 + digit2 == 12) {
			System.out.println("��Ͷ����" + digit1 + " + " + digit2 + " = " + (digit1 + digit2));
			System.out.println("������");
			System.exit(1);
		} else if (digit1 + digit2 == 7 || digit1 + digit2 == 11) {
			System.out.println("��Ͷ����" + digit1 + " + " + digit2 + " = " + (digit1 + digit2));
			System.out.println("��Ӯ��");
			System.exit(1);
		} else {
			int point = digit1 + digit2;
			System.out.println("��Ͷ����" + digit1 + " + " + digit2 + " = " + (digit1 + digit2) + "\npoint = " + point);
			do {
				digit1 = (int) (Math.random() * 6 + 1);
				digit2 = (int) (Math.random() * 6 + 1);
			} while (digit1 + digit2 != 7 && digit1 + digit2 != point);
			if (digit1 + digit2 == 7)
				System.out.println("��Ͷ����" + digit1 + " + " + digit2 + " = " + (digit1 + digit2) + "\n������");
			else
				System.out.println("��Ͷ����" + digit1 + " + " + digit2 + " = " + (digit1 + digit2) + "\n��Ӯ��");
		}
	}

}
