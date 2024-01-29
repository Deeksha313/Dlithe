import java.util.Scanner;
public class Atm{
    
    static int b=0;
    static int pin=1234;
    
    static void Deposit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be deposited");
        int depo=sc.nextInt();
        if(depo>0 && depo%100==0){
            b=b+depo;
            System.out.println("Amount Deposited successfully!");
        }
        else
            System.out.println("Invalid Amount!!");
       sc.close();
   
    }
    static void Withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be Withdrawed");
        int wd=sc.nextInt();
        if(wd<b){
            b-=wd;
            System.out.println("Amount Withdrawed successfully!");
        }
        else
            System.out.println("Balance Insufficient!!");
        
       sc.close();
    }
   
   
    static void PinChange(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the current password :");
        int curpass=sc.nextInt();
        if(curpass==pin){
            System.out.print ("Enter the New Pin: ");
            int newpin=sc.nextInt();
            System.out.print("Confirm the New Pin: ");
            int cpin=sc.nextInt();
            if(cpin==newpin){
                pin=newpin;
                System.out.println("PIN changed successfully!!!");
            }
            else
                System.out.println("PIN doesn't Matchh!!");
        }
        else
            System.out.println("Incorrect password!!");
        sc.close();
    }
   
    public static void main(String args[])
        {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the ATM PIN: ");
        int p1=sc.nextInt();
        
        if(p1==pin){
            while(true){
                System.out.println("Make a choice:");
                System.out.println("1.Deposit\n2.Withdraw\n3.Balance Enquiry\n4.Pin Change\n5.Exit");
                int op =sc.nextInt();
                switch(op){
                    case 1:Deposit();
                           break;
                    case 2:Withdraw();
                           break;
                    case 3:System.out.println("Balance = "+b);
                           break;
                    case 4:PinChange();
                            break;
                    case 5:System.exit(0);
                }
            }
        }
        else
        {
            System.out.println("Invalid ATM PIN!!");
        }
       
    sc.close();
    }
}
