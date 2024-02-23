import java.util.Scanner;
public class Love6{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the 2 numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        boolean val=love6(a,b);
        System.out.println(val);
        s.close();
    }
    public static boolean love6(int x,int y){
        return(x==6||y==6||x+y==6||Math.abs(x-y)==6);
            
    }
}