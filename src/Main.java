import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static ATM bcu = new ATM();
    static Scanner scan = new Scanner(System.in);
    static String choice = "";


    public static void selection() {
        do {
            String choices = "Select one of the options: \n1: Create an account \n" + "2: Check balance \n" + "3: Deposit \n" + "4: Withdraw \n" + "5: Exit \n";
            System.out.println(choices);
            choice = scan.nextLine();
            if (choice.equals("1")) {
                System.out.println("Your choice was 1");
                bcu.createAccount();

            } else if (choice.equals("2")) {
                System.out.println("Your choice was 2");
                bcu.printAccounts();

            } else if (choice.equals("3")) {
                System.out.println("Your choice was 3");
                bcu.updateBalance();

            } else if (choice.equals("4")) {
                System.out.println("How much would you like to withdraw? ");
                choice = String.valueOf(scan.nextInt());
                bcu.deleteWithdraw();

            } else if(choice.equals("5")) {
                System.out.println("Would you like to save your transaction?");
                choice = scan.nextLine();
            }if(choice.equals("yes")) {
                ATM.loadData();

                ATM.saveData();
                System.out.println("See you soon!");

            } else if (choice.equals("no")) {
                System.out.println("See you soon!");

            }
        }while(choice.equals("5") == false);

        }

    public static void main(String[] args) {

        selection();
//        ATM.saveData();
    }
}





