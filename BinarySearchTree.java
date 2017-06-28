
// an autobalancing binary search tree 
// we assume no duplicates
public class BinarySearchTree {
	
	TreeNode root;
	//construct an empty tree
	public BinarySearchTree() {
		this(null);
	}
	
	public BinarySearchTree(TreeNode t) {
		root = t;
	}
	
	//inserts a node in the correct location of the BST
	public void insert(TreeNode t) {
		if(root == null) {
			root = t;
		} else {
		// root is not null
			root = insertHelper(root, t);
		}
	}
	
	private TreeNode insertHelper(TreeNode curr, TreeNode newNode) {
		if(newNode < curr) {
			if(curr.left == null) {
				curr.left = newNode;
			} else {
				//recurse to the left				
				curr = insertHelper(curr.left, newNode);
			}

		} else if(newNode > curr) {
			if(curr.right == null) {
				curr.right = newNode;
			}
			curr.right = newNode;
			//recurse to the right
			curr = insertHelper(curr.right, newNode);
		} else { //if the nodes are equal...
			//we don't really want it in here
		}
		
	}
	
	//searches for and deletes the node, if it exists
	public void delete(TreeNode t) {
		
	}
	
	public void contains(TreeNode t) {
		
	}
	private void balance() {
		
	}
	
	public void preorder() {

	}
	
	
}
