package p2;

public class ReverseStr {
	public static void main(String[] args) {
		
		String str = ("neevarp");
		String revr =  "";
		
	    for(int i= str.length()-1 ; i>=0; i-- ) {
			
			revr+=str.charAt(i);
	    }
			System.out.println(revr);
		}
		
		
		
	}

	
