package revision;

public class Ex03002Array {

	public static void main(String[] args) {
		int[][] n = {
				{1},
				{1,2,3},
				{1},
				{1,2,3,4},
				{1,2} };
		
		for(int[] i : n)
			{
			for(int j : i) 
			{
				System.out.print(j + " ");
			}
			System.out.println();
			}
	}

}
