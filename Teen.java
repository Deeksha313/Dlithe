import java.util.Scanner;
public class Teen{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        boolean x=hasTeen(a,b,c);
        System.out.println(x);
        sc.close();

    }
    public static boolean hasTeen (int k,int l,int m){
        boolean n=((k>=13 && k<=19)||(l>=13 && l<=19)||(m>=13 && m<=19))?true:false;
        return n;

    }
}