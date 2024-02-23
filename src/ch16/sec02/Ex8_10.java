package ch16.sec02;

import java.io.*;

public class Ex8_10 {
	public static void main(String[] args) {
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName()+ " 파일이 성공적으로 생성되었습니다");
		} catch (Exception e) {
			System.out.println(e.getMessage()+ " 다시 입력해 주시기 바랍니다");
		} 
	}	// main 메소드의 끝

	 static File createFile(String fileName) throws Exception {
		 if(fileName == null || fileName.equals(""))
			 throw new Exception("파일이름이 유효하지 않습니다");
		 File f = new File(fileName);	//File 클래스의 객체 생성
		 //	File 객체의 createNewFile 메소드를 이용해서 실제 파일을 생성
		 f.createNewFile();
		 return f;		//생성된 객체의 참조를 반환
	 }	//createFile메소드의 끝
}		//클래스의 끝
