import java.util.Scanner;
 public class Main{
   public static void main(String args[]){ 
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     int y=sc.nextInt();
     int count=0;
     int[] a=new int[x];
     for(int i=0;i<a.length;i++){
       a[i]=sc.nextInt();
     }
     
     for(int j=0;j<a.length;j++){
       if(a[j]>0 && a[j]>=a[y-1]){
         count++;
       }
     }
     
     
    System.out.println(count);
   }
 }