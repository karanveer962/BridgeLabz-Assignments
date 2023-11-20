import java.util.Scanner;
class QuotientNdRemainder{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a");
int a=sc.nextInt();
System.out.println("Enter b");
int b=sc.nextInt();
System.out.println("Quotient :"+a/b);
System.out.println("Remainder:"+a%b);
}
}