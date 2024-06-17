// 4. Create interface EventListener with performEvent() method. Create 
// MouseListener interface which inherits EventListener along with 
// mouseClicked(), mousePressed(), mouseReleased(), mouseMoved(), 
// mouseDragged() methods. Also create KeyListener interface which 
// inherits EventListener along with keyPressed(), keyReleased() 
// methods. WAP to create EventDemo class which implements 
// MouseListener and KeyListener and demonstrate all the methods of 
// the interfaces.

public class Fourth {
    public static void main(String[] args) {
        EventDemo e1 = new EventDemo();
        e1.performEvent();
        e1.mouseClicked();
        e1.mouseDragged();
        e1.mousePressed();
        e1.mouseReleased();
        e1.keyPressed();
        e1.keyReleased();
    }
}
interface EventListener{ 
    public void performEvent();
}
interface MouseListener extends EventListener{
    public void mouseClicked();
    public void mousePressed();
    public void mouseReleased();
    public void mouseDragged();
}
interface KeyListener extends EventListener{
    public void keyPressed();
    public void keyReleased();

}
class EventDemo implements MouseListener,KeyListener{
    public void performEvent(){
        System.out.println(" ");
    System.out.println("Hello performEvent");
    }
    public void mouseClicked(){
        System.out.println("hello mouseClicked");
    }
    public void mousePressed(){
        System.out.println("hello mousePressed");
    }
    public void mouseReleased(){
        System.out.println("hello mouse released");
    }
    public void mouseDragged(){
        System.out.println("hello mousedragged");
    }
    public void keyPressed(){
        System.out.println("hello mousePressed");
    }
    public void keyReleased(){
        System.out.println("hello keyRealsed");
    }
}