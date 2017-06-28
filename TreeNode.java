
public class TreeNode implements Comparable<TreeNode> {
	public TreeNode left;
	public TreeNode right;
	public Object data;
	
	public TreeNode(Object o) {
		this.data = o;
	}
	
	public int compareTo(TreeNode other) {
		return this.data - other.data;
	}
}
