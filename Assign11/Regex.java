import java.util.*;
import java.util.regex.*;

class Validator{
    private Pattern pattern;
    private Matcher matcher;

    public Validator(String regex){
        pattern=Pattern.compile(regex);
    }

    public boolean Validate(String msg){
        matcher=pattern.matcher(msg);
        return matcher.matches();
    }
}
public class Regex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Mobile number of the Person: ");
        String mobNum=sc.next();

        Validator MobileNum=new Validator("^[0-9]{2}[0-9]{10}$");
        if(!MobileNum.Validate(mobNum))
        System.out.println("Error!!Enter country code followed by 10 digit number.");
        
    }
}
