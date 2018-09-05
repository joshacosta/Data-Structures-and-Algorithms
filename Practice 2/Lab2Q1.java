// Joshua Acosta
// 07/06/2017

import java.util.Scanner;

public class Lab2Q1
{
    public static void main(String[] args)
    {
    	Scanner keyboard = new Scanner(System.in);

    	System.out.println("---Question One---");
    	System.out.print("Enter a number for its factorial: ");
    	int n= keyboard.nextInt();

		nonRecursiveFactorial(n);
		System.out.println(n+"! is "+recursiveFactorial(n)+" <-- recursive");
    }

    
    //nonRecursive function is easier and more direct to code, a little easier to read
    public static void nonRecursiveFactorial(int n)
    {
    	int total=1;

		System.out.print(n+"! is ");
    	while(n>0)
    	{
    		total*=n;
    		n--;
    	}

    	System.out.println(total+" <-- nonrecursive");
    }
    
    //Recursive function is cleaner code
    public static int recursiveFactorial(int n)
    {
    	int total;
    	if(n<=1)
    		return 1;

    	total= recursiveFactorial(n-1)*n;
    	return total;
    }
}
