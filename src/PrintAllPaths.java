import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.pd.ds.BinaryTreeNode;

public class PrintAllPaths {

	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode();
		root.setVal(4);

		//left node
		BinaryTreeNode node1 = new BinaryTreeNode();
		node1.setVal(4);
		root.setLeft(node1);

		BinaryTreeNode node4 = new BinaryTreeNode();
		node4.setVal(4);
		node1.setLeft(node4);

		BinaryTreeNode node5 = new BinaryTreeNode();
		node5.setVal(5);
		node4.setLeft(node5);

		
		//right node
//		BinaryTreeNode node2 = new BinaryTreeNode();
//		node2.setVal(4);
//		root.setRight(node2);

//		BinaryTreeNode node3 = new BinaryTreeNode();
//		node3.setVal(6);
//		node2.setRight(node3);
//
//		BinaryTreeNode node6 = new BinaryTreeNode();
//		node6.setVal(1);
//		node2.setLeft(node6);

		solution(root);
	}

	public static void solution(BinaryTreeNode node) {
		int[] path = new int[256];// this has to change
		System.out.println(solutionRecur(node, path, 0, -1));

	}

	private static int solutionRecur(BinaryTreeNode node, int[] path, int pathLen, int max) {
		if (node == null) {
			return max;
		}

		path[pathLen] = node.getVal();
		pathLen++;

		if (node.getLeft() == null && node.getRight() == null) {
			printArray(path, pathLen);
			List<Integer> ints = new ArrayList<>(pathLen);

			Set<Integer> set = new HashSet<>(pathLen);

			for (int i = 0; i < pathLen; i++) {
				ints.add(path[i]);
			}

			set.addAll(ints);

			if (max < set.size()) {
				return set.size();
			}

			return max;
		} else {
			int max1 = solutionRecur(node.getLeft(), path, pathLen, max);
			return solutionRecur(node.getRight(), path, pathLen, max1);

		}

	}

	private static void printArray(int[] ints, int len) {
		for (int i = 0; i < len; i++) {

			System.out.print(ints[i] + " ");
		}

		System.out.println();

	}

}
