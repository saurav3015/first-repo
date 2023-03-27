import java.util.Scanner;

public class ATM
{
    public static void main(String[] args)
    {
        
        int balance = 1000;
        int  withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to SBI ATM  : ");
        System.out.println("Enter 1 for withdraw : ");
        System.out.println("Enter 2 for deposit : ");
        System.out.println("Enter 3 for check balance : ");
        System.out.println("Enter 4 for exit the process : ");
        System.out.println("Choose the opreation you want to perform");

        int choice = sc.nextInt();

        switch(choice)
        {
          case 1 : System.out.println("Enter amount you want to withdraw : ");
                   withdraw = sc.nextInt();
                   if(balance >= withdraw )
                   {
                    balance = balance - withdraw ;
                    System.out.println("Please collect your money and your balance is = " +balance );
                   }
                   else
                   {
                    System.out.println("balance is not sufficent");
                   }
                   System.out.println("");
                   break ;
           case 2 : System.out.println("Enter money to be deposit");
                    deposit = sc.nextInt();
                    balance = balance + deposit ;
                    System.out.println("Your money is Successfully deposit colllect the recipt"+balance);
                    System.out.println("");
                    break ;
           case 3 : System.out.println("Balanace : " + balance);
                    System.out.println(" ");   
                    break ;
           case 4 : System.exit(0);      

        }

    }
}