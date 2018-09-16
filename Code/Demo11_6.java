package myjava;

import java.util.ArrayList;

/**
 * @author wl
 * @date 创建时间：2018年7月2日上午10:17:47
 * @type 练习题
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
