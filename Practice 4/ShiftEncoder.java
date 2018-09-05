//Joshua Acosta
//Algorithms and Data Structures
//Practice 3
//17/07/2017

public class ShiftEncoder {
	
	private int n=0;
	private int m=0;
	private String message;

	public ShiftEncoder(String message,int n, int m){
		this.n=n;
		this.m=m;
		this.message=message;
	}

	public String encode(){
		StringBuilder sb = new StringBuilder();

		for (int i=0;i<this.message.length();i++){
			char c = message.charAt(i);
			if (isDigit(c))
				sb.append(encodeDigit(c));
			else if (isULetter(c))
				sb.append(encodeUChar(c));
			else if (isLLetter(c))
				sb.append(encodeLChar(c));
			else
				sb.append(c);
		}
		return sb.toString();
	}

	private char encodeUChar(char c){
		if(n>=0){
			return (char)(65+((c+n-65)%26));
		}
		else{
			int tempAscii = c;
			for(int i = 0;i<(-1*n);i++){
				if(tempAscii>65){
						tempAscii--;
				}
				else{
					tempAscii=90;
				}
			}
			return (char)(tempAscii);
		}
	}

	private char encodeLChar(char c){
		if(n>=0){
			return (char)(97+((c+n-97)%26));
		}
		else{
			int tempAscii = c;
			for(int i = 0;i<(-1*n);i++){
				if(tempAscii>97){
					tempAscii--;
				}
				else{
					tempAscii=122;
				}
			}
	    return (char)(tempAscii);
		}
	}

	private char encodeDigit(char c){
		if(m>=0){
			return (char)(48+((c+m-48)%10));
		}
		else{
			int tempAscii = c;
			for(int i = 0;i<(-1*m);i++){
				if(tempAscii>48){
					tempAscii--;
				}
				else{
					tempAscii=57;
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
