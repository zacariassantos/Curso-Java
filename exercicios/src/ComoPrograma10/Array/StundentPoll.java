package ComoPrograma10.Array;

public class StundentPoll {
	public static void main(String[] args) {
		
		
		int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
		int[] frenquency = new int[6];
		
		for(int answer = 0; answer < responses.length; answer++){
			try 
			{
				++frenquency[responses[answer]];
			} 
			catch (ArrayIndexOutOfBoundsException e) 
			{
				System.out.println(e);
				System.out.printf("   responses[%d] = %d%n%n",answer, responses[answer]);
			}
		}
		System.out.printf("%s%10s%n", "Rating", "Frequency");
		for (int rating = 1; rating < frenquency.length; rating++) {
			System.out.printf("%6d%10d%n", rating, frenquency[rating]);
		}
	}
}
