package practice;

public class BitWiseTest {
	public static void main(String[] args) {
		int bff = 1 << 16; // means 2^16
		System.out.println(bff);
		int cff = 1 >> 16; // 0
		cff = 2 >> 16;
		System.out.println(cff);
	}
}
