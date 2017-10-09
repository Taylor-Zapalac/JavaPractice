package DataStructures;

public class Arrays {

	public Arrays() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Practice Array Things
	 * 
	 * Create
	 * Insert
	 * Capacity
	 * Size
	 * Is_Empty
	 * at
	 * Prepend
	 * Push
	 * Pop
	 * Remove
	 * Find
	 * Resize
	 * 
	 * Array: Contiguous area of memory consisting of equal-size elements by contiguous integers.
	 * Zero-Based indexing
	 * Constant time access means we can access any point at any time.
	 * Once initialized, in Java, it cannot be resized.
	 * Ordered collection of items. Can be any object.
	 * 
	 * Why restrict when the size cannot be changed, if lists exist?
	 * Uses less resources. Most of the time, more restrictions means smaller faster code.
	 * 
	 * If we dont know size, list would probably be a better idea.
	 * 
	 * Multi Dimensional or Matrix
	 * -----------------
	 * Basically an array of arrays
	 * Each element has 2 indexes, a row and column
	 * Example use: Weather app, row is a day in the year, column is temperature reading at hours of the day.
	 * 
	 * Can be more than 2 dimensions.
	 * 3-d array is kinda like a collection of 2d arrays
	 * 3d has nothing to do with physical world dimensions... More like a group or nest of data. Location within a location.
	 * 
	 * Overall, data structures need 5 main components.
	 * 1) Access
	 * 2) Insert
	 * 3) Delete
	 * 4) Find
	 * 5) Sort
	 * 
	 */
	
	/**
	 * I think my goal with this is to re-create the functions of a list as an array, to practice array manipulation.
	 * To make it simple I'll just assume all arrays of Ints
	 * 
	 * I want to implement the 5 main components listed above
	 * @param args
	 */
	public static void Main(String[] args)
	{
		
	}
	
	/**
	 * Hard code an array resizer, this assumes the extra slots (if downsizing) are empty. If upsizing, we just make it longer.
	 * 
	 * @param original original array that we want resized
	 * @param newSize size of array we want to return
	 * @return
	 */
	public int[] resize(int[] original, int newSize)
	{
		//Get new size, create new array of this size
		int[] newArray = new int[newSize];
		for(int i=0; i <  newSize; i++)
		{
			newArray[i] = original[i];
		}

		
		return newArray;
	}

}
