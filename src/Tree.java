import java.util.ArrayList;
import java.util.List;

public class Tree<T> {

	T data;
	Tree<T> parent;
	List<Tree<T>> childrenNodes;

	public Tree(T data) {
		this.data = data;
		this.childrenNodes = new ArrayList<>();
	}

	public Tree<T> addChild(T data) {
		Tree<T> node = new Tree<T>(data);
		this.childrenNodes.add(node);
		node.parent = this;
		return node;
	}

	public void remove(T data) {
		Tree<T> node = new Tree<T>(data);
		this.childrenNodes.remove(node);
	}

	public Tree<T> getRoot() {

		Tree<T> parentTmp = this.parent;
		Tree<T> root = this;
		
		while (parentTmp != null) {
			parentTmp = root.parent;
			if (parentTmp != null) {
				root = parentTmp;
			}
		}
		return root;
	}
	
	public boolean containsData(T data){
		if(this.data.equals(data)){
			return true;
		}
		
		List<Tree<T>> childs=this.childrenNodes;
		for(Tree<T> child:childs){
			if(child.containsData(data)){
				return true;
			}
		}
		return false;
	}
	
	private void helpToString(Tree<T> tree, StringBuilder output, int level){
		if(tree==null){
			return;
		}
		
		output.append(getSpaces(level)+ tree.data);
		List<Tree<T>>children2=tree.childrenNodes;
		++level;
		for(Tree<T>child:children2){
			helpToString(child, output, level);
		}
	}

	@Override
    public String toString()
    {
        StringBuilder output = new StringBuilder("[");
        helpToString(this, output, 0);
        output.append("]");
        return output.toString();
    }
	
	private String getSpaces(int level) {
		StringBuilder builder=new StringBuilder("\n");
		for(int i=0;i<level;i++){
			builder.append("--");
		}
		return builder.toString();
	}
	
	public static void main(String[] args)
    {
        Tree<String> root = new Tree<String>("A");
        root.addChild("B");
        Tree<String> childC = root.addChild("C");
        root.addChild("D");
        
        Tree<String> childC1 = childC.addChild("C1");
        childC.remove("C1");
        System.out.println("root = " + childC.getRoot());                 // toString() method is invoked
        System.out.println("Contains C = " + childC.containsData("C"));
        System.out.println("Contains D = " + childC.containsData("D"));
        
        System.out.println("root = " + childC1.getParent());              // toString() method is invoked
        
    }
	
	public Tree<T> getParent()
    {
        return this.parent;
    }
}
