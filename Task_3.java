import java.util.Scanner;
public class Atm 
{

    public static void main(String args[]) 
    {
        int balance = 50000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        int pin = 12345;
        System.out.println("Please enter your ATM PIN Number : ");
        int password = sc.nextInt();
        int i = 1;
        if (password != pin) 
        {
            while (true) 
            {
                i++;
                System.out.println("Wrong ATM PIN No !! ");
                System.out.println("Please Re-enter your pin (Max. Attempts :- 3) : ");
                password = sc.nextInt();
            }
        }
        if (password == pin) 
        {
            System.out.println("=================================( Welcome to the ATM services )===============================");
            while (true) 
            {
                System.out.println("1. Check your Balance amount");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Exist");
                System.out.print("Enter Choice : ");
                int choice = sc.nextInt();
                switch (choice) 
                {
                    case 1:
                        System.out.println("Your Balance is : " + balance);
                       // System.out.println("");
                        break;
                    case 2:
                        System.out.println("Enter the amount you want to Withdraw : ");
                        withdraw = sc.nextInt();
                        if (withdraw > balance || balance == 0) 
                        {
                            System.out.printf("You have insufficient balance!!\n");
                            break;
                        }
                        System.out.println("Hope you collected your amount!");
                        balance = balance - withdraw;
                       // System.out.println("");
                        break;
                    case 3:
                        System.out.print("Enter money to be deposited: ");
                        deposit = sc.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your Money has been successfully deposited");
                      //  System.out.println(" ");
                        break;
                    case 4:
                        System.out.println("Enter the account number");
                        long account = sc.nextLong();
                        System.out.println("enter the amount to be transfer");
                        int amount = sc.nextInt();
                        System.out.println("1. To confirm\n 2. To Stop");
                        int select=sc.nextInt();
                        if(select==1)
                        {
                            balance -= amount;
                            System.out.println("Amount Transferred Successfully ");
                        }
                      /*  else if(select==2)
                        {
                            System.out.println("transaction cancelled");
                        }
*/
                        break;
                    case 5:
                        System.out.println("Thank you for using ATM!");
                        System.exit(0);
                }
            }
        }
        sc.close();
    }

}
