import java.util.HashMap;
import java.util.Scanner;

public class ATM {
    HashMap<Integer, Account> accounts = new HashMap<>();

    Scanner scan = new Scanner(System.in);
    int amount;
    int balance = 0;
    int deposit;




    public void printAccounts(){
        for (Account account : accounts.values()) {
            account.print();
        }
    }
    public void createAccount(){
        System.out.println("Let's open an account!" + "\nWhat is your name?");
        String name = scan.nextLine();

        System.out.println("Let's create you an account number");
        int accountNumber = scan.nextInt();
        scan.nextLine();

        System.out.println("Your balance is: " + balance);

        System.out.println("How much would you like to deposit?");
        deposit = scan.nextInt();
        scan.nextLine();

        Account account = new Account(name, accountNumber, balance, deposit);

        accounts.put(accountNumber, account);

        this.printAccounts();
    }
    public void updateBalance(){
        System.out.println("Your balance is " + balance + deposit + " How much do you want deposit?");
        amount = scan.nextInt();
        if (amount != 0) {
            balance = balance + amount;
            int setPreviousTransaction = amount;
    }
    }
    public void deleteWithdraw(){
//        System.out.println("Enter the amount you want to withdraw: ");
//        amount = scan.nextInt();

        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amount + "\tTransaction failed...!!" );
        }

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
