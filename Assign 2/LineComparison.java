import java.util.*;

class Line{
private double x1, y1, x2, y2;
 public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

public boolean equals(Line obj){
 double length1 = findLength(this.x1, this.y1, this.x2, this.y2);
 double length2 = findLength(obj.x1, obj.y1, obj.x2, obj.y2);
   return Double.compare(length1, length2) == 0;
}

public int compareTo(Line obj){
 double length1 = findLength(this.x1, this.y1, this.x2, this.y2);
 double length2 = findLength(obj.x1, obj.y1, obj.x2, obj.y2);
   return Double.compare(length1, length2);
}

public static double findLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

class LineComparison{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

double length=Line.findLength(1,2,3,4);
System.out.println("Length of line is:"+ String.format("%.5f", length));

 Line line1 = new Line(1, 2, 3, 4);
 Line line2 = new Line(5, 7, 7, 8);

boolean checkEquality = line1.equals(line2);
if(checkEquality){
System.out.println("Line 1 and Line 2 are equal");
}
else{
System.out.println("Line 1 and Line 2 are not equal");
}


int compareLen=line1.compareTo(line2);
if(compareLen>0){
System.out.println("Line1 is greater than line 2");
}
else if(compareLen<0){
System.out.println("Line2 is greater than line 1");
}
else{
System.out.println("Line 1 and Line 2 are equal");
}
}
}