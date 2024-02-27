package ttttttttttttttttttteeeeeeeeeeeeesssssssssssssttttttttttt;

public class ThreadTest {
    public static void main(String[] args) {
        //쓰레드를 생성한 후에 start()를 호출해야 쓰레드가 작업을 시작
        MyThread t1 = new MyTgread();
        t1.start();
        
    }
    calss MyThread extends Thread{
        public void run(){
            
        }
    }
}