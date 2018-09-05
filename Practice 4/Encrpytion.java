
public class Encrpytion {
	
	private int n;
	private int m;
	private String message;

    public Encrpytion(String message, int n, int m)
    {
    	this.message=message;
    	this.n=n;
    	this.m=m;
    }

    public String encode()
    {
    	StringBuilder sb = new StringBuilder();

    	for(int i=0;i<this.message.length();i++)
    	{
    		char c= message.charAt(i);
    		if(isDigit(c)==true)
    			sb.append(encodeDigit(c));
    		else if(isULetter(c)==true)
    			sb.append(encodeUChar(c));
    		else if(isLLetter(c)==true)
    			sb.append(encodeLChar(c));
    		else
    			sb.append(c);
    	}

    	return sb.toString();
    }

    public char encodeUChar(char c)
    {
    	return (char)(65+(c+n-65)%26);
    }
    
    public char encodeLChar(char c)
    {
    	return (char)(97+(c+n-97)%26);
    }

    public char encodeDigit(char c)
    {
    	return (char)(48+((c+m-48)%10));
    }

    public boolean isULetter(char c)
    {
    	return (c>=65 && c<=90);
    }
    
    public boolean isLLetter(char c)
    {
    	return (c>=97&&c<=122);
    }

    public boolean isDigit(char c)
    {
    	return (c>=48 && c<=57);
    }
    
    public static void main(String[] args){

    	String str = "the fox jumped over the lazy dog : 123456789" ;
		Encrpytion encoder = new Encrpytion ( str ,2,4);
		System.out.println(encoder.encode());
		//Decryption decoder = new ShiftDecryption ( encoder . encode () ,2 ,4);
		//return str . equals ( str , decoder . decode ());
    }
}
