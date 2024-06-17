public class lab47 {
    public static void main(String[] args) {
        String st="stream";
        for(int i=0;i<=st.length()-1;i++){
            for(int j=0;j<=i;j++){
                System.out.print(st.charAt(j));
            }
            System.out.println();
        }
    }
}
