//Joshua Acosta
//27-07-17
//Algorithms and Data Structures
//Practice 6

public class LinkLists{

	public class Node{
		Node next;
		int num;
		
		public Node(int num){
			this.num=num;
		}
	}
		static Node head;
		
	public void insert(int num){
		
		if(head==null){
			head = new Node(num);
			System.out.println("inserted -> "+num);
			return;
		}
		Node current = head;
		
		while(current.next != null){current =current.next;}
		
		current.next = new Node(num);
		System.out.println("inserted -> "+num);
	}
			
	public static void search(int searchKey)
	{
		if(head==null){
			System.out.println("This List is empty");
			return;	
		}
			
		int counter=0;
		Node current =head;
			
		while(current!=null){
			
			if(current.num==searchKey){
				System.out.println("This Node is in the list at position "+ counter);
				return;
			}
			counter++;
			
			current=current.next;	
		}	
		System.out.println("This item is not in the list");
	}
		
	public void delete(int num){		
		if(head==null)
			return;
		if(head.num==num){
			head = head.next;
			return;
		}
		
		Node current = head;
		
		while(current.next != null){
			if(current.next.num == num){
				current.next=current.next.next;
				System.out.println("deleted -> "+num);
				return;
			}
			current = current.next;
		}
		System.out.println(num+" was not found in the list, cannot be deleted");
	}	
		
	public void printList(){
		int num=0;
		Node current = head;
		
		while(current.next != null) {current =current.next;}
			
		current.next = new Node(num);	
	}
			
	
	public static void main(String args[]){
		
		LinkLists myList = new LinkLists();
		System.out.println("---inserting nums to list---");
		myList.insert(1);
		myList.insert(2);
		myList.insert(3);
		myList.insert(4);
		myList.insert(6);
		myList.insert(7);
		myList.insert(8);
		myList.insert(9);
		myList.insert(10);
		
		
		System.out.println("\n---deleting nums---");
		myList.delete(2);
		myList.delete(3);
		myList.delete(7);
		//not in list
		myList.delete(100);
		
		System.out.println("\n---search for 5 in the list---");
		search(5);
		System.out.println("\n---search for 6 in the list---");
		search(6);	
		System.out.println("\n---search for 100 in the list---");
		search(100);
		
	}
	
}
