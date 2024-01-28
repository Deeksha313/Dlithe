import java.util.Scanner;

public class luckySumCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three Numbers(a,b,c):");
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int x=luckySum(a,b,c);
        System.out.println("Sum="+x);
        sc.close();
    }
    
    public static int luckySum(int a, int b,int c){
        if(a==13){
            return 0;
        }
        else if(b==13){
            return a;
        }    
        else if(c==13){
            return a+b;
        }    
        else{
            return a+b+c;
        }
    }
}
