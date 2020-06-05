import java.util.Scanner;
public class GeorgeAndAccommodation{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   int c=0;
   for(int i=1;i<=x;i++){
     int y=sc.nextInt();
     int z=sc.nextInt();
     if((y+2)<=z){
       c++;
     }
   }

   System.out.println(c);
   
     
  }
}