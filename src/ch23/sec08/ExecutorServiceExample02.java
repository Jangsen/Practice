package ch23.sec08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample02 {
	public static void main(String[] args) {
		ExecutorService threadPool = new ThreadPoolExecutor(
				3,									//코어 스레드 개수
				100,								//최대 스레드 개수
				120L,								//놀고 있는 시간
				TimeUnit.SECONDS,					//놀고 있는 시간 단위
				new SynchronousQueue<Runnable>()	//작업 큐
		);
	}
}
