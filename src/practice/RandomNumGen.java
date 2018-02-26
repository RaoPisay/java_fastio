package practice;

import java.util.Random;

public class RandomNumGen {
	public static void main(String[] args) {

		Random random = new Random();
		int from = 0;
		int range = 6;
		for (int i = 0; i < 25; i++) {
			if (i % 6 == 0) {
				from = i+1;
				System.out.println();
			}
			System.out.print(random.nextInt(range + 1) + from + " ");
		}
	}
}
