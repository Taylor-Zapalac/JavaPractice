package DataStructures;

public class List {

	public List() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * Lists
	 * -----
	 * Lists are data structures, collections of data, similar to an array
	 * Can be a list of any object.
	 * Array is direct access, list is sequential access
	 * 
	 * Can be stored anywhere in memory, data doesnt have to  be next to each other.
	 * When you access list, you get the first node. first data object. this node contains a link to the next node.
	 * Each node contains a link to the next node, or terminator node which means it is the end.
	 * 
	 * Downside is that we have to access sequentially, cannot jump directly to the middle.
	 * WHy use this over array?
	 * Adding/removing elements is much much easier. This is very demanding on memory doing this in arrays.
	 * add/remove is a fixed time process.. In arrays the larger the array, the longer it takes.
	 * 
	 * Only supports linear search
	 * 
	 * Doubly linked list
	 * ------------------
	 * Each node has 2 links, one to the next node, and one to the previous node.
	 * This makes some things easier.
	 * Usually in lagnuages lists are implemented as doubly linked list.
	 * if we point the reference from the first to the last, and last to first, it becomes circular linked list.
	 * 
	 * In java, List is implemented as an Interface, it describes a behavior another class can impleent.
	 * 
	 * One example is ArrayList.
	 * -------------------------
	 * ArrayList is stored internally as an array, so it has the ups and downs of an array.
	 * It has good direct access to elements, but it has bad permormance with insertions and deletions
	 * 
	 * another example is LinkedList
	 * ----------------------------
	 * This is a doubly linked list implementation.
	 * Insertions and removals will be as fast as  possible because of this.
	 * We have te ability to point directly to a node, but it really doesn't do this.
	 * Operations that index into the list will just traverse the list from begining or end, whichever is closest... SO it is inefficient.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
