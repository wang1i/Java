package myjava;

import java.util.ArrayList;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��2������10:53:28
 * @type ��ϰ��
 */
public class Demo11_7 {

	public static void shuffle(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int random = (int) (Math.random() * list.size());
			Integer temp = list.get(i);
			list.set(i, list.get(random));
			list.set(random, temp);
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(new Integer(9));
		list.add(new Integer(89));
		list.add(new Integer(77));
		shuffle(list);
		for (Integer e : list)
			System.out.print(e + "\t");

	}

}
