package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��6������6:36:32
 * @type ��ϰ��
 */
public class Demo9_3 {

	public static void main(String[] args) {
		java.util.Date date = new java.util.Date();
		int count = 0;
		for (int i = 10000; count < 8; count++, i *= 10) {
			date.setTime(i);
			System.out.println(date.toString());
		}

	}

}
