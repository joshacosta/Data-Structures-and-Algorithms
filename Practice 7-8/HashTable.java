//Joshua Acosta
//Algo and Data Structures
//Practice 7/8 

//Node for singly-linked list------------------
class Node
{
    Node next;
    int data;
 
    /* Constructor */
    public Node(int x)
    {
        data = x;
        next = null;
    }
}
//----------------------------------------------
 
class ChainingHash
{
    private Node[] table;
    private int size ;
 
    public ChainingHash(int tableSize)
    {
        table = new Node[ nextPrime(tableSize) ];
        size = 0;
    }
    
    public int size() {return size;}
    
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    public void makeEmpty()
    {
        int l = table.length;
        table = new Node[l];
        size = 0;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public void insert(int val)
    {
        size++;
        int pos = myhash(val);        
        Node nptr = new Node(val);                
        if (table[pos] == null)
            table[pos] = nptr;            
        else
        {
            nptr.next = table[pos];
            table[pos] = nptr;
        }    
    }

    public void remove(int val)
    {
        int pos = myhash(val);    
        Node start = table[pos];
        Node end = start;
        if (start.data == val)
        {
            size--;
            table[pos] = start.next;
            return;
        }
        while (end.next != null && end.next.data != val)
            end = end.next;
        if (end.next == null)
        {
            System.out.println("\nElement not found\n");
            return;
        }
        size--;
        if (end.next.next == null)
        {
            end.next = null;
            return;
        }
        end.next = end.next.next;
        table[pos] = start;
    }
    
    private int myhash(Integer s)
    {
        int hashVal = s.hashCode();
        hashVal %= table.length;
        if (hashVal < 0)
            hashVal += table.length;
        return hashVal;
    }
    
    private static int nextPrime( int n )
    {
        if (n % 2 == 0)
            n++;
        for ( ; !isPrime( n ); n += 2);
 
        return n;
    }

    private static boolean isPrime( int n )
    {
        if (n == 2 || n == 3)
            return true;
        if (n == 1 || n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }
    
    public void printtoString ()
    {
        System.out.println();
        for (int i = 0; i < table.length; i++)
        {
            System.out.print ("#" + i + ": ");             
            Node start = table[i];
            while(start != null)
            {
                System.out.print(start.data +" ");
                start = start.next;
            }
            System.out.println();
        }
        
    }   
}
 

public class HashTable
{ 
    public static void main(String[] args) 
    {
        System.out.print("-----Hash Table Test-----");
       
        ChainingHash myHash = new ChainingHash(3);
        
        //add
        myHash.insert(1);
        myHash.insert(2);
        myHash.insert(4);
        myHash.insert(5);
        myHash.insert(6);
        myHash.insert(7);
        myHash.printtoString();
        
        //delete
        myHash.remove(2);
        myHash.remove(7);
        myHash.printtoString();
        
        //size
        System.out.println("# of values in hash table: "+myHash.size());
       
    }
}