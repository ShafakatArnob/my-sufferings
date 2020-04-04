import java.util.Scanner;
public class Task01{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  long x=sc.nextInt();
  long y=sc.nextInt();
  long z=sc.nextInt();
  long a=(x+(z-1))/z;
  long b=(y+(z-1))/z;
  
  System.out.println(a*b);
  
  }
}