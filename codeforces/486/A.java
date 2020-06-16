import java.util.Scanner;
public class CalculatingFunction{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
   long x=sc.nextLong();
   long sum1=0;
   long sum2=0;
   
   if(x%2==0){
     sum1=x/2;
     System.out.print(sum1);
   }
   else{
     sum2=(x+1)/(-2);
     System.out.print(sum2);
   }
  
  }
}
