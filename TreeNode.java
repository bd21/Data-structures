
public class TreeNode implements Comparable<TreeNode> {
	public TreeNode left;
	public TreeNode right;
	public Integer data;
	
	public TreeNode(Integer o) {
		this.data = o;
	}
	
	public int compareTo(TreeNode other) {
		return this.data - other.data;
	}
}
