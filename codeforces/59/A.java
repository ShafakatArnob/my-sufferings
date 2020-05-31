import java.util.Scanner;
public class Word{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  
  String x=sc.nextLine();
  int l=x.length();
  char[] a=new char[l];
  for(int i=0;i<l;i++){
    a[i]=x.charAt(i);
  }
  int c=0;
  int d=0;
  for(int j=0;j<l;j++){
    if(a[j]>='a' && a[j]<='z'){
      c++;
    }
    else{
      d++;
    }
  }
  if(c>=d){
    for(int g=0;g<l;g++){
      if(a[g]>='A' && a[g]<='Z'){
      int temp1=(int)a[g];
      temp1=temp1-'A'+'a';
      a[g]=(char)temp1;
      }
      System.out.print(a[g]);
    }
  }
  else{
    for(int f=0;f<l;f++){
      if(a[f]>='a' && a[f]<='z'){
      int temp2=(int)a[f];
      temp2=temp2-'a'+'A';
      a[f]=(char)temp2;
      }
      System.out.print(a[f]);
    }
  }
 
  }
}