package construct;

class Car {

		String color;		//색상
		String gearType;	//변속기 종류 -auto 자동 , stick 수동
		int door;			//문의 개수
		
//		Car() { }	//기본 생성자에서
//		Car(){		//매개변수를 지정해주지 않으면 iv 들을 디폴트값으로 초기화함.
					//기본으로 흰색에 오토에 문 4개의 차를 만든다.
//			color = "white";		//iv
//			gearType = "auto";	//iv
//			door = 4;		//iv
//		}		
		Car() {	//위 내용에서 중복을 제거한 코드
			//Car("white","auto",4);
			this("white","auto",4);
		}
		Car(String c, String g, int d){ //매개변수가 있는 생성자
			color = c;
			gearType = g;
			door = d;
		}
		
}


