import java.util.Scanner;
public class VusTheCossackAndContest{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   int y=sc.nextInt();
   int z=sc.nextInt();
   if(y>=x && z>=x){
     System.out.println("Yes");
   }
   else{
     System.out.println("No");  
     }
   
  }
}