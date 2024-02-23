package explanation;

import java.util.Scanner;

public class CourseScoreEx {

	public static void main(String[] args) {
		String[] Course = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int[] score = { 95, 88, 76, 62, 55 };
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("과목 이름>> ");
			String name = sc.next();
			if (name.equals("그만"))
				break;
			int i;
			for (i = 0; i < Course.length; i++) {
				if (Course[i].equals(name)) {
					System.out.println(name + "의 점수는" + score[i]);
					break;
				}
			}
			if (i == score.length) {
				System.out.println("없는 과목입니다.");
			}
		}
		sc.close();
	}

}
