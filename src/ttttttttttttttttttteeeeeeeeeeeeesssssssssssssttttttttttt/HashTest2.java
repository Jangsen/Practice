package ttttttttttttttttttteeeeeeeeeeeeesssssssssssssttttttttttt;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashTest2 {
	public static void main(String[] args) {
		Map<String, Map<String, Integer>> studentScores = new HashMap<>();
		
		Map<String ,Integer> firstSt = new HashMap<>();
		firstSt.put("수학", 90);
		firstSt.put("과학", 95);
		firstSt.put("사회", 88);
		studentScores.put("나", firstSt);
		
		
		Map<String ,Integer> SecondSt = new HashMap<>();
		SecondSt.put("수학", 88);
		SecondSt.put("과학", 90);
		SecondSt.put("사회", 79);
		studentScores.put("너", SecondSt);
		
		String topStudent = null;
		int maxScore = Integer.MIN_VALUE;
		
		for(Map.Entry<String, Map<String,Integer>> entry : studentScores.entrySet()) {
			String studentName = entry.getKey();
			Map<String, Integer>scores = entry.getValue();
			int totalScore = 0;
			
			for(int score : scores.values()) {
				totalScore += score;
				if(totalScore > maxScore) {
					topStudent = studentName;
					maxScore = totalScore;
					System.out.println("성적 1등 : " + topStudent + " 총점: " + maxScore);
			}
			}
		}
	}
}