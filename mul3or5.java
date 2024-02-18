import java.util.Scanner;
public class mul3or5{
    static boolean or35(int a,int b){
        boolean x=((a%3==0)||(b%5==0))?true:false;
        return x;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 2 numbers:");
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        boolean b=or35(x,y);
        System.out.println(b);
        sc.close();

    }
}