import java.util.Scanner;

import javax.xml.transform.Source;

public class Systembank {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        boolean login = true;
        boolean menu = false;
        boolean payment = true;
        
        while (login) {
            System.out.print("Input Username = ");
            String user = scan.next(); 
            System.out.print("Input Password = ");
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
            System.out.println("5. Cash Deposit");
            System.out.println("6. Balance Info");
            System.out.println("7. Bill");
            int pilihan = scan.nextInt();
         
            switch (pilihan) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                System.out.println("Input account");
                String account = scan.next();
                System.out.println("Input nominal");
                int transfers = scan.nextInt();
                System.out.println("balance succeeded transfers to" + account + "amount of Rp." + transfers);
               
                System.out.println("Back to the menu (1/2) ?");
                int exit = scan.nextInt();
            switch (exit) {
                case 1 :
                    System.out.println("Backt to the menu");
                    break;
                case 2 :
                    System.out.println("Thank you");
                    System.exit(0);
                }
                    break;
                case 4:
            while (menu) {
                System.out.println("1. PDAM" );
                System.out.println("2. PLN ");
                int choosePayment = scan.nextInt();
                
                switch (choosePayment){
                    case 1 :
                        System.out.println("Input username PDAM");
                        String usernamePDAM = scan.next();
                        System.out.println("Input phone number PDAM");
                        long phoneNumberPDAM = scan.nextInt();
                        System.out.println("Input payment PDAM");
                        int nominalpaymentPDAM = scan.nextInt();
                        System.out.println("balance succesfuly paid to" + usernamePDAM +   phoneNumberPDAM + "amount of Rp." + nominalpaymentPDAM);
                    break;

                    case 2 :
                        System.out.println("Input usernamePLN");
                        String usernamePLN = scan.next();
                        System.out.println("Input phone numberPLN");
                        long phoneNumberPLN = scan.nextInt();
                        System.out.println("Input paymentPLN");
                        int nominalpaymentPLN = scan.nextInt();
                        System.out.println("balance succesfuly paid to" + usernamePLN  +   phoneNumberPLN + "amount of Rp." + nominalpaymentPLN);
                    break;
               
                }

            }
               
                
            
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                default:
                System.out.println("Enter the correct option!");
                    break;
                    
            }
        } 
       
    }
        
}

