package ch007;

public class ArrayEx6 {

	public static void main(String[] args) {
		String[] names = { "Kim", "Park" ,"Yi" };
		for(int i = 0; i < names.length; i++)
		{
			System.out.println("names[" + i +"]: " + names[i]);
		}
		String temp = names[2];
		System.out.println("temp: " + temp);
		names[1] = "Yu";
		for(String str : names)
			System.out.println(str);
	}

}
