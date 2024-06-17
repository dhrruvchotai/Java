import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 0;

        System.out.println("What would you like to do deposit or withdraw");
        System.out.println("enter d for deposit and w for withdraw");
        String s = sc.next();

        if ((s.charAt(0)) == 'd') {
            System.out.println("Enter money to deposit : ");
            int deposit = sc.nextInt();
            balance = +deposit;
        }

        else if ((s.charAt(0)) == 'w') {
            System.out.println("Enter money to withdraw: ");
            int withdraw = sc.nextInt();
            try {
                if (withdraw <= balance) {
                    balance = -withdraw;
                } else {
                    throw new InSufficientFundException();
                }
            } catch (InSufficientFundException ISFE) {
                System.out.println(ISFE.getMessage());
            }

        }

    }
}

class InSufficientFundException extends Exception {
    InSufficientFundException() {
        super("Insufficiant balanace");
    }
}
