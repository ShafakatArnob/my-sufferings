import java.util.Scanner;
public class BearAndBigBrother{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   int y=sc.nextInt();
   int c=0;
   if(x==y){
     System.out.println("1");
   }
   else{
     while(x<=y){
       x=x*3;
       y=y*2;
       c++;
     }
     System.out.println(c);
   }
     
  }
}