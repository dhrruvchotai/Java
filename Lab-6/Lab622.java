import java.util.Scanner;

class Book{
    private String authorname;

     public Book(String authorname){
        this.authorname = authorname;
     }
     public void print(){
        System.out.println("The name of the author is : "+authorname);
     }
}
class book_publication extends Book{
    private String title;

    public book_publication(String an,String title){
        super(an);
        this.title = title;
    }
    public void print(){
        System.out.println(" ");
        super.print();
        System.out.println("The book title is : "+this.title);
    }
}
class paper_publication extends Book{
    private String title;

   public paper_publication(String an,String title){
        super(an);
        this.title = title;
    }
    public void print(){
        System.out.println(" ");
        super.print();
        System.out.println("The paper title is : "+this.title);
    }
}

public class Lab622 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Enter author name:");
        String an = sc.nextLine();

        System.out.println(" ");
        System.out.println("enter 1 for book and 2 for paper");
        int temp = sc.nextInt();

        if(temp==1){
            System.out.println(" ");
            System.out.println("Enter title of book: ");
            sc.nextLine();
            String t1 = sc.nextLine();
            System.out.println(" ");
            System.out.println("-----------------------------------------------");
            Book b1 = new book_publication(an,t1);
            b1.print();
        }
        else{
            System.out.println(" ");
            System.out.println("enter title for paper: ");
            sc.nextLine();
            String t2 = sc.nextLine();
            System.out.println(" ");
            System.out.println("-----------------------------------------------");
            Book b2 = new paper_publication(an,t2);
            b2.print();
        }
        sc.close();
        
    }
}
