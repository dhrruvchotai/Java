import java.util.Scanner;

class Mypoint {
    int x;
    int y;

    Mypoint() {
        this.x = 0;
        this.y = 0;
    }

    Mypoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void dist(int x,int y){
        int a = this.x - x;
        int b = this.y - y;
        
        System.out.println("The dist is : "+a);
        System.out.println("The dist is : "+b);
    
    }

}

class Threedpoint extends Mypoint{

        int z;

    
        Threedpoint(){ 
            this.x=0;
            this.y=0;
            this.z=0;
        }

        Threedpoint(int x,int y,int z){
         this.x=x;
         this.y=y;
         this.z=z;
        }

        public void getz(){

            System.out.println(this.z);
        }
        public void dist(int x,int y,int z){
            int a = this.x - x;
            int b = this.y - y;
            int d = this.z - z;
            
            System.out.println("The dist is :"+a);
            System.out.println("The dist is :"+b);
            System.out.println("The dist is :"+d);
        }

}
public class Lab64 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2d or 3d point  2for 2d and 3 for 3d");
        int c = sc.nextInt();

        if(c==2){

            System.out.println("Enter x :");
            System.out.println("Enter y : ");
            Mypoint b1 = new Mypoint();
            b1.dist(1,2);
        }
        else if(c==3){
            System.out.println("Enter x : ");
            int x = sc.nextInt();
            System.out.println("Enter y : ");
            int y = sc.nextInt();
            System.out.println("Enter z: ");
            int z = sc.nextInt();

            Threedpoint t1 = new Threedpoint(x,y,z);
            Threedpoint t2 = new Threedpoint(10,30,25);
            t1.dist(10,20,25);

        }
       
    }
}
