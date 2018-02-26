package practice;

import java.io.IOException;

public class IOPerformance {

	public static void main(String[] args) throws Exception {
		IOPerformance ioP = new IOPerformance();

		{
			int testCases = ioP.readInt_v2();
			int k = ioP.readIntAtIndex_v2(1);
			int min = ioP.getMinInt_v2();
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

	public int[] readInts(int size) throws IOException {
		int[] ints = new int[size];
		int ret = 0;
		int count = 0;
		boolean dig = false;
		int aByte = System.in.read();
		while (-1 != aByte) {
			if (aByte == 32) {
				ints[count++] = ret;
				ret = 0;
				dig = false;
				aByte = System.in.read();
				continue;
			} else if (aByte >= '0' && aByte <= '9') {
				dig = true;
				ret = ret * 10 + aByte - '0';
			} else if (dig) {
				break;
			}
			aByte = System.in.read();
		}
		ints[count++] = ret;
		return ints;
	}

	@Deprecated
	public int readInt() throws IOException {
		int ret = 0;
		boolean dig = false;
		int aByte = System.in.read();
		while (-1 != aByte) {
			if (aByte >= '0' && aByte <= '9') {
				dig = true;
				ret = ret * 10 + aByte - '0';
			} else if (dig) {
				break;
			}
			aByte = System.in.read();
		}
		return ret;
	}

	@Deprecated
	public int readIntAtIndex(int index) throws Exception {
		int val = 0;
		int count = 0;
		boolean dig = false;
		int aByte = System.in.read();
		while (-1 != aByte) {
			if (aByte == 32) {
				count++;
				aByte = System.in.read();
				continue;
			}
			if (count == index) {
				if (aByte >= '0' && aByte <= '9') {
					dig = true;
					val = val * 10 + aByte - '0';
				} else if (dig) {
					return val;
				}
			}
			aByte = System.in.read();
		}
		return val;
	}

	@Deprecated
	public int getMinInt() throws IOException {
		int min = Integer.MAX_VALUE;
		int val = 0;
		boolean dig = false;
		int aByte = System.in.read();
		while (-1 != aByte) {
			if (aByte == 32) {
				min = Math.min(min, val);
				val = 0;
				dig = false;
				aByte = System.in.read();
				continue;
			} else if (aByte >= '0' && aByte <= '9') {
				dig = true;
				val = val * 10 + aByte - '0';
			} else if (dig) {
				break;
			}
			aByte = System.in.read();
		}
		return Math.min(min, val);
	}

}
