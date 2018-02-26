package practice;

import java.io.IOException;

public class TestReader {

	public static void main(String[] args) throws IOException {

		/*
		 * Reader reader = new Reader();
		 * 
		 * int n_cases = reader.nextInt(); while (n_cases-- > 0) { int n =
		 * reader.nextInt(); int k = reader.nextInt(); int min = Integer.MAX_VALUE;
		 * while (n-- > 0) { min = Math.min(min, reader.nextInt()); }
		 * System.out.println(Math.max(0, k - min)); } reader.close();
		 */

		Reader reader = new Reader();

		int n_cases = reader.nextInt();
		while (n_cases-- > 0) {
			int e = reader.nextInt();
			int[] array = new int[e];
			for (int i = 0; i < e; i++) {
				array[i] = reader.nextInt();
			}
			int q = reader.nextInt();
			while (q-- > 0) {
				System.out.println(getLastIndexOf(array, reader.nextInt()));
			}
		}

	}

	private static int getLastIndexOf(int[] array, int e) {
		return -1;
	}

}
