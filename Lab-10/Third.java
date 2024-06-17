import java.io.BufferedReader;
import java.io.FileReader;

public class Third {
    public static void main(String[] args) {
        try{

            int fcount=0;

        FileReader fr = new FileReader("Data.txt");
        BufferedReader br = new BufferedReader(fr);

        String s = br.readLine();
        while(s!=null){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == 5){
                    fcount++;
                }
                else{
                    s = br.readLine();
                }
            }
        }

        }

        catch(Exception e){
            e.printStackTrace();
        } 

        
}
}
 