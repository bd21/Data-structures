public class Node implements Comparable<Object> {
	public Object data;
	public Node next;
	//broken VVV
	public int compareTo(Object other) {
		return this.data - other.data;
	}
}