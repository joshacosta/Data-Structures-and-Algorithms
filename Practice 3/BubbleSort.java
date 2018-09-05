//Joshua Acosta
//Algorithms and Data Structures
//Practice 3
//16/07/2017

public class BubbleSort {

    public void sortArray(int[] A)
    {
    	int n = A.length;
    	int temp = 0;

    	for(int i = 0; i < n; i++){
        	for (int j = 1; j < (n - i); j++){
            	if(A[j - 1] > A[j]){
                	temp = A[j - 1];
                	A[j - 1] = A[j];
                	A[j] = temp;
           		}
        	}
    	}
   }

   	public void printArray(int[] A)
   	{
   		System.out.print("[ ");

   		for(int i=0; i<A.length; i++)
        	System.out.print(A[i] + " ");

        System.out.print("]");
   	}

   public static void main(String[] args) {

      BubbleSort sort = new BubbleSort();
      int[] num = {5,4,3,2,1};
      
      System.out.println("---Bubble Sort---");
      System.out.println("Original array: ");
      sort.printArray(num);
      sort.sortArray(num);
      System.out.println("\nSorted array: ");
      sort.printArray(num);

   }


}