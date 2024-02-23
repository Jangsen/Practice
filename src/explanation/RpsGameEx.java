package explanation;

import java.util.Scanner;

public class RpsGameEx {

	public static void main(String[] args) {
		String[] str = { "가위","바위" ,"보" };
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) {
		System.out.print("가위 바위 보!! >>");
		String name = sc.next();
		int n = (int)(Math.random() * 3);
		System.out.println(name);
		if(str[n].equals("바위")) 
		{
			if(name.equals("바위")) 
			{
			System.out.println("사용자 = " + name + ", 컴퓨터 = " + str[n] + ", 비겼습니다");
			
			
			}
			else if(name.equals("가위"))
					{
				System.out.println("사용자 = " + name + ", 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");
			}
			else if(name.equals("보"))
			{
				System.out.println("사용자 = " + name + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
			}
			
		}
		else if(str[n].equals("가위"))
		{
			if(name.equals("바위")) 
			{
			System.out.println("사용자 = " + name + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다");
			
			
			}
			else if(name.equals("가위"))
					{
				System.out.println("사용자 = " + name + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
			}
			else if(name.equals("보"))
			{
				System.out.println("사용자 =" + name + ", 컴퓨터 =" + str[n] + ", 사용자가 졌습니다.");
			}
		}
		else if(str[n].equals("보"))
		{
			if(name.equals("바위")) 
			{
			System.out.println("사용자 = " + name + ", 컴퓨터 = " + str[n] + ", 사용자가 졌습니다");
			
			
			}
			else if(name.equals("가위"))
					{
				System.out.println("사용자 = " + name + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
			}
			else if(name.equals("보"))
			{
				System.out.println("사용자 = " + name + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
			}
		}
		
		if (name.equals("그만")) 
		{
			System.out.println("종료합니다.");
			break;
		}
		
		}sc.close();
		
		
	}

}
