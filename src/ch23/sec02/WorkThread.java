package ch23.sec02;

public class WorkThread extends Thread{
	//필드 
	public boolean work = true;
	
	//생성자
	public WorkThread(String name) {
		setName(name);
	}

	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + "작업처리");
			}else{
				Thread.yield();		//실행 대기(나머지 스레드가 실행종료 될 때까지)
			}
		}
	}
	

}
