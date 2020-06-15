import java.util.Scanner;
public class BoyOrGirl{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  String x=sc.nextLine();
  int l=x.length();
  char[] a=x.toCharArray();
  int c=0;
  
  for(int i=0;i<l;i++){
    for(int j=i+1;j<l;j++){
      if(a[i]==a[j]){
        c++;
        break;
      }
    } 
  }
  int y=l-c;
  
  if(y%2==0){
    System.out.println("CHAT WITH HER!");
  
  }
  else{
    System.out.println("IGNORE HIM!");
  
  }
  
  }
  
}