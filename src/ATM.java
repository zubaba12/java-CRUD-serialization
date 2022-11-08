import java.util.HashMap;
import java.util.Scanner;

public class ATM {
    HashMap<Integer, Account> accounts = new HashMap<>();

    Scanner scan = new Scanner(System.in);

    public void printAccounts(){
        for (Account account : accounts.values()) {
            account.print();
        }
    }
    public void createAccount(){
        System.out.println("Let's open an account!");
        System.out.println("What is your name?");
        String name = scan.nextLine();

        System.out.println("How much would you like to deposit?");
        int deposit = scan.nextInt();
    }
    //create: create an account
    //read: read your transaction/balance
    //update: update/deposit money
    //delete: delete/cancel transaction; withdraw money
    //1: Check balance \n" + "-----------> read
    //2: Deposit\n" + " -----------------> update
    //3: Previous transaction \n" + " ---> read
    //4: Calculate transaction \n" + " --> create
    //5: Exit \n"; ---------------------->
}
