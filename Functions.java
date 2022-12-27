package ATM;

//The main functions of the program.
import java.util.Scanner;
public class Functions {
    Scanner sc = new Scanner (System.in);
    int op = sc.nextInt();
    void functions()
    {
        switch (op)
        {
            case 1 :
                System.out.print("\nInput your withdraw amount- ");
                int amount = sc.nextInt();
                System.out.println("\nAre you sure you want to withdraw- "+"Tk."+amount);
                System.out.println("1. Yes.");
                System.out.println("2. No.");
                System.out.print("Choose your option- ");
                int oa = sc.nextInt();
                switch (oa)
                {
                    case 1 :
                        System.out.println("\nThank you! Please, take your money from machine.");
                        break;
                    case 2 :
                        System.out.println("\nYour transaction has been cancelled.");
                        break;
                    default :
                        System.out.println("Wrong Option. Thank you!");
                }
                break;
            case 2 :
                System.out.print("\nEnter your current pin- ");
                int current_pin = sc.nextInt();
                System.out.print("Enter your new pin- ");
                int new_pin = sc.nextInt();
                System.out.println("\nThank you! The pin has been changed.");
                break;
            case 3 :
                System.out.println("\nThe Balance of your account is- Tk.29807");
                break;
            case 4 :
                System.out.println("\nRedirecting to Bkash.");
                System.out.print("Enter your Bkash number- ");
                int bkash = sc.nextInt();
                System.out.print("Enter Bkash pin- ");
                int pin = sc.nextInt();
                System.out.print("Enter Amount- ");
                int amount_2 = sc.nextInt();
                System.out.println("Money has been transferred. Thank you!");
                break;
            case 5 :
                System.out.println("\nDo you actually want to exit?");
                System.out.println("1. Yes.");
                System.out.println("2. No.");
                System.out.print("Choose your option- ");
                int ob = sc.nextInt();
                switch (ob)
                {
                    case 1 :
                        System.out.println("\nThe process has been terminated.");
                        break;
                    case 2 :
                        System.out.println("\nYou have to start all over again.");
                        break;
                    default :
                        System.out.println("Wrong Option. Thank you!");
                }
                break;
            default:
                System.out.println("\nWrong option. Thank you!");
        }
    }
}
