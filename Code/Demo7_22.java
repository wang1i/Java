package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��7������2:43:08
 * @type ��ϰ��
 */
public class Demo7_22 {

	public static void main(String[] args) {
		Empress a = new Empress();
		a.find(0);
		System.out.println("�˻ʺ����⹲�У�" + a.map + "�ֿ���");
	}
}

class Empress {
	public int[][] arry = new int[8][8]; // ���̣��Żʺ�
	public int map = 0; // �洢�������

	public boolean rule(int arry[][], int k, int j) { // �жϽڵ��Ƿ����
		for (int i = 0; i < 8; i++) { // ���г�ͻ
			if (arry[i][j] == 1)
				return false;
		}
		for (int i = k - 1, m = j - 1; i >= 0 && m >= 0; i--, m--) { // ��Խ���
			if (arry[i][m] == 1)
				return false;
		}
		for (int i = k - 1, m = j + 1; i >= 0 && m <= 7; i--, m++) { // �ҶԽ���
			if (arry[i][m] == 1)
				return false;
		}
		return true;
	}

	public void find(int i) { // Ѱ�һʺ�ڵ�
		if (i > 7) { // �˻ʺ��
			map++;
			print();
			return;
		}
		for (int m = 0; m < 8; m++) { // �������,�ݹ��㷨
			if (rule(arry, i, m)) {
				arry[i][m] = 1;
				find(i + 1);
				arry[i][m] = 0;
			}
		}
	}

	public void print() { // ��ӡ�������
		System.out.print("����" + map + ":");
		for (int i = 0; i < 8; i++) {
			for (int m = 0; m < 8; m++) {
				if (arry[i][m] == 1) {
					System.out.print("�ʺ�" + (i + 1) + "�ڵ�" + i + "�У���" + m + "��\t");

				}
			}
		}
		System.out.println();
	}

}
