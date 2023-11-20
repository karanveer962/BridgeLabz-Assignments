import java.util.Scanner;
class EvenOdd{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
int n=sc.nextInt();
if(n%2==0)
System.out.println("Its Even");
else
System.out.println("Its Odd");
}
}