package practice;

import java.io.IOException;

class TestClass {
	public static void main(String args[]) throws Exception {
		TestClass testClass = new TestClass();
		int nCases = testClass.readInt_v2();
		for (int i = 0; i < nCases; i++) {
			int k = testClass.readIntAtIndex_v2(1);
			int min = testClass.getMinInt_v2();
			System.out.println(Math.max(0, k - min));
		}
	}

	public int readInt_v2() throws IOException {
		int ret = 0;
		int aByte = System.in.read();
		while (-1 != aByte && 13 != aByte) {
			ret = ret * 10 + aByte - '0';
			aByte = System.in.read();
		}
		return ret;
	}

	public int getMinInt_v2() throws IOException {
		int min = Integer.MAX_VALUE;
		int val = 0;
		System.in.read();
		int aByte = System.in.read();
		while (-1 != aByte && 13 != aByte) {
			if (aByte == 32) {
				min = Math.min(min, val);
				val = 0;
				aByte = System.in.read();
				continue;
			} else {
				val = val * 10 + aByte - '0';
			}
			aByte = System.in.read();
		}
		return Math.min(min, val);
	}

	public int readIntAtIndex_v2(int index) throws Exception {
		int val = 0;
		int count = 0;
		int aByte = System.in.read();
		while (-1 != aByte && 13 != aByte) {
			if (aByte == 32) {
				if (count == index) {
					break;
				}
				count++;
				aByte = System.in.read();
				continue;
			}
			if (count == index) {
				val = val * 10 + aByte - '0';
			}
			aByte = System.in.read();
		}
		return val;
	}

}
