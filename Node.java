public class Node implements Comparable<Object> {
	public Object data;
	public Node next;
	
	public Node() {
		this(null, null);
	}
	
	public Node(Object o) {
		this(o, null);
	}
	
	public Node(Object o, Node next) {
		this.data = o;
	}
	//broken VVV
	public int compareTo(Object other) {
		if(this.data == other) {
			return 0;
		}
		return 1;
	}
}