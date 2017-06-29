
// a binary search tree 
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
		if(newNode.data < curr.data) {
			if(curr.left == null) {
				curr.left = newNode;
			} else {
				//recurse to the left				
				curr.left = insertHelper(curr.left, newNode);
			}

		} else if(newNode.data > curr.data) {
			if(curr.right == null) {
				curr.right = newNode;
			} else {
				curr.right = insertHelper(curr.right, newNode);
			}			
		} else { //if the nodes are equal...
			//we don't really want it in here
		}
		return curr;
		
	}
	
	public boolean search(TreeNode t) {

		searchHelper(root);
		return false;
	}
	
	private boolean searchHelper(TreeNode curr) {
		if(curr == t) {
			return true;
		}
		preorderHelper(curr.left);
		preorderHelper(curr.right);
		
		return false;
	}

	public void preorder() {
		preorderHelper(root);
		System.out.println();
	}
	
	private void preorderHelper(TreeNode curr) {
		if(curr == null) {
			
		} else {
			System.out.print(curr.data);
			System.out.print("left branch...");
			preorderHelper(curr.left);
			System.out.print("right branch...");
			preorderHelper(curr.right);
		}
	}
	
	
}
