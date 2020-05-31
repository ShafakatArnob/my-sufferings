import java.util.Scanner;
public class WordCapitalization{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  
  String x=sc.nextLine();
  int l=x.length();
  char[] a=new char[l];
  for(int i=0;i<l;i++){
    a[i]=x.charAt(i);
  }
  
    for(int g=0;g<l;g++){
      if(a[0]>='a' && a[0]<='z'){
      int temp1=(int)a[0];
      temp1=temp1-'a'+'A';
      a[0]=(char)temp1;
      }
      System.out.print(a[g]);
    }
  

 
  }
}