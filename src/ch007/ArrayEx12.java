package ch007;

public class ArrayEx12 {

	public static void main(String[] args) {
		int[][]score = {
				 {100, 100, 100 }
				,{ 20, 20, 20 }
				,{ 30, 30, 30 }
				,{ 40, 40, 40 } };
		int sum = 0;
		for(int i = 0; i < score.length; i++)
		{
			for(int j = 0; j < score[i].length; j++)
			{
				System.out.printf("score[%d][%d]=%d%n",i,j,score[i][j]);
			}
		}
		for(int[]temp : score)	// tmep 1차원 배열 = score 2차원 배열
		{
			for(int i : temp)	
			{
				sum += i;
			}
		}
		System.out.println("sum =" + sum);
	}

}
