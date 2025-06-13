package FinalModelPaper.Question03;
import java.util.Scanner;
public class DemoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a username : ");
        String username = input.nextLine();
        System.out.println("Enter password : ");
        String password = input.nextLine();
        try {
            if(username.length() < 6){
                throw new InvalidUserName("Username must be at least 6 character long");
            }
            if(password.length() < 8)
                throw new InvalidPasswordLength("password must be at least 8 character long");
        }catch (InvalidUserName invalidUserName) {
            System.out.println(invalidUserName.getMessage());
        }catch (InvalidPasswordLength invalidPasswordLength){
            System.out.println(invalidPasswordLength.getMessage());
        }
    }
}
