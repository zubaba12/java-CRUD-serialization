import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class ATM {
    static HashMap<Integer, Account> accounts = new HashMap<>();

    Scanner scan = new Scanner(System.in);
    int amount;
    int balance;
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

        System.out.println("\nHow much would you like to deposit?");
        deposit = scan.nextInt();
        scan.nextLine();

        Account account = new Account(name, accountNumber, balance, deposit);

        accounts.put(accountNumber, account);

        this.printAccounts();
    }
//    public void setBalance(){
//        balance + deposit = balance;
//    }
    public void updateBalance(){
        System.out.println("Your balance is " + (balance + deposit) + "\nHow much do you want deposit?");
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
//            for (Integer act : accounts.keySet()){
////        Product p;//= new Product("toothpaste", "minty fresh", 3.49, 1);
//        if(act == iD){
//            //todo: update this product
//            this.accounts.remove(act);
//        }
//    }
//public class ATM {
    public static void saveData(){
        try{
            FileOutputStream fileOut = new FileOutputStream("atm.ser");
            // ^ opening a connect to a new file and allowing to connect
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            // ^ streaming data from an object into a file
            out.writeObject(accounts);
            // take this object and i'm lobbing it
            out.close();
            // close it once we are done with the file
            fileOut.close();
            // close it once we are done with the file
            System.out.println("Serialized data is saved!");


        }catch (IOException i) {
            i.printStackTrace();
            // history of all the methods that were called - allows us to see where the code went wrong.
            //principle of a stack is similar to pringles - last in, first out
        }

    }
    public static void loadData(){

        // this create an object of type employee to receive data from file or return

        try {
            // read object from a file
            FileInputStream file = new FileInputStream("atm.ser");
            // create a connect to a file
            ObjectInputStream in = new ObjectInputStream(file);

            // method for deserialization for an object
            accounts = (HashMap<Integer, Account>) in.readObject();
            // ^ read object and convert data to type Employee

            in.close();
            file.close();

            System.out.println("Object has been deserialized");
            System.out.println(accounts.values());


        } catch (IOException i){
            i.printStackTrace();

        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }


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
//}
