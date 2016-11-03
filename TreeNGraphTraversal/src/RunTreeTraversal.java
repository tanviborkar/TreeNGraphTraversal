
public class RunTreeTraversal {

	public static void main(String[] args) {
		TreeNode<Integer> leafNode1 = new TreeNode<Integer>();
		leafNode1.setValue(4);
		
		TreeNode<Integer> leafNode2 = new TreeNode<Integer>();
		leafNode2.setValue(5);

		TreeNode<Integer> node3 = new TreeNode<Integer>();
		node3.setValue(2);
		node3.setLeftChild(leafNode1);
		node3.setRightChild(leafNode2);
		
		TreeNode<Integer> node4 = new TreeNode<Integer>();
		node4.setValue(3);
		
		TreeNode<Integer> rootNode = new TreeNode<Integer>();
		rootNode.setValue(1);
		rootNode.setLeftChild(node3);
		rootNode.setRightChild(node4);
		
		TraversalTechniques traverseObj = new TraversalTechniques();
		System.out.println("Inorder Parsing");
		traverseObj.inorder(rootNode);
		System.out.println();
		
		System.out.println("Preorder Parsing");
		traverseObj.preorder(rootNode);
		System.out.println();
		
		System.out.println("Postorder Parsing");
		traverseObj.postorder(rootNode);
		System.out.println();	
	}
}
