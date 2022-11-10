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
//        Account account = new Account();
//        account.getName();
//        account.getAccountNumber();
//        account.getBalance();
//        account.getDeposit();
//        account.print();
//        ATM.loadData();

        selection();
//        ATM.saveData();
    }
}






//        When you're done head over to https://github.com
//        and follow this tutorial to set up SSH authentication
//        Once you have an SSH key linked to your local
//        machine create a new github repository called
//        java-CRUD-serialization. The repository should
//        be public. Don't select the option to add a
//        README (it'll mess up your upload).

//        Check out the photo below to see how to copy your repository ssh-url, find it in your new repo and add it to your project in intelliJ by opening the terminal and putting in the command
//        git remote add origin _____ replacing the _____ with the url you copied from github.
//        Once that is connected you should be able to run the command git push origin master from your IntelliJ and send your files to github!
//        Refresh your github project window and you should see your files.
//        (if this part doesn't work no worries, we'll show the github process next week)
//        Slack me your repository on github when you're done