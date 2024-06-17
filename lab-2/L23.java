// Write a program to create basic calculator by getting 2 numbers and 1 string (operation) from the user and apply the 
// operation given in a string on the given numbers.

import java.util.Scanner;

public class L23 {

    public static void main(String[] args) {

        
         Scanner sc = new Scanner(System.in);

         String s1 = sc.next();
        char ch = s1.charAt(0);

         int a = sc.nextInt();
         int b = sc.nextInt();


        if(ch=='+'){
            System.out.println(a+b);
        }
        else if(ch=='-'){
            System.out.println(a-b);
        }
        else if(ch=='*'){
            System.out.println(a*b);
        }
        else if(ch=='/'){
            if(b!=0){
                    System.out.println(a/b);
                    }
                else{
                        while(b==0){
                            System.out.println("Enter b Except 0 :");
                            b = sc.nextInt();
                        
                            }
                    }
                     }
            else if(ch=='%'){
            System.out.println(a%b);
            }
            sc.close();
    }
}
