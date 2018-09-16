package myjava;

public class Demo5_40 {

	public static void main(String[] args) {
		int count1 = 0, count2 = 0, coin;
		for (int i = 0; i < 1e6; i++) {
			coin = (int) (Math.random() * 2);
			if (coin == 0)
				count1++;
			if (coin == 1)
				count2++;
		}
		System.out.println("正面" + count1 + "次");
		System.out.println("反面" + count2 + "次");

	}

}
