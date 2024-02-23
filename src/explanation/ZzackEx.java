package explanation;

public class ZzackEx {

	public static void main(String[] args) {
		String[] str = { "박수 짝", "박수 짝짝" };
		int res, num, num369 = 0;
		for (int i = 1; i < 100; i++) {
			num = i;
			for (res = num % 10; num > 0; res = num % 10) {
				if (res == 3 || res == 6 || res == 9)
					num369++;
				num = num / 10;
			}
			if (num369 > 0) {
				System.out.println(i + str[num369 - 1]); // 위 조건 셋 중에 하나 해당되면 해당 되는 것을 찍는다.
			}
			num369 = 0;
		}

	}

}

//		for (int i = 1; i <= 99; i++) {
//			if (i<10 && i%3 == 0)
//			System.out.println(i + "박수짝");
//			if(i > 10 && (i/10%3 ==0) && (i%10%3 == 0) &&(i%10 != 0) ) 
// 두번째 조건 (i%10%3 == 0일 때 10의 배수들도 조건에 맞기 때문에 그들을 제거할 
//			(i%10 !=0) 조건을 추가하였다.
//			System.out.println(i +"박수짝짝");
//			if(i > 10 && (i/10%3 ==0) && (i%10%3 != 0) )
//			System.out.println(i + "박수짝");
//			if(i > 10 && (i/10%3 !=0) && (i%10%3 == 0) &&(i%10 != 0))
//			System.out.println(i + "박수짝");
//			}