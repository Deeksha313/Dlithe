import java.util.Scanner;

public class Ticket{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three Numbers(a,b,c):");
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int x=greenTicket(a,b,c);
        System.out.println(x);
        sc.close();
    }
    
    
    public static int greenTicket(int n,int m,int l){
        if(n==m && n==l)
            return 20;
        else if (n==m||m==l||l==n)                        //((n==m&&n!=l)||(n!=m&&n==l))
            return 10;
        else 
            return 0;
        
       
    }
}
