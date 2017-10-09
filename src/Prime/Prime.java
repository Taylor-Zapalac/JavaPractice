package Prime;

import java.util.Scanner;

public class Prime {

	public Prime() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args)
	{
		System.out.println("Check primes up to: ");
		int number = new Scanner(System.in).nextInt();

		boolean isPrime;

		for( int i = 2; i < number; i++)
		{
			isPrime = checkPrime(i);
			if(isPrime) System.out.println(i+" is Prime");
		}	
	}

	public static boolean checkPrime(int number)
	{
		
		for(int i = 2; i < number; i++)
		{
			if(number % i == 0) return false;
		}
		return true;
	}

}
