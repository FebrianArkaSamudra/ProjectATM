
import java.util.Scanner;

public class Systembank {
    static void Withdraw (String[][] hist){
    Scanner scan = new Scanner(System.in);
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
                                
                                
                                break;
                            case 2:
                                System.out.println("====================================");
                                System.out.println("    You Withdrawal : Rp 250.000  ");
                                System.out.println("        Transaction Complete     ");
                                System.out.println("            Thank You :)        ");
                                System.out.println("====================================");
                                
                                break;
                            case 3:
                                System.out.println("====================================");
                                System.out.println("    You Withdrawal : Rp 500.000  ");
                                System.out.println("        Transaction Complete     ");
                                System.out.println("            Thank You :)        ");
                                System.out.println("====================================");
                                
                                break;
                            case 4:
                                System.out.println("====================================");
                                System.out.println("   You Withdrawal : Rp 1.000.000");
                                System.out.println("        Transaction Complete     ");
                                System.out.println("            Thank You :)        ");
                                System.out.println("====================================");
                                
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
                                
                                break;
                        }
                        System.out.println("Do you want back to menu?(y/n)");
                        String choosewitdrawal = scan.next();

                        if (choosewitdrawal.equalsIgnoreCase("y")) {
                            
                        } 
                        else{
                            System.out.println("Thank you");
                            System.exit(0);
                        }
                        int currentMaxIdx = hist.length-1;
                        hist[currentMaxIdx+1][0] = "user";
                        hist[currentMaxIdx+1][1] = witdrawalamount+"";
                        hist[currentMaxIdx+1][2] = "withdrawal";
                        
    }   

    static void Topup (int id,int[]balance,String[][] hist){
        Scanner scan = new Scanner(System.in);
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
                        System.out.println("Saldo sisa anda" +balance[id]);
                        
                        
                        
                    } else
                    System.out.println("Okey");
                    
                    
                    
                
                    
                    
    }

    static void Transfer(int id,String[][] hist){
        Scanner scan = new Scanner(System.in);
     int[] balancee = { 1000000, 1000000, 1000000, 1000000 };
                        System.out.println("Input account :");
                        String account = scan.next();
                        System.out.println("Input nominal :");
                        int transfers = scan.nextInt();
                        System.out.println("balance succeeded transfers to " + account + "amount of Rp." + transfers);
                        int balanceAmount = balancee[id] - transfers;
                        System.out.println("Your balance amount is " + balanceAmount);
                        System.out.println("====================================");
                        System.out.println(" balance succeeded transfers to " + account);
                        System.out.println("   amount of : Rp " + transfers);
                        System.out.println("        Transfers Complete     ");
                        System.out.println("            Thank You :)        ");
                        System.out.println("====================================");
                        

                        System.out.print("Back to the menu (y/n) ?");
                        String exit = scan.next();
                        switch (exit) {
                            case "y":
                                System.out.println("Back to the menu");
                                break;
                            case "n":
                                System.out.println("Thank you");
                                System.exit(0);
                                break;
                        }
                        
    }

    static void Payment(int id,int[]balance,int[]billPdam,int[]billPln,boolean payment,String[] codeNumPDAM,String[] userLogin,String[] codeNumPLN,String[][] hist){
        Scanner scan = new Scanner(System.in);
        do {
                            
                            System.out.println("\n Menu payment");
                            System.out.println("1. PDAM");
                            System.out.println("2. PLN ");
                            System.out.println("3. Exit");
                            int choosePayment = scan.nextInt();

                            switch (choosePayment) {
                                case 1:
                                    System.out.print("Input username PDAM : ");
                                    String usernamePDAM = scan.next();
                                    System.out.print("Input phone number PDAM : ");
                                    String phonePDAM = scan.next();
                                    for (int x = 0; x < userLogin.length; x++) {
                                        if (usernamePDAM.equals(userLogin[id]) && phonePDAM.equals(codeNumPDAM[id])) {
                                            
                                            System.out.println("Your PDAM bill is " + billPdam[id]);
                                            System.out.println("Do you want to pay your bill(y/n)?");
                                            String billPDAM = scan.next();
                                            switch (billPDAM) {
        
                                                case "y":
                                                    System.out.println("your payment is succesfull");
                                                    balance[id] = balance[id] - billPdam[id];
                                                    System.out.println("Your balance amount is " + balance[id]);
                                                    break;
                                                case "n":
                                                    System.out.println("Thank you");
                                                    payment = false;
                                                    break;
                                                default:
                                                    System.out.println("Invalid input. Please enter 'y' or 'n'.");
                                                    break;
                                                }
                                               break;
                                            }
                                            else {
                                               System.out.println("Username or Code number wrong");
                                               break;
                                           }
                                        }
                                        break;
                                    


                                case 2:
                                    System.out.print("Input username PLN : ");
                                    String usernamePLN = scan.next();
                                    System.out.print("Input phone number PLN : ");
                                    String phonePLN = scan.next();
                                    for (int x = 0; x < userLogin.length; x++) {
                                        if (usernamePLN.equals(userLogin[id]) && phonePLN.equals(codeNumPLN[id])) {
                                            System.out.println("Your PLN bill is " + billPln[id]);
                                        System.out.println("Do you want to pay your bill(y/n)?");
                                        String billPLN = scan.next();
                                        switch (billPLN) {

                                            case "y":
                                                System.out.println("your payment is succesfull");
                                                balance[id] = balance[id] - billPln[id];
                                                System.out.println("Your balance amount is " + balance[id]);
                                                break;
                                            case "n":
                                                System.out.println("Thank you");
                                                payment = false;
                                                break;
                                            default:
                                                System.out.println("Invalid input. Please enter 'y' or 'n'.");
                                        }
                                            break;
                                        }
                                        else {
                                           System.out.println("Username or Code number wrong");
                                           break;
                                       }
                                    }
                                    
                                        
                                    break;

                                    

                                case 3:
                                    payment = false;
                                    break;
                                default:
                                    System.out.println("Wrong");
                            }
                            
                        } 
                        while (payment);
                        
                        
    }
    
    static void balanceinfo (int id,int []balance,String[]userLogin,String[][] hist){
        Scanner scan = new Scanner(System.in);
        System.out.println("Balance Info:");
                        System.out.println("Username: " + userLogin[id]);
                        System.out.println("Balance: Rp " + balance[id]);
                        System.out.println("\n You want back to menu \n Y/N?");
                        String back = scan.next();
                        if (back.equalsIgnoreCase("y")) {
                            
                        } 
                        else{
                            System.out.println("Thank you");
                            System.exit(0);
                        }
                        
    }
    public static void main(String[] args) {
        String[][] history = new String[50][3];
        Scanner scan = new Scanner(System.in);
        boolean login = true;
        boolean menu = true;
        boolean payment = true;
        String[] userLogin = { "Arka", "Baq", "Majid", "Xavier" };
        String[] password = { "123", "456", "789", "987" };
        int[] balance = { 10000000, 9000000, 2000000, 5000000 };
        int[] billPdam = { 250000, 150000, 200000, 300000 };
        String[] codeNumPDAM = { "12345", "54321", "12468", "13577" };
        int[] billPln = { 200000, 100000, 175000, 250000 };
        String[] codeNumPLN = { "12345", "54321", "12468", "13577" };
        int id = -1;
        while (login) {
            System.out.print("~ Input Username = ");
            String user = scan.next();
            System.out.print("~ Input Password = ");
            String pass = scan.next();

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

        
            while (menu) {
                System.out.println("");
                System.out.println("====================================");
                System.out.println( "------ Welcome to Bank Qwerty ------");
                System.out.println("====================================");
                System.out.println("Choose the menu : ");
                System.out.println("1. Withdraw");
                System.out.println("2. Top up");
                System.out.println("3. Transfer");
                System.out.println("4. Payment");
                System.out.println("5. Balance Info");
                System.out.println("6. History");
                System.out.println("7. Exit");
                System.out.println("Choose your option");
                int pilihan = scan.nextInt();
                System.out.println("====================================");
                switch (pilihan) {
                    case 1:
                    Withdraw(history);
                    break;
                    
                        
                    case 2:
                    Topup(id, balance, history);
                    break;
                    case 3:
                    Transfer(id, history);
                    break;
                    case 4:
                    Payment(id, balance, billPdam, billPln, payment, codeNumPDAM, userLogin, codeNumPLN, history);
                    break;
                    case 5:
                    balanceinfo(id, balance, userLogin, history);
                    break;


                    case 6:
                        

                    case 7: menu =false;
                            break;
                    default:
                        System.out.println("Enter the correct option!");
                        break;

                }
            }

        }
    }
}