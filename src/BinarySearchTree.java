//import java.util.ArrayDeque;
//import java.util.Deque;
//
//class Node {
//	TNode left;
//	TNode right;
//	int data;
//
//	public Node(TNode left, TNode right, int data) {
//		super();
//		this.left = left;
//		this.right = right;
//		this.data = data;
//	}
//
//}
//
//public class BinarySearchTree {
//	static TNode root;
//
//	public static boolean isValidBST(TNode root) {
//		if (root == null) {
//			return true;
//		}
//
//		Deque<TNode> queue = new ArrayDeque<>();
//		queue.add(root);
//
//		while (!queue.isEmpty()) {
//			TNode node = queue.poll();
//			if ((root.left != null && root.data <= root.left.data)
//					|| (root.right != null && root.data >= root.right.data)) {
//				return false;
//			}
//
//			if (node.left != null) {
//				queue.offer(node.left);
//			}
//
//			if (node.right != null) {
//				queue.offer(node.right);
//			}
//
//		}
//
//		return true;
//	}
//
//	void insert (int key){
//		root=insertBinarySearchTree(root, key);
//	}
//	public static TNode insertBinarySearchTree(TNode root,int key) {
//		if (root == null) {
//			root = new TNode(null, null, key);
//			return root;
//		}
//		
//		
//		TNode temp=root;
//		if(key<root.data){
//			root.left=insertBinarySearchTree(temp.left,key);
//		}
//		else if(key>root.data){
//			root.right=insertBinarySearchTree(temp.right,key);
//		}
//		
//		return root;
//	}
//
//	public static void main(String[] args) {
//		TNode n1 = new TNode(null, null, 3);
//		TNode n3 = new TNode(null, null, 7);
//		TNode n2 = new TNode(n1, n3, 5);
//
//		System.out.println(isValidBSTRecursive(n2, Integer.MIN_VALUE, Integer.MAX_VALUE));
//		BinarySearchTree tree = new BinarySearchTree();
//		 
//        /* Let us create following BST
//              50R
//           /     \
//          30      70
//         /  \    /  \
//       20   40  60   80 */
//        tree.insert(50);
//        tree.insert(30);
//        tree.insert(20);
//        tree.insert(40);
//        tree.insert(70);
//        tree.insert(60);
//        tree.insert(80);
//        tree.inorder();
//        // print inorder traversal of the BST
//	}
//	void inorder()  {
//	       inorderRec(root);
//	    }
//	 
//	    // A utility function to do inorder traversal of BST
//	    void inorderRec(TNode root) {
//	        if (root != null) {
//	            inorderRec(root.left);
//	            System.out.println(root.data);
//	            inorderRec(root.right);
//	        }
//	    }
//
//	public static boolean isValidBSTRecursive(TNode root, int min, int max) {
//		if (root == null) {
//			return true;
//		}
//
//		if (root.data <= min || root.data >= max) {
//			return false;
//		}
//
//		return isValidBSTRecursive(root.left, min, root.data) && isValidBSTRecursive(root.right, root.data, max);
//	}
//
//}
