package DataStructures;

import java.util.Random;

public class Arrays {

	public Arrays() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Practice Array Things
	 * 
	 * Create +
	 * Insert +
	 * at +
	 * Remove +
	 * Find
	 * Resize +
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
	public static void main(String[] args)
	{
		int[] array = generateRandomArray(10);
		prettyArrayPrint(array);
		
		System.out.println("\n");
		
		array = insertElement(array, 0, 5);
		prettyArrayPrint(array);
		
		System.out.println("\n");
		
		array = resize(array, 11);
		prettyArrayPrint(array);
		
		System.out.println("\n");
		
		array = removeAtElement(array, 5);
		prettyArrayPrint(array);
		
		System.out.println("\n");
		
		array = add(array, 150);
		prettyArrayPrint(array);
		
		System.out.println("\n");
		
		//Sending it a value we already know, because it's generated randomly... slim chance we'll guess whats in there.
		int foundAt = find(array, 150);
		if(foundAt >= 0 ) System.out.println(150 + " found at index: "+foundAt);
		else System.out.println("Not found.");
		
		System.out.println("\n");

		
	}
	


	
	/**
	 * Finds passed value within array.
	 * If isn't found, return -1
	 * @param array
	 * @param value
	 * @return
	 */
	public static int find(int[] array, int value)
	{
		System.out.println("Finding "+value+":");
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == value) return i;
		}
		return -1;
	}
	
	/**
	 * Add an element to the end.
	 * @param array
	 * @param value
	 * @return
	 */
	public static int[] add(int[] array, int value)
	{
		return insertElement(array, value, array.length);
	}
	
	/**
	 * Remove element at index.
	 * @param array
	 * @param index
	 * @return
	 */
	public static int[] removeAtElement(int[] array, int index)
	{
		System.out.println("Removing: ");
		
		int[] newArray = new int[array.length-1];
		int position = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(i<index)
			{
				newArray[position] = array[i];
				position++;
			}
			else if( i == index)
			{
				//Don't insert this element, dont increase position.
			}
			else
			{
				newArray[position] = array[i];
				position++;
			}
		}
		
		return newArray;
	}
	
	/**
	 * Insert value at element in an array at position, 0-based index
	 * 
	 * @param arr
	 * @param value
	 * @param position
	 * @return
	 */
	public static int[] insertElement(int[] arr, int value, int position)
	{
		System.out.println("Inserting: ");
		int[] newArray = new int[arr.length+1];
		
		
		for(int i = 0; i <= arr.length; i++)
		{
			if(i<position)
			{
				//fill from first array
				newArray[i] = arr[i];
			}
			else if( i == position)
			{
				//insert value
				newArray[i] = value;
			}
			else
			{
				newArray[i] = arr[i-1];
			}
		}
		
		return newArray;
	}
	
	/**
	 * Print the array in a nice neat way 
	 * @param arr
	 */
	public static void prettyArrayPrint(int[] arr)
	{
		String tablePrint = "";
		
		for(int i = 0; i < arr.length; i++)
		{
			tablePrint += i+"|\t";
		}
		System.out.println(tablePrint);
		
		tablePrint = "";
		
		for(int j = 0; j < arr.length; j++)
		{
			tablePrint += arr[j]+"\t";
		}
		
		System.out.println(tablePrint);
		
		
	}
	
	
	/**
	 * Hard code an array resizer, this assumes the extra slots (if downsizing) are empty. If upsizing, we just make it longer.
	 * 
	 * @param original original array that we want resized
	 * @param newSize size of array we want to return
	 * @return
	 */
	public static int[] resize(int[] original, int newSize)
	{
		System.out.println("Resize: ");
		//Get new size, create new array of this size
		int[] newArray = new int[newSize+1];
		for(int i=0; i <  newSize; i++)
		{
			newArray[i] = original[i];
		}

		
		return newArray;
	}
	
	/**
	 * Generate array of random numbers with specified size.
	 * Just using this for testing.
	 * @param size
	 * @return
	 */
	public static int[] generateRandomArray(int size)
	{
		System.out.println("Generating: ");
		int[] randArray = new int[size];
		Random rand = new Random();
		for(int i = 0; i < size; i++)
		{
			randArray[i] = rand.nextInt(999);
		}
		
		return randArray;
	}

}
