
public class InorderSuccessor {

	
	public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TNode root = null, temp = null, suc = null, pre = null;
        root = tree.insert(root, 20);
        root = tree.insert(root, 8);
        root = tree.insert(root, 22);
        root = tree.insert(root, 4);
        root = tree.insert(root, 12);
        root = tree.insert(root, 10);
        root = tree.insert(root, 14);
        temp = root.left.right.right;
        suc = tree.inorderSucc(root, temp);
        if (suc != null) {
            System.out.println("Inorder successor of " + temp.data + 
                                                      " is " + suc.data);
        } else {
            System.out.println("Inorder successor does not exist");
        }
        
        pre = tree.inorderPred(root, temp);
        if (pre != null) {
            System.out.println("Inorder predecessor of " + temp.data + 
                                                      " is " + pre.data);
        } else {
            System.out.println("Inorder predecessor does not exist");
        }
    }
}

class TNode{
	
	TNode left,right,parent;
	int data;
	
	TNode(int data){
		this.data=data;
		left=parent=right=null;
	}
	
}

class BinaryTree{
	
	
	TNode insert(TNode node, int data){
		if(node==null){
			return new TNode(data);
		}else{
			 TNode temp = null;
			if(data<=node.data){
				temp=insert(node.left,data);
				node.left=temp;
				temp.parent=node;
			}else{
				temp=insert(node.right,data);
				node.right=temp;
				temp.parent=node;
			}
		return node;
		}
	}
	
	TNode findMin(TNode n){
		TNode temp=n;
		while(temp.left!=null){
			temp=temp.left;
		}
		return temp;
	}
	
	TNode findMax(TNode n){
		TNode temp=n;
		while(temp.right!=null){
			temp=temp.right;
		}
		return temp;
	}
	
	
	TNode inorderSucc(TNode root, TNode n){
		if(n.right!=null){
			return findMin(n.right);
		}
		TNode temp=n.parent;
		while(temp!=null && temp.right==n){
			n=temp;
			temp=temp.parent;
		}
		
		return temp;
	}
	
	TNode inorderPred(TNode root, TNode n){
		if(n.left!=null){
			return findMax(n.left);
		}
		TNode temp=n.parent;
		while(temp!=null && temp.left==n){
			n=temp;
			temp=temp.parent;
		}
		
		return temp;
	}
		
}





//double min=Double.MAX_VALUE;
//int result = root.val;
//
//while(root!=null){
//    if(target>root.val){
//
//        double diff = Math.abs(root.val-target);
//        if(diff<min){
//            min = Math.min(min, diff);
//            result = root.val;
//        }
//        root = root.right;
//    }else if(target<root.val){
//
//        double diff = Math.abs(root.val-target);
//        if(diff<min){
//            min = Math.min(min, diff);
//            result = root.val;
//        }
//        root = root.left;
//    }else{
//        return root.val;
//    }
//}
//
//return result;