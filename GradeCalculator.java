import java.util.Scanner;
public class GradeCalculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the grade:");
        int n=sc.nextInt();
        sc.close();
        if(n>100||n<0)
           System.out.println("Invalid Input");
        else{
        String grade =CalcGrade(n);
        System.out.println("Julia's Grade is:"+grade);
        }
    }
    public static String CalcGrade(int a){
        String grade="";
        if(a>90)
            grade="A";
        else if(a>80)
            grade="B";
        else if(a>70)
            grade="C";
        else if(a>60)
            grade="D";
        else if(a>50)
            grade="E";
        else if(a>=35)
            grade="F";
        else
            grade="FAIL";
            
        return grade;
    }
}