import java.util.Scanner;
public class Task01{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int sum=0;
  int count=0;
  for(int i=1;i<=n;i++){
  int x=sc.nextInt();
  int y=sc.nextInt();
  int z=sc.nextInt();
  sum=x+y+z;
  if(sum>=2){
    count++;
   }
  }
    
  System.out.println(count);
  
  }
}