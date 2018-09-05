//Joshua Acosta
//27-07-17
//Algorithms and Data Structures
//Practice 6

public class Queue{
	private int size = 0;
	private int[] queue;
	
	public Queue() {
		int[] temp = new int[10];
		queue = temp;
	}
	
	public Queue(int x) {
		int[] temp = new int[x];
		queue = temp;	
	}
	
	public void Enqueue(int x) {
		if (size < queue.length) {
			queue[size] = x;
			size++;
		}
		else {
			System.out.println("Queue overflow!");
		}
	}
	
	public java.lang.Integer Dequeue() {
		if (size == 0) {
			return null;
		}
		else {
			int x = queue[0];
			for(int i = 0; i < size; i++) queue[i] = queue[i+1];
			size--;
			return x;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("---Queue---");
		
		Queue myQueue = new Queue(6);
		myQueue.Enqueue(1);
		myQueue.Enqueue(2);
		myQueue.Enqueue(3);
		myQueue.Enqueue(4);
		myQueue.Enqueue(5);
		
		System.out.println("dequeue -> "+ myQueue.Dequeue());
		System.out.println("dequeue -> "+ myQueue.Dequeue());
		System.out.println("dequeue -> "+ myQueue.Dequeue());
		System.out.println("dequeue -> "+ myQueue.Dequeue());
		System.out.println("dequeue -> "+ myQueue.Dequeue());
		System.out.println("dequeue -> "+ myQueue.Dequeue());
		

	}
}