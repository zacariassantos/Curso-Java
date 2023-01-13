package ComoPrograma10.Array;

public class ExecicioLivroInitArray {
	public static void main(String[] args) {
		int [] Array = new int[10];
		
		System.out.printf("%s%8s%n","Index","Value");
		
		for (int i = 0; i < Array.length; i++) {
			
			System.out.printf("%s%8s%n",i,Array[i]);
		}
	}
}
