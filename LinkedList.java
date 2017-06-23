
public class LinkedList {
	Node parent;
	//constructors
	public LinkedList() {
		this(null);
	}
	
	public LinkedList(Node data) {
		parent = data;
	}
	//contains
	//search from front of list
	public boolean contains(Node term) {
		Node curr = parent;
		while(curr != null) {
			if(curr == term) {
				return true;
			}
			curr = curr.next;
		}
		return false;
	}
	
	// returns -1 if not found
	public int indexOf(Node data) {
		Node curr = parent;
		int count = 0;
		while(curr != null) {
			if(curr == data) {
				return count;
			}
			curr = curr.next;
			count++;
		}
		return -1;
	}
	
	// add something to the beginning of the list
	public void addFirst(Node data) {
		Node curr = parent;
		data.next = curr;
		parent = curr;		
	}
	
	//add something to the end of the list
	public void add(Node data) {
		if(parent == null) {
			parent = data;
		} else {
			Node curr = parent;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = data;
		}
	}
	
	//delete something at index i from the list
	public void delete(int i) {
		if(i < 0) {
			return;
		}
		//if it's the first one, then just remove first item
		if(i == 0 && parent != null) {
			parent = parent.next;
		} else if (i == 1 && parent != null && parent.next != null) {
			parent.next = parent.next.next;
		} else if (i > 1) {
			//i is greater than 1
			Node curr = parent.next;
			int count = 2;
			// say we had 4 items and wanted to delete i = 3
			// then our curr would point to the i=2, or 3rd item
			for(int j = 0; j < i - count; j++) {
				if(curr != null)
					curr = curr.next;
				else
					return;
			}
			// we are now at the node before the one we want to delete
			if(curr.next != null) {
				Node nxt = curr.next;
				curr.next = nxt.next;
			} else {
				curr = null;
			}
			
		}
	}
	
	
	
	//deep copy of linked list
	public LinkedList clone(LinkedList original) {
		Node curr = parent;
		LinkedList result = new LinkedList();
		while(curr != null) {
			result.add(curr);
		}
		return result;
	}
	
	// prints a reversal of the linked list
	public void reverse() {
		//TODO
	}
	
	public String toString() {
		if(parent != null) {
			String start = "[";
			Node curr = parent;
			
			while(curr.next != null) {
				start += curr.data;
				start += ", ";
				curr = curr.next;
			}
		
			return start += curr.data + "]";
		} else {
			return "[]";
		}
	}
	
}
