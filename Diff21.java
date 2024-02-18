import java.util.Scanner;
public class Diff21{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int a;
        a=sc.nextInt();
        int x=diff21(a);
        System.out.println("Result = "+x);
        sc.close();
    }
    
    
    public static int diff21(int n){
        int x=(n<21)?(Math.abs(n-21)):(2*Math.abs(n-21));
        return x;
    }
}