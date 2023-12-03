import java.util.Scanner;



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
            System.out.println("Choose your option");
            int pilihan = scan.nextInt();
         
            switch (pilihan) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                int amount = 9000000;
                System.out.println("Input account");
                String account = scan.next();
                System.out.println("Input nominal");
                int transfers = scan.nextInt();
                System.out.println("balance succeeded transfers to " + account + "amount of Rp." + transfers);
                int balanceAmount = amount-transfers;
                System.out.println("Your balance amount is " + balanceAmount);
               
                System.out.println("Back to the menu (y/n) ?");
                String exit = scan.next();
            switch (exit) {
                case "y" :
                    System.out.println("Backt to the menu");
                    break;
                case "n" :
                    System.out.println("Thank you");
                    System.exit(0);
                }
                    break;
                case 4:
            while (payment) {
                System.out.println("*******");
                System.out.println("\n Menu payment");
                System.out.println("1. PDAM" );
                System.out.println("2. PLN ");
                System.out.println("3. Exit");
                int choosePayment = scan.nextInt();
                
                switch (choosePayment){
                    case 1 :
                        System.out.println("Input username PDAM");
                        String usernamePDAM = scan.next();
                        System.out.println("Input phone number PDAM");
                        int phonePDAM = scan.nextInt();
                        //System.out.println("Input payment PDAM");
                        if (usernamePDAM.equalsIgnoreCase("Majid")){
                        System.out.println("Your PDAM bill is 100000 ");
                        System.out.println("Do you want to pay your bill(y/n)?");
                        String billPDAM = scan.next();
                        switch(billPDAM){

                            case "y" :
                        System.out.println("your payment is succesfull");
                        amount = 9000000;
                        int pdamBill = amount-100000;
                        System.out.println("Your balance amount is" +pdamBill);
                           case "n" :
                           System.out.println("Thank you");
                           payment = false;
                        }
                        }
                        //int nominalpaymentPDAM = scan.nextInt();
                        //System.out.println("balance succesfuly paid to" + usernamePDAM +   phoneNumberPDAM + "amount of Rp." + nominalpaymentPDAM);
                    break;

                    case 2 :
                        System.out.println("Input usernamePLN");
                        String usernamePLN = scan.next();
                        System.out.println("Input phone numberPLN");
                        long phoneNumberPLN = scan.nextInt();
                        //System.out.println("Input paymentPLN");
                        //int nominalpaymentPLN = scan.nextInt();
                        if (usernamePLN.equalsIgnoreCase("Majid")){
                        System.out.println("Your PLN bill is 2000000 ");
                        System.out.println("Do you want to pay your bill(y/n)?");
                        String billPLN = scan.next();
                        switch(billPLN){

                            case "y" :
                        System.out.println("your payment is succesfull");
                        amount = 9000000;
                        int plnBill = amount-200000;
                        System.out.println("Your balance amount is" +plnBill);
                        break;
                           case "n" :
                           System.out.println("Thank you");
                           payment = false;
                           
                        }
                        }
                        //System.out.println("balance succesfuly paid to" + usernamePLN  +   phoneNumberPLN + "amount of Rp." + nominalpaymentPLN);
                    case 3 : 
                   menu = true;
                   payment = false;
               
                }

            }
               
                
            
                    
                    break;
                case 5:
                System.out.println("Your balance info is ");
                    
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

