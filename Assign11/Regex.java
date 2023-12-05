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

        System.out.println("Enter Email of the Person: ");
        String email=sc.next();

        Validator Email=new Validator("^[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*@[A-Za-z]+(\\.[A-Za-z]+)+$");
        if(!Email.Validate(email))
        System.out.println("Enter a valid email!!!");
        
    }
}
