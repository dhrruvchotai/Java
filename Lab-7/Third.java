// 3. The Transport interface declares a deliver () method. The abstract 
// class Animal is the super class of the Tiger, Camel, Deer and 
// Donkey classes. The Transport interface is implemented by the 
// Camel and Donkey classes. Write a test program that initialize an 
// array of four Animal objects. If the object implements the 
// Transport interface, the deliver () method is invoked. 

public class Third {
    public static void main(String[] args) {
        Animal a[] = {new Tiger(),new Camel(),new Deer(),new Donkey()};
        for(Animal b : a){
            if(b instanceof Transport){
                Transport t1 = (Transport) b;
                t1.deliver();
            }
        }
    }
}
interface Transport{
    public void deliver();
}
abstract class Animal{

}
class Tiger extends Animal{

}

class Camel extends Animal implements Transport{
    public void deliver(){
        System.out.println("here is camel");
    }
}

class Deer extends Animal{

}

class Donkey extends Animal implements Transport{

    public void deliver(){
        System.out.println("here is Donkey");
    }
}