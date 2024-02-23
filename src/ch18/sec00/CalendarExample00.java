package ch18.sec00;

import java.util.Calendar;

public class CalendarExample00 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();	//현재 날짜와 시간으로 세팅
		int thisyear = cal.get(Calendar.YEAR);	//올해가 몇년인지
		int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE);	//이 달의 마지막날
		
		System.out.println(thisyear);	
		System.out.println(lastDayOfMonth);
	}

}
