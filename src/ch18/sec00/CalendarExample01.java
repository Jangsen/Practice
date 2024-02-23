package ch18.sec00;

import java.util.Calendar;
import java.util.Date;

public class CalendarExample01 {
	public static void main(String[] args) {
		Calendar dt = Calendar.getInstance();
		// Tue Aug 29 07:13:03 KST 2017
		System.out.println(new Date(dt.getTimeInMillis( ) ) );

		dt.clear( );	//모든 필드를 초기화
		//// Tue Jun 01 00:00:00 KST 1970
		System.out.println(new Date(dt.getTimeInMillis( ) ) );
	}

}
