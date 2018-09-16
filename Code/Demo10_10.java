package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月19日下午9:54:15
 * @type 练习题
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
