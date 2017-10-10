package DataStructures;

public class HashTable {

	public HashTable() {
		// TODO Auto-generated constructor stub
	}
	
	
	/*
	 * Associative Array
	 * -----------------
	 * Grouped data that uses a key as the index
	 * When elements moved, the key stays paired with the value
	 * Keys don't need to be in any order.
	 * But keys need to be unique
	 * You can have duplicate values, but the keys must  be unique
	 * Value can be objects
	 * Common to use string as a key, but you can use anyhting
	 * Associative array is a generic term, an abstract data type. Its an Idea.
	 * In Java they are called HashMap and HashTables
	 * 
	 * Hash Functions
	 * ---------------
	 * Its a way to take data and run that through a function that will grind the data up.
	 * The data we get is a small simplified, purposefully shortened reference generated from the
	 * original data.
	 * Hashing is not encryption.
	 * Hashing is not reversible.
	 * You lose information when hashing.
	 * Object will give the same hash result no matter how many times it's ran through the function
	 * Identical objects give same result.
	 * Hash collisions occur when different objects with different data give same hash result
	 * 
	 * Hash Table
	 * -----------
	 * Typical way to implement an  associative array.
	 * benefit over arrays and linked lists is they're very fast
	 * Both when looking for an item, checking exists, and inserting and deleting.
	 * Better to define how large it is, but it can be flexible.
	 * Always have to add key value pairs.
	 * Behind the scenes it uses the key, runs it through a hash function, then that tells it where it wants to put data
	 * When we ask for data at a key, it hashes the key again to look for that value
	 * If a has collision occurs, it can handle it. Sometimes each element can contain multiple values
	 * this is called seperate chaining.
	 * 
	 * Java has hashCode()
	 * If you redefine what it means for an object to be equal, you will need to redefine the hash function as well
	 * Looks at the memory slot for the ID, so when you check if equal, it compares the memory location, not the internal values
	 * Only needed for custom classes... String objects already have the behavior extended.
	 * 
	 * Java has HashTable and HashMap
	 * Main difference is that hashtable includes processing to synchronize over multiple threads, adds performance cost.
	 * ConcurrentHashMap is kind of a replacement for the old HashTable -- Check this out.
	 */
	public static void main(String[] args)
	{
		
	}

}
