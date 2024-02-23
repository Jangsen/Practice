package ttttttttttttttttttteeeeeeeeeeeeesssssssssssssttttttttttt;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<>();	
		
		studentList.add(new Student (2021001, "일번"));
		studentList.add(new Student (2021002, "이번"));
		studentList.add(new Student (2021003, "삼번"));
		
		String searchName = "일번";
		
		for(Student st : studentList) {
			if(st.getName().equals(searchName)) {
				System.out.println(st);
				break;
			}
		}
		
		}
	static class Student {
	private int studentId;
	private String name;
	
	public Student(int studenId, String name) {
		this.studentId = studenId;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student{" + "studentId=" + studentId + ", name=" + name + '\'' + '}';
	}
	}
}
