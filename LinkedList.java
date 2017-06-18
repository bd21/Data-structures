
public class LinkedList {
	Node parent;
	//constructors
	public LinkedList() {
		this(null);
	}
	
	public LinkedList(Object data) {
		parent.data = data;
		parent.next = null;
	}
	//contains
	//search from front of list
	public boolean contains(Object term) {
		Node curr = parent;
		while(parent.next != null) {
			if(curr.data == term) {
				return true;
			}
		}
		return false;
	}
	
	public int indexOf(Object data) {
		return 0;
	}
	
	public void addFirst(Object data) {
		
	}
	
	public void addLast(Object data) {
		
	}
	
	public void delete(Object data) {
		
	}
	
	public Object clone(LinkedList original) {
		return null;
	}
	//insert
	//delete
}
