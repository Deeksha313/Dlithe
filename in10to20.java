import java.util.Scanner;

public class in10to20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter 2 Numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        boolean x= in1020(a,b);
        System.out.println("Result = "+x);
        sc.close();
    }
    
    public static boolean in1020(int m,int n){
        return (m>=10 && m<=20) || (n>=10 && n<=20) ;
    }
    
}