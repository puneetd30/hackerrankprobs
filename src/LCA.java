
public class LCA {
	 public static void main(String args[]) 
	    {
		 	
	        // Let us construct the BST shown in the above figure
	        BinaryTree2 tree = new BinaryTree2();
	        tree.root = new TNode2(20);
	        tree.root.left = new TNode2(8);
	        tree.root.right = new TNode2(22);
	        tree.root.left.left = new TNode2(4);
	        tree.root.left.right = new TNode2(12);
	        tree.root.left.right.left = new TNode2(10);
	        tree.root.left.right.right = new TNode2(14);
	  
	        int n1 = 10, n2 = 14;
	        TNode2 t = tree.LCA(tree.root, n1, n2);
	        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
	  
	        n1 = 14;
	        n2 = 8;
	        t = tree.LCA(tree.root, n1, n2);
	        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
	  
	        n1 = 10;
	        n2 = 22;
	        t = tree.LCA(tree.root, n1, n2);
	        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
	  
	    }
}
class TNode2{
	
	TNode2 left,right;
	int data;
	
	TNode2(int data){
		this.data=data;
		left=right=null;
	}
	
}

class BinaryTree2{
	TNode2 root;
	TNode2 LCA(TNode2 root, int t1, int t2){
		if(root==null){
			return null;
		}
		
		if(t1>root.data && t2>root.data)
		{
			return LCA(root.right,t1,t2);
		}
		
		if(t1<root.data && t2<root.data){
			return LCA(root.left,t1,t2);
		}
		
		return root;
		
	}
		
}



