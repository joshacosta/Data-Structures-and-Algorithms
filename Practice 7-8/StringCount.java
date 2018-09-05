//Joshua Acosta
//Algo and Data Structures
//Practice 7/8

import java.util.HashMap;

public class StringCount{

	public static void main (String args[]){
		System.out.println("Most frequently used word is: "+
			count("this is a test string:  test ."));

		System.out.println("Most frequently used word is: " +
			count("Inside the box was a tube of lipstick. " +
				"It seemed a little too feminine," +
				"but it must at least be expressing one of her father’s wishes. " + 
				"She held the lipstick in her palm and closed her hand around it. " + 
				"She felt her father’s hopes being conveyed to her through the " +
				"feeling of the cold metal."));
	}

	public static String count(String str){
		String[] tmp = str.split("\\s+");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int max=0;
		String word="";
		int k=0;
		for (int i=0;i<tmp.length;i++){
			String newstr = filter(tmp[i]);
			if (map.containsKey(newstr)){
				k = map.get(newstr);
				map.put(newstr,++k);
			}
			else{
				map.put(newstr,1);
			}

			if (max<k) {
				max=k;
				word=newstr;
			}
		}

		return word;
	}

	public static String filter(String str){
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if (isLetter(c) || isDigit(c))
				sb.append(c);
		}
		return sb.toString();
	}

	public static boolean isLetter(char c){
		return (c>=65 && c<=90) || (c>=97 && c<=122);
	}

	public static boolean isDigit(char c){
		return (c>=48 && c<=57);
	}


}