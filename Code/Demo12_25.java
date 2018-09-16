package myjava;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Demo12_25 {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
		Scanner input = new Scanner(url.openStream());
		double sumOfAssistant = 0;
		double sumOfAssociate = 0;
		double sumOfFull = 0;
		int numOfAssistant = 0;
		int numOfAssociate = 0;
		int numOfFull = 0;
		while (input.hasNextLine()) {
			String line = input.nextLine();
			if (line.contains("assistant"))
				numOfAssistant++;
			if (line.contains("associate"))
				numOfAssociate++;
			if (line.contains("full"))
				numOfFull++;
			sumOfAssistant += sum(line, "assistant");
			sumOfAssociate += sum(line, "associate");
			sumOfFull += sum(line, "full");
		}
		input.close();
		System.out.println("助理教授总薪水：" + sumOfAssistant + "\t平均薪水：" + (sumOfAssistant / numOfAssistant));
		System.out.println("副教授总薪水：" + sumOfAssociate + "\t平均薪水：" + (sumOfAssociate / numOfAssociate));
		System.out.println("正教授总薪水：" + sumOfFull + "   \t平均薪水：" + (sumOfFull / numOfFull));
	}

	private static double sum(String line, String post) {
		if (line.contains(post)) {
			int i;
			for (i = line.length() - 1; line.charAt(i) != ' '; i--)
				;
			return Double.parseDouble(line.substring(i + 1));
		}
		return 0;
	}

}
