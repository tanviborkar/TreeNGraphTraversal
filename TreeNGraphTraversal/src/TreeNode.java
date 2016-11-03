
public class TreeNode<T> {
	TreeNode leftChild;
	TreeNode rightChild;
	T value;
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}	
}
