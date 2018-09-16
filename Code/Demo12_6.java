package myjava;

import java.util.Scanner;

public class Demo12_6 {

	public static void main(String[] args) {
		String hex;
		System.out.print("����һ��ʮ�������ַ�����");
		try (Scanner input = new Scanner(System.in);) {
			hex = input.next();
		}
		try {
			System.out.println("��Ӧ��ʮ����Ϊ��" + hexToDec(hex));
		} catch (HexFormatException ex) {
			System.out.println("�ַ�����ʽ����");
			ex.printStackTrace();
		}
	}

	private static int hexToDec(String hex) throws HexFormatException {
		int sum = 0;
		for (int i = 0; i < hex.length(); i++) {
			if (hex.charAt(i) >= '0' && hex.charAt(i) <= '9')
				sum = sum * 16 + hex.charAt(i) - '0';
			else if (hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F')
				sum = sum * 16 + hex.charAt(i) - 'A' + 10;
			else if (hex.charAt(i) >= 'a' && hex.charAt(i) <= 'f')
				sum = sum * 16 + hex.charAt(i) - 'a' + 10;
			else
				throw new HexFormatException("�´���Ժò��ã�������");
		}
		return sum;
	}

}
