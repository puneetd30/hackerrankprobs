import java.util.Stack;

import edu.pd.ds.BinaryTreeNode;

public class StackProb {

	Stack stack = new Stack();

	public void inorderTraversal(BinaryTreeNode root) {
		if (root == null) {
			return;
		}

		inorderTraversal(root.left);
		stack.push(root.data);
		inorderTraversal(root.right);

	}

	public void preOrder(BinaryTreeNode root) {
		if (root == null) {
			return;
		}
		stack.push(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	public void postOrder(BinaryTreeNode root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		stack.push(root.data);
	}

	static class BinaryTreeNode {
		int data;
		BinaryTreeNode left;
		BinaryTreeNode right;
	}
}
