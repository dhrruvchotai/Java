// 2. Write a program that illustrates interface inheritance. Interface 
// A is extended by A1 and A2. Interface A12 inherits from both P1 
// and P2.Each interface declares one constant and one method. Class 
// B implements A12.Instantiate B and invoke each of its methods. 
// Each method displays one of the constants 

public class Second {
    public static void main(String[] args) {
        B b1 = new B();
        b1.printa1();
        b1.printa2();
        b1.printa12();

    }
}
interface A{

}
interface A1 extends A{
    int const_a1 = 10;
    public void printa1();
}
interface A2 extends A{

    int const_a2 = 20;
    public void printa2();
}
interface A12 extends A1,A2{

    int const_a12 = 20;
    public void printa12();

}
class B implements A12{
    public void printa1(){

        System.out.println("the value of a1 : "+const_a1);
    }
    public void printa2(){
        System.out.println("the value of a2 : "+const_a2);
    }
    public void printa12(){
        System.out.println("the value of a12 : "+const_a12);
    }
} 
