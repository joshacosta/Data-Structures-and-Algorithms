// Joshua Acosta
// 07/06/2017

public class IntList
{
	private int[] list;
	private int counter=0;
	private int size=0;

	public IntList(int c) 
	{
		list = new int[c];
		size=c;
	}

	public int head()
	{
		if(counter==0)
		{
			System.out.println("Sorry, there are currently no elements in the list.");
			System.exit(0);
		}
		
		return list[0];
	}

	public int tail()
	{
		if(counter==0)
		{
			System.out.println("Sorry, there are currently no elements in the list.");
			System.exit(0);
		}
		return list[counter-1];
	}

	public void add (int n)
	{
		if (this.counter>=this.size)
		{
			list = clone(this.size*2);
			this.size=this.size*2;
		}

		list[counter++]=n;
	}
	
	public void remove(int n)
	{
		if(counter==0)
		{
			System.out.println("Sorry, there are currently no elements in the list to remove.");
			System.exit(0);
		}
		
		for(int i=n;i<this.size-1;i++)
		{
			list[i]=list[i+1];
		}
		
		this.counter--;
		this.size=this.size-1;
	}

	private int[] clone(int n)
	{
		int[] newlist = new int[n];
		
		for (int i=0;i<this.size;i++) 
			newlist[i]=list[i];
		
		return newlist;
	}

	public String toString()
	{
		if(counter==0)
		{
			System.out.println("Sorry, there are currently no elements in the list.");
			System.exit(0);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i=0;i<this.counter-1;i++) 
			sb.append(list[i]+",");

		sb.append(list[counter-1]);
		sb.append("]");
		
		return sb.toString();
	}
	
	public void shrink(int n)
	{
		if(counter==0)
		{
			System.out.println("Sorry, there are currently no elements in the list to shrink.");
			System.exit(0);
		}
		
		this.counter=this.counter-n;
	}
	
	public int size()
	{
		return this.counter;
	}
	
	public void sort()
	{
		if(counter==0)
		{
			System.out.println("Sorry, there are currently no elements in the list to sort.");
			System.exit(0);
		}
		
		int key;
		
		for(int i=1;i<this.counter;i++)
		{
			key=list[i];
			int j=i-1;
			
			while(j>=0 && list[j]<key)
			{
				list[j+1]=list[j];
				j=j-1;
				
			}
			list[j+1]=key;
		}	
	}
	
	


}
