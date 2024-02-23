package ch23.sec03.exam02;

public class JoinExam {
	public static void main(String[] args) {
		
//1-0. 메인 스레드 시작
		Thread thread1 = new Thread();
		Thread thread2 = new Thread();
//2-0. 첫 번째 서브 스레드 준비
		thread1.start();
		System.out.println("Thread가 종료될 때 까지 기다립니다.");
		try {
//2-1. 첫 번째 서브 스레드 실행
		thread1.join();
		}catch(InterruptedException e) {
		}
//2-2. 첫 번째 서브 스레드 종료
		
//3-0. 두 번째 서브 스레드 준비
		thread2.start();
		try {
//3-1. 두 번째 서브 스레드 실행
		thread2.join();
		}catch(InterruptedException e) {
		}
//3-1. 두 번째 서브 스레드 종료
		System.out.println("Thread가 종료되었습니다.");
	}
//1-1. 메일 스레드 종료
}
