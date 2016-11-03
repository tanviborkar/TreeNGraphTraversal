
public class TraversalTechniques {
	public void inorder(TreeNode node){
		if(node == null){
			return;
		}
		inorder(node.leftChild);
		System.out.print(node.value);
		System.out.print("-");
		inorder(node.rightChild);
	}
	
	public void preorder(TreeNode node){
		if(node == null){
			return;
		}
		System.out.print(node.value);
		System.out.print("-");
		preorder(node.leftChild);
		preorder(node.rightChild);
	}
	
	public void postorder(TreeNode node){
		if(node == null){
			return;
		}
		postorder(node.leftChild);
		postorder(node.rightChild);
		System.out.print(node.value);
		System.out.print("-");
	}
}
