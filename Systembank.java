import java.net.Socket;
import java.util.Scanner;

public class Systembank {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        boolean login = true;
        boolean menu = false;
       
        
        while (login) {
            System.out.print("~ Input Username = ");
            String user = scan.next(); 
            System.out.print("~ Input Password = ");
            int pass = scan.nextInt();
            if (user.equals("Majid") && pass == 123){
                login = false;
                menu = true;
            } 
            else {
            System.out.println("Wrong!");
                login = true;
                menu = false;
            }
        }
        
        while (menu) {
            System.out.println("");
            System.out.println("====================================");
            System.out.println("------ Welcome to Bank Qwerty ------");
            System.out.println("====================================");
            System.out.println("1. Withdraw");
            System.out.println("2. Top up");
            System.out.println("3. Transfer");
            System.out.println("4. Payment");
            System.out.println("5. Balance Info");
            System.out.println("====================================");
            System.out.print("Choose the menu : ");
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
                    System.out.println("Input Virtual Account : ");
                    int virtualacc = scan.nextInt();
                    System.out.println("Input Nominal : ");
                    int inputnominal = scan.nextInt();
                    System.out.println("=========================================================");
                    System.out.println("You Will Topup To " + virtualacc + " Of Rp " + inputnominal );
                    System.out.println("=========================================================");
                    System.out.println("Continue To Proceed (y/n) : ");
                    String choice = scan.next();
                        if (choice.equalsIgnoreCase("y")) {
                            System.out.println("Topup Rp " + inputnominal + " To " + virtualacc);
                            System.out.println("    Done");
                            System.out.println(" Thankyou :)");
                            menu = false;
                            
                        
                        }
                        else 
                            System.out.println("Okey");
                            break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                System.out.println("Enter the correct option!");
                    break;
                    
            }
        } 
       
    }
        
}


 

