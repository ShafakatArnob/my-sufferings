import java.util.Scanner;
public class VanyaAndFence{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   int y=sc.nextInt();
   int sum=0;
   for(int i=0;i<x;i++){
     int z=sc.nextInt();
     if(z>y){
       sum=sum+2;
     }
     else{
       sum=sum+1;
     }
   }
   
   System.out.print(sum);
  
  }
}
