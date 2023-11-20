import java.util.Scanner;
class LeapYear{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter year");
String y=sc.next();
if(y.length()!=4){
System.out.println("Error !!  Enter 4 digit year");
}
else{
int year=Integer.parseInt(y);
if(year%4==0){
    if((year%100!=0) || (year%100==0 && year%400==0))
    System.out.println("Its a leap year");
    else
      System.out.println("Its not a leap year");
 }
else
  System.out.println("Its not a leap year");
} 
}
}