import java.util.Scanner;

public class Tens{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter 2 Numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        boolean x= makes10(a,b);
        System.out.println("Result = "+x);
        sc.close();
    }
    
    public static boolean makes10(int m,int n){
        return (m==10 || n==10) || (m + n ==10);
    }
    
}