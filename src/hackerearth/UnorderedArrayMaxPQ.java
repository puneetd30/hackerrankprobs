package hackerearth;

import java.io.BufferedReader;
import java.io.FileReader;

public class UnorderedArrayMaxPQ<Key extends Comparable<Key>> {
	private Key[] pq; // elements
	private int N; // number of elements

	// set inititial size of heap to hold size elements
	public UnorderedArrayMaxPQ(int capacity) {
		pq = (Key[]) new Comparable[capacity];
		N = 0;
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}

	public void insert(Key x) {
		pq[N++] = x;
	}

	public Key delMax() {
		int max = 0;
		for (int i = 0; i < N; i++)
			if (less(max, i))
				max = i;
		exch(max, N - 1);

		return pq[--N];
	}

	/***************************************************************************
	 * Helper functions.
	 ***************************************************************************/
	private boolean less(int i, int j) {
		return pq[i].compareTo(pq[j]) < 0;
	}

	private void exch(int i, int j) {
		Key swap = pq[i];
		pq[i] = pq[j];
		pq[j] = swap;
	}

	/***************************************************************************
	 * Test routine.
	 ***************************************************************************/
	public static void main(String[] args) {
		UnorderedArrayMaxPQ<String> pq = new UnorderedArrayMaxPQ<String>(10);
		// pq.insert("this");
		// pq.insert("is");
		// pq.insert("a");
		// pq.insert("test");
		System.out.println(String.format("%02X%02X%02X", 255, 0, 128));
		// System.out.println(-1/2);
		// while (!pq.isEmpty())
		// System.out.println(pq.delMax());

		int sum = 0;
		String name = "";
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(
					name));
			for (String s = bufferedReader.readLine(); s != null; s = bufferedReader.readLine()) {
				sum += Integer.parseInt(s);
			}
			bufferedReader.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
