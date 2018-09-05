//Joshua Acosta
//Algorithms and Data Structures
//Practice 3
//16/07/2017

import java.util.Scanner;

public class HornersSum {
	
	private int sum;

	public HornersSum(int[] c, int x)
	{
		sum = 0;
		sum(c, x, c.length -1);
		System.out.println("The calculated result is "+sum+".");
	}
	
	private void sum(int[] c, int x, int N){
		sum = c[N] * x;
		
        for (int i = N - 1; i >= 1; i--)
            sum = (sum + c[i]) * x;
        
        sum += c[0];
	}

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("---Horner Algorithm Test---\n");
		System.out.print("Enter the highest power: ");
		int n = keyboard.nextInt();
		int[] arr = new int[n + 1];
		System.out.println("\nEnter " + (n + 1) + " coefficients in increasing order: ");
		
		for (int i = 0; i <= n; i++)
			arr[i] = keyboard.nextInt();
		System.out.print("\nEnter the x value:");
		
		int x = keyboard.nextInt();
		HornersSum test = new HornersSum(arr, x);
	}
}
