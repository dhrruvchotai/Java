import java.util.*;
import java.io.*;
public class ItrDemo{
    public static void main(String[] args) {
        

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=0;i<100;i++){
            arr.add(i);
        }

        Iterator<Integer> it = arr.iterator();

        while(it.hasNext()){
            int i = it.next();
            if(i<10){
                it.remove();
            }
        }

        System.out.println(arr);
        //this clears the arraylist 
        // arr.clear();
        // System.out.println(arr);
        
        // System.out.println(arr.clone()); this clones the arraylist 
    }
}