package myjava;

public class Demo6_9 {

	public static void main(String[] args) {
		double foot, meter;
		System.out.println("Ó¢³ß          Ã×                    Ã×          Ó¢³ß");
		for (foot = 1, meter = 20; foot <= 10 && meter <= 65; foot += 1, meter += 5) {
			System.out.printf("%5.2f%12.3f", foot, footToMeter(foot));
			System.out.printf("%20.2f%12.3f", meter, meterToFoot(meter));
			System.out.println();
		}

	}

	private static double footToMeter(double foot) {
		return 0.305 * foot;
	}

	private static double meterToFoot(double meter) {
		return 3.279 * meter;
	}

}
