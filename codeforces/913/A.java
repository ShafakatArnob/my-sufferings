import java.util.Scanner;
public class ModularExponentiation{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
   double n=sc.nextInt();
   double m=sc.nextInt();
   double x=Math.pow(2,n);
   double y=m%x;
   
   System.out.println((int)y);  
     
   
  }
}