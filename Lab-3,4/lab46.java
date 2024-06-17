
public class lab46 {
   public static void main(String[] args) {

    String st= args[0];
    int count=0;

   for(char i='A';i<='Z';i++){
    if(st.charAt(0)==i){
            count++;
            System.out.println("upper case chhe bhai.");
            break;
    }
   }if(count==0){
    System.out.println(".....ErroR.....");
    System.exit(0);
   }
   } 
}
