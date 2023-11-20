import java.util.Scanner;
class PowerOf2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
int n=sc.nextInt();
if(n>31 || n<0){
System.out.println("Error!! enter n >=0 and n<31 ");
}
else{
int i=0,k=1;
while(i!=n){
  System.out.println((int)Math.pow(2,i));
i++;
}
}
}
}