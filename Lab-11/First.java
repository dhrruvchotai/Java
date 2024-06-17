import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.rmi.StubNotFoundException;

public class First {
    public static void main(String[] args) {
      try{
        String filename = "Stu.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

        bw.write("Dhruv,18\n");
        bw.write("Mann,17\n");
        bw.write("Het,16\n");
        bw.close();
        System.out.println("File Written Successfully.");
      }
      catch(Exception e){
        e.printStackTrace();
      }

      try{
        String s = " ";
        String fname = "Stu.txt";
        BufferedReader br = new BufferedReader(new FileReader(fname));
        while(((s = br.readLine())!=null)){
            String[] arr = s.split(",");
            String name = arr[0];
            int age = Integer.parseInt(arr[1]);
            System.out.println("The name is : "+name+" and the age is "+age);
        }
        br.close();
      }
      catch(Exception e){
        e.printStackTrace();
      }

    }
}
// class Student{
//     String name;
//     int age;

//     Student(String name,int age){
//         this.name = name;
//         this.age = age;
//     }
//     public String toString(){
//         return "The name is : "+ name "the age is :"+age;
//     }
// }
