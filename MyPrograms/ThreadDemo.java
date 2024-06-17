import javax.sound.sampled.SourceDataLine;

public class ThreadDemo {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        
        t1.start();
        t2.start();
    }
}
class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
        // System.out.println("Thread 1 is running..");
        // System.out.println("hello Thread1");
        if(i%2 == 0)
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
        System.out.println("Thread 2 is running..");
        System.out.println("hello Thread2");
        }
    }
}