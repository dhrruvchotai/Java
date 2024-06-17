import java.util.Scanner;

public class Second{
public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);

    System.out.println("Enter a number : ");
    int a = sc.nextInt();

    try{
        if(a<0){
            throw new Negative();
        }
        if(((a/10)%2) == 0){
            throw new Evenlydivisible();
        }
        if(a>1000 && a<2000){
            throw new Grater1000();
        }
        if(a>7000){
            throw new Grater7000();
        }
    }
    catch(Negative n){
        System.out.println(n.getMessage());
    }
    catch(Evenlydivisible ed){
           System.out.println( ed.getMessage());
    }
    catch(Grater1000 gt){
            System.out.println(gt.getMessage());
    }
    catch(Grater7000 gs){
        System.out.println(gs.getMessage());
    }
}
}

class Negative extends Exception{
    Negative(){
        super("Number is negative");
    }
    
}
class Evenlydivisible extends Exception{
    Evenlydivisible(){
        super("The Number is evenly divisible by 10");
    }
}
class Grater1000 extends Exception{
    Grater1000(){
        super("Number is grater than 1000 and less than 2000");
    }
}
class Grater7000 extends Exception{
    Grater7000(){
        super("Number is greater 7000");
    }
}   
