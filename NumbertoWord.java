import java.util.Scanner;
public class NumbertoWord{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(n>=0 && n<=9){
            String[] words={"zero","one","two","three","four","five","six","seven","eight","nine"};
            System.out.println(words[n]);
        }
        else
            System.out.println("Greater than 9");
        
    }
}