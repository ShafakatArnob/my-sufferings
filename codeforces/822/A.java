import java.util.Scanner;
public class ImBoredWithLife{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
   long x=sc.nextLong();
   long y=sc.nextLong();
   long a=1;
   if(x<y){
     for(long i=1;i<=x;i++){
       a=a*i;
     }
   }
   else{
     for(long i=1;i<=y;i++){
       a=a*i;
     }
   }
      
   System.out.println(a);
   
   
  }
}
