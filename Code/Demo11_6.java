package myjava;

import java.util.ArrayList;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��2������10:17:47
 * @type ��ϰ��
 */
public class Demo11_6 {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		list.add(new Tax());
		list.add(new MyDate());
		list.add(new Circle2D());
		for (Object e : list)
			System.out.println(e.toString());
	}

}
