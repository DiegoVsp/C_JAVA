package forEach;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] vect = new String[] {"Maria","Bob","Alex"};
		
		for(int i = 0; i< vect.length;i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-----");
		for (String nomes : vect) {
			System.out.println(nomes);
		}
	}

}
