import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String orange = "\u001B[38;2;255;165;0m";
        String cyan = "\u001B[36;1m";
        String blue = "\u001B[34;1m";
        String yellow = "\u001B[33;1m";
        String red = "\u001B[31;1m";
        String reset = "\u001B[0m";
        String magenta = "\u001B[35;1m";

        System.out.println(" "+orange);
        System.out.println("  -> Avilable Converters : ");
        System.out.println(" "+yellow);
        System.out.println("     1.Decimal to Binary");
        System.out.println("     2.Decimal to Octal");
        System.out.println("     3.Decimal to HexaDecimal");
        System.out.println("     4.Binary to Decimal");
        System.out.println("     5.Octal to Decimal");
        System.out.println( "     6.HexaDecimal to Decimal"+cyan);

        System.out.println(" ");
        System.out.print("     Enter format you want to Input : "+orange);
        String i = sc.nextLine();

        System.out.print("     "+cyan+"Enter format you want to Convert : "+orange);
        String c = sc.nextLine();
        System.out.print(""+cyan);

        String n = ((i.concat(c)).toLowerCase().trim());

        Convert a = new Convert();


        if(n.equalsIgnoreCase("decimalbinary")){

            System.out.println(" "+cyan);
            System.out.print("     Enter a Decimal Number : "+orange);
            int num = sc.nextInt();

            String res = a.DecimaltoBinary(num);

            System.out.print("     "+cyan+"The Binary of "+num+" is : "+magenta);
            System.out.println(res);
            System.out.println(" "+reset);

        }
        else if(n.equalsIgnoreCase("decimaloctal")){
            
            System.out.println(" ");
            System.out.print("     Enter a Decimal Number : "+orange);
            int num = sc.nextInt();

            String res = a.DecimaltoOctal(num);

            System.out.print("     "+cyan+"The Octal representation of "+num+" is : "+magenta);
            System.out.println(res);
            System.out.println(" "+reset);

        }
        else if(n.equalsIgnoreCase("decimalhexadecimal")){
            
            System.out.println(" ");
            System.out.print("     Enter a Decimal Number : "+orange);
            int num = sc.nextInt();

            String res = a.DecimaltoHexaDecimal(num);

            System.out.print("     "+cyan+"The Hexa Decimal representation of "+num+" is : "+orange);
            System.out.println(res);
            System.out.println(" "+reset);
        }
        else if(n.equalsIgnoreCase("binarydecimal")){
            
            System.out.println(" ");
            System.out.print("     Enter a Binary Number : "+orange);
            int num = sc.nextInt();

            String res = a.DecimaltoHexaDecimal(num);

            System.out.print("     "+cyan+"The Decimal representation of "+num+" is : "+orange);
            System.out.println(res);
            System.out.println(" "+reset);
            a.BinarytoDecimal(num);
        }
        else if(n.equalsIgnoreCase("octaldecimal")){
            a.OctaltoDecimal();
        }
        else if(n.equalsIgnoreCase("hexadecimaldecimal")){
            a.HexaDecimaltoDecimal();
        }
    }
}
class Convert{

    public String DecimaltoBinary(int num){

        StringBuilder binary = new StringBuilder();

        if(num==0){
            binary.append("0");
        }
        else{
            while(num > 0){

                int rem = num % 2;
                binary.insert(0,rem);
                num/=2;
            }
        }
        return binary.toString();

    }
    public String DecimaltoOctal(int num){
        StringBuilder octal = new StringBuilder();

        if(num==0){
            octal.append("0");
        }
        else{
            while(num > 0){

                int rem = num % 8;
                octal.insert(0,rem);
                num/=8;

            }
        }
        return octal.toString();
    }
    public String DecimaltoHexaDecimal(int num){

        String hexString = Integer.toHexString(num);

        return hexString;

    }
    public void BinarytoDecimal(int num){
   }
    public void OctaltoDecimal(){
    }
    public void HexaDecimaltoDecimal(){
    }
    public void takeInput(){

    }
}