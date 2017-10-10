package DataStructures;

public class Que {

	public Que() {
		// TODO Auto-generated constructor stub
	}

	
	/*
	 * Queues
	 * -----
	 * Kind of the flip side of a Stack
	 * It is a collection of data that uses First in First out
	 * FIFO
	 * 
	 * Just like a line at the bank or whatever, whoever goes in first, come out first, and everyone shuffles forward
	 * Takes in order that data is submitted
	 * 
	 * In Java queue is an interface, there are a few classes that use this.
	 * For instance ArrayBlockingQueue and ConcurrentLinked Queue.
	 * For a simple queue behavior, we would just used the LinkedList class, using add and remove methods.
	 * 
	 * Queues are often used in threading.
	 * 
	 * Priority Queue
	 * ---------------
	 * Some languages allow priority queues
	 * It allows you to insert new elements with a priority attached, if new element has higher priority than other elements already
	 * in the queue, it will jump ahead.
	 * anything lower priority will just line up behind
	 * Since it's up to you what priority means, you have to provide a comparer
	 * 
	 * Deque (Pronounced Deck)
	 * --------
	 * Double ended queue
	 * Like a stack and queue at the same time.
	 * Can remove and add to both sides.
	 * Restriction being we cant touch the middles, only the elements at each end.
	 * In Java LinkedList implements Deque
	 * 
	 */
	public static void main(String[] args)
	{
		
	}
}
