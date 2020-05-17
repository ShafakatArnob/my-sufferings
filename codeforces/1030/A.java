import java.util.Scanner;
public class Task01{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int y=sc.nextInt();
  int sum=0;
  for(int c=1;c<=y;c++){
  int n=sc.nextInt();
  sum=sum+n;
  }
  if(sum>=1){
    System.out.println("HARD");
  }
  else{
    System.out.println("EASY");
  }
 
  }
}