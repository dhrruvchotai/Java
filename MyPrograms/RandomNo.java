import java.util.Scanner;
public class RandomNo{

    public static void main(String[] args) {
        
        String reset = "\u001B[0m";
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String blue = "\u001B[34m";
        String black = "\u001B[30m";
        String yellow = "\u001B[33m";
        String magenta = "\u001B[35m";
        String cyan = "\u001B[36m";
        String white = "\u001B[37m";


        Scanner sc = new Scanner(System.in);

        System.out.println(" "+red);
        System.out.println("                                                                           _____                                                                           "+red);
        System.out.println(" __________________________________________________________________________|-_-|___________________________________________________________________________"+red);
        System.out.println("                                                                           -----                                                                           "+cyan);
        System.out.println("|                                                                                                                                                          |"+cyan);
        System.out.println("|                                                           Welcome,to Number guessing game.                                                               |"+cyan);
        System.out.println("|                                                                                                                                                          |"+cyan);
        System.out.println("|                                                           Here you have to guess a number between 1 to 100                                               |"+cyan);
        System.out.println("|                                                                                                                                                          |"+cyan);
        System.out.println("|                                                           Press 1 for starting the game.                                                                 |"+cyan);
        System.out.print("|                                                                          ");  
        int n = sc.nextInt();
        // System.out.print("                                                                                                                                                           |"); 
        if(n==1){
            Number n1 = new Number();
            n1.genrateNo();
        }

        
                                
    }
}
 class Number{

    

    public void genrateNo(){

        Scanner sc1 = new Scanner(System.in);

    String reset = "\u001B[0m";
    String red = "\u001B[31m";
    String green = "\u001B[32m";
    String blue = "\u001B[34m";
    String black = "\u001B[30m";
    String yellow = "\u001B[33m";
    String magenta = "\u001B[35m";
    String cyan = "\u001B[36m";
    String white = "\u001B[37m";

        System.out.println("|                                                                                                                                                          |"+cyan);
        System.out.println("|                                                                   Enter your guess:                                                                      |"+cyan);
        System.out.print("|                                                                           ");
        int a = sc1.nextInt();
        System.out.print("                                                                                                                                                           |");

        int randno = (int)((Math.random())*100);
        check(randno,a);

    }
    public static void check(int r,int a){
        Scanner sc2 = new Scanner(System.in);

    String reset = "\u001B[0m";
    String red = "\u001B[31m";
    String green = "\u001B[32m";
    String blue = "\u001B[34m";
    String black = "\u001B[30m";
    String yellow = "\u001B[33m";
    String magenta = "\u001B[35m";
    String cyan = "\u001B[36m";
    String white = "\u001B[37m";

        while(r!=a){
                    
        if(r == a){
            System.out.println("|                                                                                                                                                          |"+cyan);
            System.out.println("|                                                       <<Hurrah! You win the game>>                                                                       |"+cyan);
        }
        else if(a>100){
            System.out.println("|                                                                                                                                                          |"+cyan);
            System.out.println("|                                                                 <<Guess between 1 to 100.>>                                                              |"+cyan);
            System.out.print("|                                                                             ");  
            a = sc2.nextInt();
        }
        else if(a>r){
            System.out.println("|                                                                                                                                                          |"+cyan);
            System.out.println("|                                                                 <<Guess Small Number.>>                                                                  |"+cyan);
            System.out.print("|                                                                           ");  
            a = sc2.nextInt();
        }
        else if(a<r){
            System.out.println("|                                                                                                                                                          |"+cyan);
            System.out.println("|                                                                 <<Guess Large Number.>>                                                                  |"+cyan);
            System.out.print("|                                                                           ");  
            a = sc2.nextInt();
        }
        }


    
    System.out.println("|                                                                                                                                                          |"+cyan);
    System.out.println("|                                                            <<Hurrah! You Guessed it Right!!>>                                                            |"+cyan);
    System.out.println("|                                                                                                                                                          |"+cyan);
    System.out.println("|                                                                                                                                                          |"+cyan+red);
    System.out.println("                                                                           _____                                                                           "+red);
    System.out.println(" __________________________________________________________________________|-_-|___________________________________________________________________________"+red);
    System.out.println("                                                                           -----                                                                           "+reset);

}
}
             
    
       
    
