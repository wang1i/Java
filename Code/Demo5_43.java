package myjava;

public class Demo5_43 {

	public static void main(String[] args) {
		int i, j, count = 0;
		for (i = 1; i <= 7; i++) {
			for (j = 1; j <= 7; j++)
				if (i < j) {
					System.out.print(i + " " + j + "\n");
					count++;
				}
		}
		System.out.println("�ܹ����������Ϊ��" + count + "��");

	}

}
