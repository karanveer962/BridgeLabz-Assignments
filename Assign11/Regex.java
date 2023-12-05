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

        System.out.println("Enter First name of the Person: ");
        String f_name=sc.next();
        
        Validator firstName=new Validator("^[A-Z][A-Za-z]{2,}$");
        if(!firstName.Validate(f_name))
        System.out.println("First name starts with Cap and has minimum 3 characters!!!");

    }
}
