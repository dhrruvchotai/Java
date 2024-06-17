public class First {
    public static void main(String[] args) {
        C1 gm = new C1();
        C2 ga = new C2();

        Thread t1 = new Thread(gm);
        Thread t2 = new Thread(ga);
        t1.start();
        t2.start();

    }
}
class C2 implements Runnable{
    public void run(){
        try{
            System.out.println("Good Afternoon");
            Thread.sleep(3000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class C1 implements Runnable{
    public void run(){
        try{
            System.out.println("Good Morning");
            Thread.sleep(1000);
        }
        catch(Exception e){
           
            e.printStackTrace();
        }
    }
}

