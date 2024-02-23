// import java.util.Scanner;
public class Sleep
{ 
public static void main(String[] args) {
boolean w=true, v=false;
boolean x=sleepin(w,v);
System.out.println(x);
}
static boolean sleepin(boolean weekday, boolean vacation)
{
return !weekday||vacation;
}
 
}
