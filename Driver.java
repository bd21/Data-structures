import org.junit.Test;

// Blake Denniston
// 6/17/17
// Implementation of many data structures for practice
public class Driver {
	public static void main(String[] args) {
		//Linked list
		LinkedListTester();
		//Doubly linked list - hold
		//Trees - 
		// binary search
		BinarySearchTreeTester();
		// B-tree
		// Red black tree
		// AVL
		//Tries
		//Graphs
		//Stacks/Queues
		//Heaps
		//Vectors/Arraylists
		//Hash table
		
		//Algorithms
		//Breadth first search
		//Depth first search
		//A* search?
		//idea - grid for different path finding algorithms
		//
		//Binary search
		//Quick sort
		//Merge sort
		//Bucket sort
		//Radix sort
	}
	@Test
	private static void LinkedListTester() {
		//create the list
		LinkedList list = new LinkedList();
		//traverse empty list
		//System.out.println(list.toString());
		//traverse list with multiple nulls
		list.add(null);
		list.add(null);
		list.add(null);
		//System.out.println(list.toString());
		//delete from empty list
		list.delete(0);
		//fill list - inserting into list
		for(int i = 0; i < 10; i++) {
			Integer integer = new Integer(i);
			Node node = new Node(integer);
			list.add(node);
		}
		//traversing the list
		//System.out.println(list.toString());
		
		//deleting from the list
		list.delete(0);
		//System.out.println(list.toString());
		list.delete(6);
		//System.out.println(list.toString());
		list.delete(33);
		//System.out.println(list.toString());
		list.delete(-1);
		//System.out.println(list.toString());
		
		System.out.println("All Linked List tests passed.");
	}
	private static void BinarySearchTreeTester() {
		
	}
}
