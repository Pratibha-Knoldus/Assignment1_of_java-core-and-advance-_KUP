import java.util.ArrayList;
import java.util.List;

//create custom exception class
public class EmailNotUniqueException  extends Exception{

    public EmailNotUniqueException(String message){
        super(message);
    }
}

//create email registration class
class RegistrationService{
    public void emailValidate(String email) throws EmailNotUniqueException{
        List<String> register_email= new ArrayList<>(); //create a list to store the emails
        register_email.add("pratibha@gmail.com");
        register_email.add("knoldus@gmail.com");

        if(register_email.contains(email)){
            throw new EmailNotUniqueException("Email Already Exit");
        }
    }
}

//  main class
class RegistrationServiceClient {
    public static void main(String[] args) {
        RegistrationService service = new RegistrationService();
        try {
            service.emailValidate("pratibha@gmail.com");

        } catch (EmailNotUniqueException e) {
            //   handling the situation
            System.out.println("caught exception:  "+e);
        }
    }
}