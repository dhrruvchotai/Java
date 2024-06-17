import java.util.*;
public class lab44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double[]arr=new double[4];
        for(int i=0;i<4;i++){
           System.out.println("enter alementsa["+(i+1)+"]= ");
           arr[i]=sc.nextDouble();
        }
        for(int i=(arr.length)-1;i>=0;i--){
            System.out.println(arr[i]);
        }
        sc.close();
        
    }
}
