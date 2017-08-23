package com.prep;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.pd.ds.BinaryTreeNode;


class Tree {
	  public int x;
	  public Tree l;
	  public Tree r;
	}

public class PrintAllPaths {

	public static void main(String[] args) {
		Tree root = new Tree();
		root.x=4;

		//left node
		Tree node1 = new Tree();
		node1.x=4;
		root.l=node1;

		Tree node4 = new Tree();
		node4.x=4;
		node1.l=node4;

		Tree node5 = new Tree();
		node5.x=5;
		node4.l=node5;

		
		//right node
		Tree node2 = new Tree();
		node2.x=3;
		root.r=node2;

		Tree node3 = new Tree();
		node3.x=6;
		node2.r=node3;

		Tree node6 = new Tree();
		node6.x=1;
		node2.l=node6;

		solution(root);
	}

	public static void solution(Tree node) {
		int[] path = new int[50000];// this has to change
		System.out.println(solutionRecur(node, path, 0, -1));

	}

	private static int solutionRecur(Tree node, int[] path, int pathLen, int max) {
		if (node == null) {
			return max;
		}

		path[pathLen] = node.x;
		pathLen++;

		if (node.l == null && node.r == null) {

			Set<Integer> set = new HashSet<>(pathLen);

			for (int i = 0; i < pathLen; i++) {
				set.add(path[i]);
			}

			//set.addAll(ints);

			if (max < set.size()) {
				return set.size();
			}

			return max;
		} else {
			int max1 = solutionRecur(node.l, path, pathLen, max);
			return solutionRecur(node.r, path, pathLen, max1);

		}

	}

	private static void printArray(int[] ints, int len) {
		for (int i = 0; i < len; i++) {

			System.out.print(ints[i] + " ");
		}

		System.out.println();

	}

}
