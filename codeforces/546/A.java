import java.util.Scanner;
public class Task01{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
  int y=sc.nextInt();
  int z=sc.nextInt();
  int l;
  int sum=0;
  int m;
  for(int i=1;i<=z;i++){
    l=x*i;
    sum=sum+l;
  }
  if(sum>y){
  m=sum-y;
  System.out.println(m);
  }
  else{
  System.out.println("0");
  }
  
  }
}
