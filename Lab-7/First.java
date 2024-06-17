// 1. The abstract vegetable class has three subclasses named Potato, 
// Brinjal and Tomato. Write a java program that demonstrates how to 
// establish this class hierarchy. Declare one instance variable of 
// type String that indicates the color of a vegetable. Crete and 
// display instances of these objects. Override the toString() method 
// of object to return a string with the name of vegetable and its 
// color. 

public class First{
    public static void main(String[] args) {
        


        System.out.println(" ");
        Vegetable v;
        v = new Potato();
        System.out.println(v.toString());
        
        System.out.println(" ");
        v = new Brinjal();
        System.out.println(v.toString());

        System.out.println(" ");
        v = new Tomato();
        System.out.println(v.toString());
    }
}
abstract class Vegetable{
    String color;
   abstract public String toString();
}
class Tomato extends Vegetable{
    Tomato(){
        color = "Red";
    }
    public String toString(){
        return "The Name of the vegetable is : Tomato and color is : "+this.color;
    }
}
class Brinjal extends Vegetable{
    Brinjal(){
         color = "Violet";
    }
    public String toString(){
        return "The Name of the vegetable is : Brinjal and color is : "+this.color;
    }
}
class Potato extends Vegetable{
    Potato(){
         color = "Yellow";
    }
    public String toString(){
        return "The Name of the vegetable is : Potato and color is : "+this.color;
    
}
}