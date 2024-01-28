import java.util.Scanner;

public class EvenorOdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a Numbers :");
        int a;
        a=sc.nextInt();
        boolean x=Even(a);
        System.out.println("Result = "+x);
        sc.close();
    }
    
    
    public static boolean Even(int n){
        
        return n%2==0;  // return (n&0b1)==0;    
    }
    
}
