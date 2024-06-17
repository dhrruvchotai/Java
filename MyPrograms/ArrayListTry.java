import java.util.*;
import java.io.*;
public class ArrayListTry {
    public static void main(String[] args) {
        
        ArrayList<Integer> arr1 = new ArrayList<Integer>(5);//intialize an arryalist with its size 5.
        //and intialcapacty is resizable if give 5 you can add 10 elemetns.
        ArrayList<Integer> arr2 = new ArrayList<Integer>();//intialize an arraylist witout size

        //first of this two are empty
        // System.out.println("Array 1 is : "+arr1);
        // System.out.println("Array 2 is : "+arr2);

        for(int i=0;i<10;i++){
            arr1.add(i);
            arr2.add(i);
        }
        ArrayList Emptyarr = new ArrayList<>();//this is used to build an empty array list
        ArrayList arr = new ArrayList<>(arr1);//you can create an arraylist with this type and in the constructor you can pass other collection as shown here.


        // arr.add(2, 500);//this method is used to add an element to the arraylist which starts with an index an element.
        
        //this prints the whole arraylist 
        // System.out.println("Array 1 is : "+arr1);
        // System.out.println("Array 2 is : "+arr2);
        // System.out.println("Array is : "+arr );


        //printing using iterator
        // Iterator<Integer> it = arr1.iterator();

        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }


    }
}
