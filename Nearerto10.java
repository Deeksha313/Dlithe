import java.util.Scanner;
public class Nearerto10
{ static int close10(int x,int y)
{
int first_diff=Math.abs(x-10);
int second_diff=Math.abs(y-10);
int r=(first_diff<second_diff)?(first_diff):((first_diff>second_diff)?(second_diff):(0));
return r;
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int x,y;
System.out.println("Enter the 2 numbers:");
x=s.nextInt();
y=s.nextInt();
int b=close10(x,y);
System.out.println(b);
s.close();
}
}
