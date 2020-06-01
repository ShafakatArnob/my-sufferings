import java.util.Scanner;
public class AntonAndPolyhedrons{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   int sum=0;
   for(int i=0;i<=x;i++){
     String a=sc.nextLine();
     if(a.equals("Tetrahedron")){
       sum=sum+4;
     }
     else if(a.equals("Cube")){
       sum=sum+6;
     }
     else if(a.equals("Octahedron")){
       sum=sum+8;
     }
     else if(a.equals("Dodecahedron")){
       sum=sum+12;
     }
     else if(a.equals("Icosahedron")){
       sum=sum+20;
     }
   }

     System.out.print(sum);
  }
}
