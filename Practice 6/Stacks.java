//Joshua Acosta
//27-07-17
//Algorithms and Data Structures
//Practice 6

public class Stacks {
	private int size;
	private int top;
	private int[] stackArray;
	
	public Stacks(int size) {
		stackArray = new int[size];
		top=-1;
		this.size=size;
	}
	
	public void push(int x) {
		if(top==this.size-1)
		{
			System.out.println("Stack overflow: "+x+" could not be added to the stack.");
		}
		else
			stackArray[++top]=x;	
	}

	public int pop(){ 
		if(top==-1)
		{
			System.out.println("Stack underflow");
			System.exit(0);
		}
		return stackArray[top--];		
	}
	
	public boolean isEmpty() {return top==-1;}
	
	public static void main(String[] args) {
		Stacks myStack = new Stacks(5);
		
		System.out.println("---Stack---");
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.push(5);

		
		//Stack overflow
		myStack.push(7);
		
		
		while(!myStack.isEmpty()){
			int x = myStack.pop();
			System.out.println("pop -> "+x);
		}
		
		//Stack underflow
		myStack.pop();
	}	
}
