import java.util.Scanner;
class FlipCoin{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of times to flip the coin: ");
int ntfc=sc.nextInt();
if(ntfc<=0){
 System.out.println("Enter a positive number");
}
else{
     int heads=0,tails=0;
     while(ntfc!=0){
      double rand=Math.random();
      if(rand>0.5)
           heads++;
      else
           tails++;
      ntfc--;
   }
   double percentageHeads=((double)heads/(heads+tails)) *100;
    double percentageTails = 100 - percentageHeads;
   
     System.out.println("Percentage of Heads: " + percentageHeads + "%");
     System.out.println("Percentage of Tails: " + percentageTails + "%");
}
}
}