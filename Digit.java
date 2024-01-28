import java.util.Scanner;

public class Digit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two Numbers :");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        boolean x=lastDigit(a,b);
        System.out.println("Result = "+x);
        sc.close();
    }
    
    
    public static boolean lastDigit(int n,int m){
        int rem1=n%10;
        int rem2=m%10;
        if(rem1==rem2)
            return true;
        else
            return false;
       
    
        
       
    }
    
}
