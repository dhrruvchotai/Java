public class DemoClock {
    public static void main(String[] args) {
    
        String a = "my name is dhruv chotai";

        for(int i=0;i<a.length();i++){
            System.out.print(a.charAt(i));

            try{
                Thread.sleep(100);
             }
             catch(Exception e){
                 e.printStackTrace();
             }
        }
    
    }
}
