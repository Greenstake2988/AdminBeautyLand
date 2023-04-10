import java.util.Scanner;

public class Helper {

    public String getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        Scanner escaner = new Scanner(System.in);
        return escaner.nextLine();
    }
}
    
