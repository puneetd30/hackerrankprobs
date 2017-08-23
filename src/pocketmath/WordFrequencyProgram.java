package pocketmath;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class WordFrequencyProgram {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] wordsArr = line.split(",");
		if (wordsArr.length == 0) {
			System.out.println(0);
		}
		Arrays.sort(wordsArr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		int count = 0;
		WordFrequency[] uniqueArr = new WordFrequency[wordsArr.length];
		int uniqueArrCount = 0;
		for (int i = 0; i < wordsArr.length; i++) {

			if ((i + 1) < wordsArr.length
					&& wordsArr[i].equals(wordsArr[i + 1])) {
				count++;
			} else {
				count++;
				WordFrequency wordFrequency = new WordFrequency();
				wordFrequency.frequency = count;
				wordFrequency.word = wordsArr[i];
				uniqueArr[uniqueArrCount++] = wordFrequency;
				count = 0;
			}
		}

		Arrays.sort(uniqueArr, new Comparator<WordFrequency>() {
			@Override
			public int compare(WordFrequency o1, WordFrequency o2) {
				if (o1 != null && o2 != null) {
					return o2.frequency - o1.frequency;
				} else {
					return 0;
				}
			}
		});

		for (int j = 0; j < uniqueArr.length; j++) {
			if (uniqueArr[j] != null) {
				System.out.println(uniqueArr[j].word + " "
						+ uniqueArr[j].frequency);
			}
		}
	}

	static class WordFrequency {
		String word;
		int frequency;
	}
}
