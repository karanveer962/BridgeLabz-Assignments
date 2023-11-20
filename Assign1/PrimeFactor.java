import java.util.Scanner;
class PrimeFactor{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
int n=sc.nextInt();
if(n<0){
System.out.println("Error!! enter n >=0 ");
}
else{
   int num=n;
   for(int i=2;i*i<=num;i++){
         if(n%i==0){
      System.out.println(i); 
       while(n%i==0)
         n/=i;
       }
   }  
}
}
}