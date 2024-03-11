package ex4.common.exception;

import java.util.Calendar;

public class RentException extends Exception{
	private String mesg;//���޵� ���� ������ �����ϴ� ����
	public RentException(String mesg){
		this.mesg=mesg;
	}
	public String toString(){
		return "���� �޽����� : " +mesg;
	}
	
	public String getRentExceptionInfo(){
		String errMsg="���ܹ߻� �ð�: "+showErrTime() +" ���� ����:"+mesg;
		return errMsg;
	}
	
	//��ȸ�� �������� �ð� ������ �����ϴ� �޼ҵ�
	public static String showErrTime(){
		String date=null;
		String time=null;
		Calendar cal=Calendar.getInstance();
			
		int hour=cal.get(Calendar.HOUR);
		int min=cal.get(Calendar.MINUTE);
		int sec=cal.get(Calendar.SECOND);
			
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1;
		int day=cal.get(Calendar.DATE);
			
		date=year+ "-"+ month + "-"+day;
		time=hour +":"+min+":"+sec;
		return date+ " " +time;
	}
}