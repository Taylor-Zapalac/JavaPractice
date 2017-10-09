package fibonacci;

import java.util.*;

public class fibonacci {

	public fibonacci() {
		// TODO Auto-generated constructor stub
	}


	
	public static long fibonacci(long number) {
	    if ((number == 0) || (number == 1)) // base cases
	      return number;
	    else
	      // recursion step
	      return fibonacci(number - 1) + fibonacci(number - 2);
	  }

	  public static void main(String[] args) {
	    for (int counter = 0; counter <= 50; counter++)
	      System.out.println(fibonacci(counter));
	  }
	}



