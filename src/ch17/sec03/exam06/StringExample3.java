package ch17.sec03.exam06;

public class StringExample3 {

	public static void main(String[] args) {
		String s = "java.lang.java";
		int idx1 = s.lastIndexOf("java");
		System.out.println(idx1);
		int idx2 = s.indexOf("java");
		System.out.println(idx2);
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		String animals2 = "dog,cat,bear";
		String[] arr2 = animals.split("," ,2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
	}
	

}
