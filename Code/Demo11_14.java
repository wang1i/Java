package myjava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��2������8:39:20
 * @type ��ϰ��
 */
public class Demo11_14 {

	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		for (int i = 0; i < list2.size(); i++) {
			int count = 0;
			for (int j = 0; j < list1.size(); j++)
				if (list2.get(i).intValue() != list1.get(j).intValue())
					count++;
			if (count == list1.size())
				list1.add(list2.get(i));
		}
		return list1;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.print("���������б�1��");
		for (int i = 0; i < 5; i++)
			list1.add(new Integer(input.nextInt()));
		System.out.print("���������б�2��");
		for (int i = 0; i < 5; i++)
			list2.add(new Integer(input.nextInt()));
		ArrayList<Integer> list = union(list1, list2);
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
	}

}
