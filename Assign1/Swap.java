import java.util.Scanner;
class Swap{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a");
int a=sc.nextInt();
System.out.println("Enter b");
int b=sc.nextInt();
int temp=b;
b=a;
a=temp;
System.out.println("New a :"+a);
System.out.println("New b:"+b);
}
}