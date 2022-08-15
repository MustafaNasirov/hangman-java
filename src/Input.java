import java.util.Scanner;

public class Input {

    public String askLetter(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess a Letter: ");
        String guessedLetter = scan.nextLine();

        return guessedLetter;
    }

    public Boolean askRetry(){
        System.out.println("Would you like to continue? (Y/N)");
        Scanner scan = new Scanner(System.in);
        String retryInput = scan.nextLine();
        if(retryInput.toLowerCase() == "y"){
            return true;
        }else return false;
    }
}
