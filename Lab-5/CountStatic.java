public class CountStatic {
    static int a = 0;

    CountStatic(){
        a++;
    }
    public static void main(String[] args) {
    CountStatic c1 = new CountStatic();
    CountStatic c2 = new CountStatic();
    CountStatic c3 = new CountStatic();

    System.out.println(a);
    }
}