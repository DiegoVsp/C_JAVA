
public class Texto {
	public static void main(String[] args) {

		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace("a", "x");
		String s07 = original.replace("abc","xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		
		System.out.println("Original - "+original+ "-");
		System.out.println("tolowerCase - "+s01+ "-");
		System.out.println("toupperCase - "+s02+ "-");
		System.out.println("TRIM - " + s03 + "-");
		System.out.println("Substring(2) - " + s04 + "-");
		System.out.println("Substring(2,9) - " + s05 + "-");
		System.out.println("Replace - " + s06 + "-");
		System.out.println("Replace - " + s07 + "-");
		System.out.println("indexOf - " + i + "-");
		System.out.println("indexOf - " + j + "-");
	}
}