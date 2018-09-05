//Joshua Acosta
//Algorithms and Data Structures
//Practice 3
//16/07/2017

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args)
	{
		System.out.println("---Merge Sort---");
		Comparable[] array = { 5, 9, 2, 7, 4, 0, 3, 6, 1, 8};
		System.out.println("Original array: " + Arrays.toString(array));
		mergeSort(array);
		System.out.println("Sorted array: " + Arrays.toString(array));
	}

	public static void mergeSort(Comparable[] array)
	{
		Comparable[] temp = new Comparable[array.length];
		mergeSort(array, temp, 0, array.length - 1);
	}

	private static void mergeSort(Comparable[] array, Comparable[] temp, int left, int right)
	{
		if (left<right)
		{
			int mid = (left+right)/2;
			mergeSort(array, temp, left, mid);
			mergeSort(array, temp, mid + 1, right);
			merge(array, temp, left, mid + 1, right);
		}
	}

	private static void merge(Comparable[] array, Comparable[] temp, int left, int right, int tail)
	{
		int head = right-1;
		int k = left;
		int num = tail-left+1;

		while (left<=head && right<=tail)
		{
			if (array[left].compareTo(array[right]) <= 0)
				temp[k++] = array[left++];
			else
				temp[k++] = array[right++];
		}

		while (left<=head) 
			temp[k++] = array[left++];
 
		while (right<=tail) 
			temp[k++] = array[right++];
		
		for (int i = 0; i < num; i++, tail--)
			array[tail] = temp[tail];
	}

}
