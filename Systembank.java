import java.util.Scanner;

public class Systembank {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        boolean login = true;
        boolean menu = false;
       
        
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
            System.out.println("5. Balance Info");
            
            int pilihan = scan.nextInt();
         
            switch (pilihan) {
                case 1:
                    
                    break;
                case 2:
                    
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


 

