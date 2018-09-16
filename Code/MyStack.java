package myjava;

import java.util.ArrayList;

/**
 * @author wl
 * @date 创建时间：2018年7月2日下午7:18:42
 * @type 练习题
 */
public class MyStack {
	private ArrayList<Object> stack;
	private int top;

	public MyStack() {
		stack = new ArrayList<>();
		top = -1;
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}

	public Object getTop() {
		return stack.get(top);
	}

	public void push(Object e) {
		top++;
		stack.add(e);
	}

	public Object pop() {
		Object e = stack.get(top);
		stack.remove(top);
		top--;
		return e;
	}
}
