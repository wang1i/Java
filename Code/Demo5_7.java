package myjava;

public class Demo5_7 {

	public static void main(String[] args) {
		double tuition = 10000;
		for(int i = 1 ; i <= 10 ; i ++) {
			tuition = tuition * 1.05;
		}
		System.out.println("10����ѧ��Ϊ��" + tuition );
		double totalTuition = tuition;
		for(int j = 1 ; j <= 3 ; j ++) {
			totalTuition += tuition * 1.05;
		}
		System.out.println("10����4����ѧ��Ϊ��" + totalTuition);	

	}

}
