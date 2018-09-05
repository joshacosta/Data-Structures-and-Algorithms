//Joshua Acosta
//Algorithms and Data Structures
//Practice 3
//17/07/2017


public class Lab4Test {
	
	 public static void main(String[] args)
	 {

		    String str = "the quick brown fox jumps over the lazy dog: [1234567890]";
		    
			ShiftEncoder encoder = new ShiftEncoder (str,2,4);
		    ShiftDecoder decoder = new ShiftDecoder(encoder.encode(),2,4);
		    
		    System.out.println("Orginal message: ");
		    System.out.println(str);
		    System.out.println("\nMessage after encryption: ");
			System.out.println(encoder.encode());
				
		    System.out.println("\nMessage after decryption: ");
		    System.out.println(decoder.decode());

	}

}
