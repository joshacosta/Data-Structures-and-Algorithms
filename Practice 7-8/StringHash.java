//Joshua Acosta
//Algo and Data Structures
//Practice 7/8

public class StringHash{
	private int capacity;
	private Entry[] entries;
	private int size;

	public StringHash(int capacity){
		this.capacity=capacity;
		this.entries = new Entry[this.capacity];
		this.size=0;
	}
	
	public Entry[] copy() {
		Entry temp[] = new Entry[this.capacity*2];
		//copy all elements in current hash to table to temp
		//return new,larger table
		for(int i=0;i<this.capacity;i++)
		{
			temp[i]=entries[i];
		}
		
		return temp;
		
	}

	public void insert (String value){
		if (this.size>=this.capacity){
			//entries= copy();
			System.out.println("Hash table is full.");	
			}
		
		Entry entry = new Entry(value);
		int k = hash(value);

		if (entries[k]!=null){
			for (int i=0;i<this.capacity;i++){
				if (entries[(k+i)%this.capacity]==null) {
					entries[(k+i)%this.capacity]=new Entry(value);
					return;
				}
			}
		}
		else{
			entries[k]= new Entry(value);
		}
		
		//System.out.println(size);
		size++;
	}

	public void delete(String value){
		if (size<=0){
			System.out.println("Hash table is empty.");
			return;
		}
		Entry entry = entries [ hash(value)];
		int k = hash(value);
		for (int i=0;i<this.capacity;i++){
			if (entries[(k+i)%this.capacity].getValue()==value){
				entries[(k+i)%this.capacity]=null;
				this.size--;
				return;
			}
		}
	}

	public int hash ( String str ){
		int h = 5381;
		for (int i =0; i < str . length (); i ++)
		h =( h <<5)+ h +( int ) str . charAt ( i );
		return h%this.capacity ;
		}
	

	public boolean lookup(String num){
		if (entries[ hash(num)]==null) return false;
		return entries[ hash(num)].getValue()==num;
	}

	public int size(){return this.size;}

	public String toString(){
		StringBuilder sb = new StringBuilder();

		for (int i=0;i<this.entries.length;i++){
			Entry entry = this.entries[i];
			if (entry==null)
				sb.append(i+" : null \n");
			else
				sb.append(i+" : "+this.entries[i].getValue()+"\n");
		}

		return sb.toString();
	}

	private class Entry{
		private String value;
		public Entry(String value){
			this.value = value;
		}
		public String getValue(){return this.value;}
	}
	
	public static void main(String[] args) {
		StringHash myHash = new StringHash(5);
		
		//add
		myHash.insert("one");
		myHash.insert("two");
		myHash.insert("three");
		myHash.insert("four");
		myHash.insert("five");
		System.out.println(myHash.toString());
		//delete
		myHash.delete("four");
		System.out.println(myHash.toString());
	
	}
}