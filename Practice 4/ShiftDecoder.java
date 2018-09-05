//Joshua Acosta (Partnered with Jason Green)
//Algorithms and Data Structures
//Practice 3
//17/07/2017

public class ShiftDecoder {
	
	private int n=0;
	private int m=0;
	private String message;

	public ShiftDecoder(String message,int n, int m){
		this.n=n;
		this.m=m;
		this.message=message;
	}

	public String decode(){
		StringBuilder sb = new StringBuilder();

		for (int i=0;i<this.message.length();i++){
			char c = message.charAt(i);
			
			if (isDigit(c))
				sb.append(decodeDigit(c));
			else if (isULetter(c))
				sb.append(decodeUChar(c));
			else if (isLLetter(c))
				sb.append(decodeLChar(c));
			else
				sb.append(c);
		}
		return sb.toString();
	}

	private char decodeUChar(char c){
		if(n>=0){
			int tempAscii = c;
      
			for(int i = 0;i<n;i++){
				if(tempAscii>65){
						tempAscii--;
				}
				else{
					tempAscii=90;
				}
			}
			return (char)(tempAscii);
		}
		else{	
			int tempAscii = c;
     
			for(int i = 0;i<(-1*n);i++){
				if(tempAscii<90){
					tempAscii++;
				}
				else{
					tempAscii=65;
				}
			}
			return (char)(tempAscii);
		}
	}

	private char decodeLChar(char c){
		if(n>=0){
			int tempAscii = c;
			for(int i = 0;i<n;i++){
				if(tempAscii>97){
					tempAscii--;
				}      
				else{
					tempAscii=122;
				}
			}
			return (char)(tempAscii);
		}
		else{
			int tempAscii = c;
			for(int i = 0;i<(-1*n);i++){
				if(tempAscii<122){
					tempAscii++;
				}
       
				else{
					tempAscii=97;
				}
			}
			return (char)(tempAscii);
		}

	}	

	private char decodeDigit(char c){
		if(m>=0){
			int tempAscii = c;
			for(int i = 0;i<m;i++){
				if(tempAscii>48){
					tempAscii--;
				}
				else{
					tempAscii=57;
				}
			}
			return (char)(tempAscii);
		}
		else{
			int tempAscii = c;
			for(int i = 0;i<(-1*m);i++){
				if(tempAscii<57){
					tempAscii++;
				}       
				else{
					tempAscii=48;
				}
			}
			return (char)(tempAscii);
		}
	}

	private boolean isULetter(char c){
		return (c>=65 && c<=90);
	}

	private boolean isLLetter(char c){
		return (c>=97 && c<=122);
	}

	private boolean isDigit(char c){
		return c>=48 && c<=57;
	}

}
