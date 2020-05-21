import java.util.Scanner;
public class Task01{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
  int y=sc.nextInt();
  int z=sc.nextInt();
 
  int a=x+y*z;
  int b=x*y+z;
  int c=(x+y)*z;
  int d=x*(y+z);
  int e=x*y*z;
  int f=x+y+z;
  int max=a;
  
  if(b>max){
    max=b;
  }
  if(c>max){
    max=c;
  }
  if(d>max){
    max=d;
  }
  if(e>max){
    max=e;
  }
  if(f>max){
    max=f;
  }
  
  System.out.println(max);
  
  }
}