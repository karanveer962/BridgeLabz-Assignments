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

        System.out.println("Enter Password of the Person: ");
        String password=sc.next();

        Validator Password=new Validator("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[a-zA-Z0-9@$!%*#?&]{8,}$");
        if(!Password.Validate(password))
        System.out.println("Error!!Password must be atleast 8 characters and contains atleast 1 Capital letter, 1 numeric number, 1 special character");
        
    }
}
