package myjava;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo12_23 {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
		Scanner input = new Scanner(url.openStream());
		ArrayList<String> list = new ArrayList<>();
		while (input.hasNext())
			list.add(input.next());
		input.close();
		double sum = 0, average;
		for (int i = 0; i < list.size(); i++) {
			sum += Double.parseDouble(list.get(i));
		}
		average = sum / list.size();
		System.out.println("总数：" + sum + "\n平均分：" + average);
	}

}
