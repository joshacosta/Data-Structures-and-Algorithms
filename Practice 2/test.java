//Joshua Acosta
//Algorithims and Data Structures
//06/07/2017


public class test {
	
	public static void main(String[] args) 
	{
		IntList list = new IntList(4);
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.print("List after adding 6 integers: ");
		System.out.println(list.toString());
		
		System.out.print("Size of list: ");
		System.out.println(list.size());
		
		System.out.print("List head: ");
		System.out.println(list.head());
		System.out.print("List tail: ");
		System.out.println(list.tail());
		
		
		list.remove(3);
		
		System.out.print("List after removal of 3rd index: ");
		System.out.println(list.toString());
		
		list.shrink(2);
		
		System.out.print("List after shrinking from last two indexes: ");
		System.out.println(list.toString());
		
		
		list.sort();
		
		System.out.print("Sorted list in descending order: ");
		System.out.println(list.toString());
		
	}
	
}
