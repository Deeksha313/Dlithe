import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter 2 Numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        int x= sumDouble(a,b);
        System.out.println("Result = "+x);
        sc.close();
    }
    
    public static int sumDouble(int m,int n){
        if(m==n)
            return 2*(m+n);
        else
            return m+n; 
    }
    
}