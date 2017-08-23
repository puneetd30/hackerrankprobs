import java.util.LinkedList;

public class LinkedListProb {
	LinkedList<Integer> evenList = new LinkedList<>();
	LinkedList<Integer> oddList = new LinkedList<>();

	void evenAndOddList(LinkedList<Integer> inputList) {

		for (int start = 0, end = inputList.size() - 1; start < inputList
				.size() && end >= 0; start++, end--) {
			if (inputList.get(start) % 2 == 0) {
				evenList.add(inputList.get(start));
			}
			if (inputList.get(end) % 2 != 0)
				oddList.add(inputList.get(end));
		}
	}
}
