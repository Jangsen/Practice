package ch25.sec02.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("D:/Temp/test2.db");
			// "D:/Temp/test2.db" 파일을 읽기 위한 FileInputStream 객체를 생성
			byte[] data = new byte[100];
			//파일에서 읽어온 데이터를 임시로 저장하기 위한 바이트 배열을 선언. 
			//이 배열의 크기는 100바이트.
			while(true) {
				//무한 반복문을 시작. 
				//이 반복문은 파일의 끝에 도달하거나 에러가 발생할 때까지 계속.
				int num = is.read(data);
				//is 객체를 통해 파일의 데이터를 최대 100바이트 읽어옴. 
				//실제로 읽은 바이트 수는 num에 저장.
				if(num == -1)
					break;
				//파일의 끝에 도달하면 read() 메서드는 -1을 반환하므로, 이를 통해 파일의 끝을 판별.
				//파일의 끝에 도달하면 무한 반복문을 종료
				for(int i = 0; i < num; i++) {
					System.out.println(data[i]);
				//바이트 배열에 저장된 데이터를 콘솔에 출력. 
				//이때, 실제로 읽은 바이트 수만큼만 출력해야 하므로 반복문의 조건은 i < num
				}
			}
			is.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
