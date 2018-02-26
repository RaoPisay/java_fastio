package practice;

import java.io.DataInputStream;
import java.io.IOException;

public class MicroArray {

	public static void main(String[] args) throws IOException {
		Reader sc = new Reader();
		int n = sc.nextInt();

		while (n-- > 0) {
			int l = sc.nextInt();
			int lvl = sc.nextInt();
			int min = getMinNum(sc, l);
			System.out.println(Math.max(0, lvl - min));
		}
	}

	static int getMinNum(Reader sc, int l) throws IOException {
		int min = 2100000000;
		int nextNum = 0;
		for (int i = 0; i < l; i++) {
			nextNum = sc.nextInt();
			if (nextNum < min)
				min = nextNum;
		}
		return min;
	}

	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}

}