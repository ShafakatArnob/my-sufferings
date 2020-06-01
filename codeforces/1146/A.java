import java.util.Scanner;
public class LoveA{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  String x=sc.nextLine();
  int l=x.length();
  char[] a=x.toCharArray();
   int c=0;
   int d=0;
   
   for(int i=0;i<l;i++){
     if(a[i]=='a'){
       c++;
     }
     else{
       d++;
     }
   }
   while(d>=c){
     d--;
   }
   int sum=d+c;
   
   System.out.print(sum);
  }
}
