package myjava;

import java.util.Arrays;

/**
 * @author wl
 * @date 创建时间：2018年6月19日下午10:03:36
 * @type 练习题
 */
public class Queen {
	private int[] element;
	private int size;
	private int front;
	private int rear;
	private int num;

	public Queen() {
		size = 8;
		element = new int[size];
		front = rear = 0;
		num = 0;
	}

	public void enqueen(int v) {
		if (rear < size)
			element[rear++] = v;
		else {
			size *= 2;
			element = Arrays.copyOf(element, size);
			element[rear++] = v;
		}
	}

	public int dequeen() {
		int x = element[front];
		for (int i = front + 1; i < rear; i++) {
			element[i - 1] = element[i];
		}
		rear--;
		return x;
	}

	public boolean empty() {
		if (front == rear)
			return true;
		return false;
	}

	public int getSize() {
		return size;
	}
}
