import java.util.regex.*;
import java.util.*;
public class EmailValidation
{
    public static void main(String args[])
    {
        ArrayList<String> emails = new ArrayList<String>();
        emails.add("arun@domain.co.in");
        emails.add("kumar@domain.com");
        emails.add("arun.kumar@domain.com");
        emails.add("jon#@domain.co.in");
        emails.add("arunKumar@domain.com");
            emails.add("@yahoo.com");
        emails.add("arun#domain.com");
                String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
                for(String email : emails)
                {
                    Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches()+"\n");
        }
    }
}
