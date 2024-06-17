public class Second {
    public static void main(String[] args) {
        Odd o1 = new Odd();
        Even e1 = new Even();

        o1.start();
        e1.start();
    }
}
class Odd extends Thread{
    public void run(){
        for(int i=0;i<=20;i++){
            if(i%2!=0){
             try{
                Thread.sleep(1000);
                System.out.println("Odd : "+i);
             }
             catch(InterruptedException e){
                e.printStackTrace();
             }
            }
        }
    }
}
class Even extends Thread{
    public void run(){
        for(int i=0;i<=20;i++){
            if(i%2==0){
                try{
                    Thread.sleep(1000);
                    System.out.println("Even :"+i);
                }
                catch(InterruptedException e){
                    e.printStackTrace();                    
                }
            }
        }
    }
}
