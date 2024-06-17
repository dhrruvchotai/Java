import java.util.Scanner;

public class Third {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter m :");
        int m = sc.nextInt();

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.println("Enter element at : "+i+j);
                    arr[i][j] = sc.nextInt();
                }
            }

        MyThread T[] = new MyThread[m];

        for(int i=0;i<m;i++){
            T[i]=new MyThread(i, arr);
            T[i].start();
        }

    }
}
class MyThread extends Thread{
    int index;
    int[][] arr;
    int sum=0;


    public void run(){
        for(int i=0;i<arr[0].length;i++){
            sum+=arr[index][i];
        }
        System.out.println("The sum of row "+index+"is"+sum);
    }

    MyThread(int a,int[][] arr){
        index=a;
        this.arr=arr;
    }
}



