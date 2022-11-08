import java.util.Scanner;

public class Main {
    static ATM bcu = new ATM();
    static String choice = "";
    static Scanner scan = new Scanner(System.in);

    public static void selection() {
        String pick;
        do {
            String choices = "Select one of the options: \n1: Check balance \n" + "2: Deposit\n" + "3: Previous transaction \n" + "4: Calculate transaction\n" + "5: Exit \n";
            pick = scan.nextLine();
            if (pick.equals(1)) {
                System.out.println("Your choice was 1");
                bcu.createAccount();
                // }
            }

        }while (true) ;
    }
    public static void main(String[] args) {
    selection();
    }
}