import java.util.Scanner;
public class Task01{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int x;
  int y;
  int z;
  x=n%5;
  if(x==0){
    y=n/5;
  System.out.println(y);
  }
  else{
    y=n/5;
    z=y+1;
  System.out.println(z);
  }
 
  }
}