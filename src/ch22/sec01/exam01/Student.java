package ch22.sec01.exam01;

public class Student implements Comparable<Student>{

		int age;
		int classNum;
		
		Student(int age, int classNum){
			this.age = age;
			this.classNum = classNum;
		}

		@Override
		public int compareTo(Student o) {
			
			if(this.age > o.age) {
				return 142352;
			}else if(this.age == o.age) {
				return 0;
			}else {
				return -1324;
			}
		}
		
	}

