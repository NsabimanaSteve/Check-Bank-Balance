import java.util.Scanner;

public class Balance
{
    public static final double OVERDRAW_PENALTY=8.00;
    public static final double INTEREST_RATE=0.02;//2% annually



    public static void main(String[] args)
    {


        double balance;
        System.out.print("Enter your checking account: $");
        Scanner keyboard=new Scanner(System.in);
        balance=keyboard.nextDouble();
        System.out.println("Original balance $" + balance);
        
        if (balance >=0)
            balance=balance*(INTEREST_RATE * balance)/12;
        else
        balance=balance-OVERDRAW_PENALTY;
        System.out.print("After adjusting for one months ");
        System.out.println("of interst and penalties,");
        System.out.println("Youe new balance is $" + balance);

    }

}