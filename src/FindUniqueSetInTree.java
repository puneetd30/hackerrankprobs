//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.Set;
//
//import edu.pd.ds.BinaryTreeNode;
//
//public class FindUniqueSetInTree {
//	BinaryTreeNode root;
//
//	public static void main(String[] args) {
//
//	}
//
//	public static int solution(BinaryTreeNode root) {
////
////		if (root == null) {
////
////			return -1;
////		}
////
////		int max = -1;
////		LinkedHashSet<Integer> values = new LinkedHashSet<>();
////		values.soultionRecur(root, max, set);
////		return -1;
//	}
//
//	public static int solutionRecur(BinaryTreeNode root, int max, Set<Integer> values) {
//		
////		if(root==null){
////			return max;
////			
////		}
////		if (root.getLeft() == null && root.getRight() == null) {
////			values.add(root.getVal());
////			if (max < values.size()) {
////				return values.size();
////			} else {
////				return max;
////			}
////		}
////
////		//values=new HashSet<>();
////		values.add(root.getVal());
////		int max1 = solutionRecur(root.getLeft(), max, values);
////
////		values = new HashSet<>(values);
////		values.add(root.getVal());
////		int max2 = solutionRecur(root.getRight(), max1, values);
////
////		return max2;
//	}
//}
