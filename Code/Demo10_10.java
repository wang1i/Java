package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��19������9:54:15
 * @type ��ϰ��
 */
public class Demo10_10 {

	public static void main(String[] args) {
		Queen q = new Queen();
		for (int i = 0; i <= 20; i++)
			q.enqueen(i);
		for (int i = 0; i <= 20; i++)
			System.out.print(q.dequeen() + "\t");
	}
}
