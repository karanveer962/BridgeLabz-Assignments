import java.util.Scanner;
class HarmonicValue{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
int n=sc.nextInt();
if(n<=0){
System.out.println("Error!! enter n >0 ");
}
else{
   double hV = 0.0;
            for (int i = 1; i <= n; i++) {
                hV += 1.0 / i;
            }
            System.out.println("The " + n + "th Harmonic Value is: " + hV);
}
}
}