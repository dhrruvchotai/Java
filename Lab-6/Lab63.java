import java.util.Scanner;

class member {
    String name;
    int age;
    int phonenum;
    String adress;
    int salary;

   
    public void printsal(){
        System.out.println("Salary is : "+salary);
    }
}

class Employee extends member {

    String specialization;
    String department;

    public void printdetails(){

        System.out.println(" ");
        System.out.println("Name : "+name);
        System.out.println("age : "+age);
        System.out.println("phonenumber : "+phonenum);
        System.out.println("adress : "+adress);
        System.out.println("salary : "+salary);
        System.out.println("specialization : "+specialization);
        System.out.println("department : "+department);
    }

}

class manager extends member {
    String specialization;
    String department;

    public void printdetails(){
        System.out.println(" ");
        System.out.println("Name : "+name);
        System.out.println("age : "+age);
        System.out.println("phonenumber : "+phonenum);
        System.out.println("adress : "+adress);
        System.out.println("salary : "+salary);
        System.out.println("specialization : "+specialization);
        System.out.println("department : "+department);
    }
}



public class Lab63 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("enter 1 for employee and 2 for manager");
        int temp = sc.nextInt();
    

        if(temp==1){

            Employee e1 = new Employee();

            System.out.println(" ");
            System.out.println("Enter name : ");
            sc.nextLine();
            e1.name = sc.nextLine();
            System.out.println(" ");
    
            System.out.println("Enter age : ");
            e1.age = sc.nextInt();
            System.out.println(" ");
    
            System.out.println("Enter phone number : ");
            e1.phonenum = sc.nextInt();
            System.out.println(" ");
            
            System.out.println("Enter adress : ");
            sc.nextLine();
            e1.adress = sc.nextLine();
            System.out.println(" ");
    
            System.out.println("Enter salary : ");
            e1.salary = sc.nextInt();
            System.out.println(" ");
    
            System.out.println("Enter specialization : ");
            sc.nextLine();
            e1.specialization = sc.nextLine();
            System.out.println(" ");
    
            System.out.println("Enter department : ");
            e1.department = sc.nextLine();
            System.out.println(" ");
    
            e1.printdetails();
        }

        else{
            manager m1 = new manager();
            
            System.out.println(" ");
            System.out.println("Enter name : ");
            sc.nextLine();
            m1.name = sc.nextLine();
            System.out.println(" ");
    
            System.out.println("Enter age : ");
            m1.age = sc.nextInt();
            System.out.println(" ");
    
            System.out.println("Enter phone number : ");
            m1.phonenum = sc.nextInt();
            System.out.println(" ");
            
            System.out.println("Enter adress : ");
            sc.nextLine();
            m1.adress = sc.nextLine();
            System.out.println(" ");
    
            System.out.println("Enter salary : ");
            m1.salary = sc.nextInt();
            System.out.println(" ");
    
            System.out.println("Enter specialization : ");
            sc.nextLine();
            m1.specialization = sc.nextLine();
            System.out.println(" ");
    
            System.out.println("Enter department : ");
            m1.department = sc.nextLine();
            System.out.println(" ");
    
            m1.printdetails();
        }
        sc.close();
    }

}
