import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Fourth {
    public static void main(String[] args) {

        String fname = "Stu1.txt";
        try{

            DataOutputStream dos = new DataOutputStream(new FileOutputStream(fname));
            dos.writeUTF("Dhruv");
            dos.writeInt(18);
            dos.writeUTF("Het");
            dos.writeInt(18);
            dos.writeUTF("Mann");
            dos.writeInt(18);
            
        }
        catch(Exception e){
            e.printStackTrace();
        }

        try{
            DataInputStream dis = new DataInputStream(new FileInputStream(fname));
            String s = " ";

            while(dis.available()>0){
               
                String name = dis.readUTF();
                int  age = dis.readInt();

                Student stu = new Student(name, age);
                System.out.println(stu);
            }

            

            dis.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
   
    }
}

class Student{

    String name = " ";
    int age = 0;

    public Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "The name is "+name+" and the age is : "+age;
    }
}

