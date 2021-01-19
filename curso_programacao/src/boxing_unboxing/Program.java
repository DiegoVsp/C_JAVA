package boxing_unboxing;

public class Program {
	
	public static void main(String[] args) {
		
		//int x = 20;
		
		//Object obj = x;		//boxing
		//System.out.println(obj);
		
		
		//int y = (int) obj; //unboxing
		//System.out.println(y);
		
		//Wrappers
		
		int x = 20;
		Integer obj = x;
		System.out.println("obj = "+ obj);
		
		
		int y = obj; // com o Integer não precisa fazer o cast
		System.out.println("y = "+y);
	}
}
