package ATM;

import java.util.Scanner;
public class Main {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("                   Welcome to Nexus ATM Booth.");
        System.out.println("                  Please, enter your ATM Card.\n");

        System.out.print("Please enter your Card Number: ");
        Account_Info person = new Account_Info();
        person.setAcNumber(sc.nextInt());
        System.out.print("Please enter your Pin Number: ");
        person.setPin(sc.nextInt());

        Display display = new Display();
        display.display();

        Functions ab = new Functions();
        ab.functions();

        Message ms = new Message();
        ms.ending_message();
    }
}
