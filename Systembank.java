import java.net.Socket;
import java.util.Scanner;

public class Systembank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean login = true;
        boolean menu = false;
        boolean payment = true;
        String[] userLogin = { "Arka", "Baq", "Majid", "Xavier" };
        String[] password = { "123", "456", "789", "987" };
        int[] balance = { 100, 1000, 10000, 100000 };
        int[]topup = new int[4];
        int id = 0 ;
        while (login) {
            System.out.print("~ Input Username = ");
            String user = scan.next();
            System.out.print("~ Input Password = ");
            String pass = scan.next();
            int userLoginIndex = -1;
           
            for (int x = 0; x < userLogin.length; x++) {
                if (user.equals(userLogin[x]) && pass.equals(password[x])) {
                    System.out.println("LOGIN SUCCESS !!");
                    login = false;
                    menu = true;
                    id = x;
                    break;
                }
            }
                if (login) {
                    System.out.println("Login Failed");
                    break;
                }
                
            int idxTopup = 0;   
            while (menu) {
                System.out.println("");
                System.out.println("====================================");
                System.out.println("------ Welcome to Bank Qwerty ------");
                System.out.println("====================================");
                System.out.println("Choose the menu : ");
                System.out.println("1. Withdraw");
                System.out.println("2. Top up");
                System.out.println("3. Transfer");
                System.out.println("4. Payment");
                System.out.println("5. Balance Info");
                System.out.println("Choose your option");
                int pilihan = scan.nextInt();
                System.out.println("====================================");
                switch (pilihan) {
                    case 1:
                        System.out.println("Please select the withdrawal amount");
                        System.out.println("1. Rp 100.000");
                        System.out.println("2. Rp 250.000");
                        System.out.println("3. Rp 500.000");
                        System.out.println("4. Rp 1.000.000");
                        System.out.println("5. Other Amount");
                        System.out.println("====================================");
                        System.out.print("Choose Nominal : ");
                        int witdrawalamount = scan.nextInt();

                        switch (witdrawalamount) {
                            case 1:
                                System.out.println("====================================");
                                System.out.println("    You Withdrawal : Rp 100.000  ");
                                System.out.println("        Transaction Complete     ");
                                System.out.println("            Thank You :)        ");
                                System.out.println("====================================");
                                menu = false;
                                break;
                            case 2:
                                System.out.println("====================================");
                                System.out.println("    You Withdrawal : Rp 250.000  ");
                                System.out.println("        Transaction Complete     ");
                                System.out.println("            Thank You :)        ");
                                System.out.println("====================================");
                                menu = false;
                                break;
                            case 3:
                                System.out.println("====================================");
                                System.out.println("    You Withdrawal : Rp 500.000  ");
                                System.out.println("        Transaction Complete     ");
                                System.out.println("            Thank You :)        ");
                                System.out.println("====================================");
                                menu = false;
                                break;
                            case 4:
                                System.out.println("====================================");
                                System.out.println("   You Withdrawal : Rp 1.000.000");
                                System.out.println("        Transaction Complete     ");
                                System.out.println("            Thank You :)        ");
                                System.out.println("====================================");
                                menu = false;
                                break;
                            case 5:
                                System.out.println("Multiples Of Rp 50.000");
                                System.out.print("Type The Amount : ");
                                int typeamount = scan.nextInt();
                                System.out.println("====================================");
                                System.out.println("   You Withdrawal : Rp " + typeamount);
                                System.out.println("        Transaction Complete     ");
                                System.out.println("            Thank You :)        ");
                                System.out.println("====================================");
                                menu = false;
                                break;
                        }
                        break;
                    case 2:
                        
                        //for (int i=0;i<topup.length;i++) {
                        System.out.print("Input Virtual Account : ");
                        int virtualacc = scan.nextInt();
                        System.out.print("Input Nominal : ");
                        int inputnominal = scan.nextInt();
                        System.out.println("=========================================================");
                        System.out.println("You Will Topup To " + virtualacc + " Of Rp " + inputnominal);
                        System.out.println("=========================================================");
                        System.out.println("Continue To Proceed (y/n) : ");
                        String choice = scan.next();
                        if (choice.equalsIgnoreCase("y")) {
                            System.out.println("Topup Rp " + inputnominal + " To " + virtualacc);
                            System.out.println("    Done");
                            System.out.println(" Thankyou :)");
                            balance[id] = balance[id] - inputnominal;
                            topup[idxTopup++] = balance[id];
                            System.out.println("Saldo sisa anda" +balance[id]);
                            
                            
                            
                        } else
                        System.out.println("Okey");
                        menu=true;
                        login=false;
                    //}
                        
                        break; 
                        
                    case 3:
                        int amount = 9000000;
                        System.out.println("Input account :");
                        String account = scan.next();
                        System.out.println("Input nominal :");
                        int transfers = scan.nextInt();
                        System.out.println("balance succeeded transfers to " + account + "amount of Rp." + transfers);
                        int balanceAmount = amount - transfers;
                        System.out.println("Your balance amount is " + balanceAmount);

                        System.out.print("Back to the menu (y/n) ?");
                        String exit = scan.next();
                        switch (exit) {
                            case "y":
                                System.out.println("Back to the menu");
                                break;
                            case "n":
                                System.out.println("Thank you");
                                System.exit(0);
                        }
                        break;
                    case 4:
                        while (payment) {
                            System.out.println("*******");
                            System.out.println("\n Menu payment");
                            System.out.println("1. PDAM");
                            System.out.println("2. PLN ");
                            System.out.println("3. Exit");
                            int choosePayment = scan.nextInt();

                            switch (choosePayment) {
                                case 1:
                                    System.out.println("Input username PDAM : ");
                                    String usernamePDAM = scan.next();
                                    System.out.println("Input phone number PDAM : ");
                                    int phonePDAM = scan.nextInt();
                                    // System.out.println("Input payment PDAM");
                                    if (usernamePDAM.equalsIgnoreCase("Majid")) {
                                        System.out.println("Your PDAM bill is 100000 ");
                                        System.out.println("Do you want to pay your bill(y/n)?");
                                        String billPDAM = scan.next();
                                        switch (billPDAM) {

                                            case "y":
                                                System.out.println("your payment is succesfull");
                                                amount = 9000000;
                                                int pdamBill = amount - 100000;
                                                System.out.println("Your balance amount is" + pdamBill);
                                            case "n":
                                                System.out.println("Thank you");
                                                payment = false;
                                        }
                                    }
                                    // int nominalpaymentPDAM = scan.nextInt();
                                    // System.out.println("balance succesfuly paid to" + usernamePDAM +
                                    // phoneNumberPDAM + "amount of Rp." + nominalpaymentPDAM);
                                    break;

                                case 2:
                                    System.out.println("Input usernamePLN : ");
                                    String usernamePLN = scan.next();
                                    System.out.println("Input phone numberPLN : ");
                                    long phoneNumberPLN = scan.nextInt();
                                    // System.out.println("Input paymentPLN");
                                    // int nominalpaymentPLN = scan.nextInt();
                                    if (usernamePLN.equalsIgnoreCase("Majid")) {
                                        System.out.println("Your PLN bill is 2000000 ");
                                        System.out.println("Do you want to pay your bill(y/n)?");
                                        String billPLN = scan.next();
                                        switch (billPLN) {

                                            case "y":
                                                System.out.println("your payment is succesfull");
                                                amount = 9000000;
                                                int plnBill = amount - 200000;
                                                System.out.println("Your balance amount is" + plnBill);
                                                break;
                                            case "n":
                                                System.out.println("Thank you");
                                                payment = false;
                                        }
                                    }
                                    // System.out.println("balance succesfuly paid to" + usernamePLN +
                                    // phoneNumberPLN + "amount of Rp." + nominalpaymentPLN);
                                case 3:
                                    menu = true;
                                    payment = false;
                            }
                        }
                        case 5:
                        System.out.println("Balance Info:");
                        System.out.println("Username: " + userLogin[id]);
                        System.out.println("Balance: Rp " + balance[id]);
                        System.out.println("\n You want back to menu \n Y/N?");
                        String back = scan.next();
                        if(back.equalsIgnoreCase("y")){
                            menu=true;
                        }
                        else{
                            System.out.println("Thank you");
                            menu= false;
                        }
                    
                    

                
    

                }
            }

        }
    }
}