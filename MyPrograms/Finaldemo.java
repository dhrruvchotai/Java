public class Finaldemo {
    public static void main(String[] args) {
    
        final int a = 5;
        System.out.println("value of a is : " +a);
        // a = 10; it cant be changed cause a is final so...
        vehicle v1 = new vehicle();
        v1.vehicleName();

    }
}
final class vehicle{
     void vehicleName(){
        System.out.println("Audi");
    }
}
// class bike extends vehicle {

// }  final class cannot have subclasses or child class

class laptop{
    final void printName(){
        System.out.println("hp");
    }
}
class hp extends laptop{
    // void printName(){

    // } this cannot be done because we cannot override final method..
    
}