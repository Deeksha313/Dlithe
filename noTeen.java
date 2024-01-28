import java.util.Scanner;

public class noTeen{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three Numbers(a,b,c):");
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int x=noTeenSum(a,b,c);
        System.out.println("Sum = "+x);
        sc.close();
    }
    
    public static int noTeenSum(int a, int b,int c){
        return fixTeen(a)+fixTeen(b)+fixTeen(c);
    }
    
    public static int fixTeen(int n){
        if((n>=13 && n<=19)&& !(n==15||n==16)) //helper method
            return 0;
        else
            return n;
    }
}
