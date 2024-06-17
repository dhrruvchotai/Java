public class Abstractdemo {
    public static void main(String[] args) {
        Audi a1 = new Audi();
        a1. printAvg();
        Swift s1 = new Swift();
        s1.printAvg();
    }
}
 abstract class Car{
     abstract void printAvg();

     // absract class may or may not have abstact method
     // but if a class have abstract method then class must be abstact
     
}
class Audi extends Car{
    public void printAvg(){
        System.out.println("Audi avg is : 14.2");
    }
}
class Swift extends Car{
    public void printAvg(){
        System.out.println(" Swift avg is :10.1");
    }
}
