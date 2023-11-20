import java.util.Scanner;
class VowelConsonant{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Character");
 char ch=sc.next().toLowerCase().charAt(0);
if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u')
System.out.println("Its a vowel");
else
System.out.println("Its a consonant");
}
}