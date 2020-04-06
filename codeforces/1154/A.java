import java.util.Scanner;
public class Task{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
  int y=sc.nextInt();
  int z=sc.nextInt();
  int f=sc.nextInt();
 
  if(y>x && y>z && y>f){
     int a=y-x;
     int b=y-z;
     int c=y-f;
  System.out.println(a);
  System.out.println(b);  
  System.out.println(c);
     
  }
  else if(z>x && z>y && z>f){
    int a=z-x;
    int b=z-y;
    int c=z-f;
  System.out.println(a);
  System.out.println(b);  
  System.out.println(c);  
  }
  else if(f>x && f>y && f>z){
     int a=f-y;
     int b=f-z;
     int c=f-x;
  System.out.println(a);
  System.out.println(b);  
  System.out.println(c);   
  }
  else if(x>y && x>z && x>f){
     int a=x-y;
     int b=x-z;
     int c=x-f;
  System.out.println(a);
  System.out.println(b);  
  System.out.println(c);   
  }

  }
  
}