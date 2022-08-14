import java.util.Scanner;

public class Input {

    public String askLetter(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess letter ");
        String guessedLetter = scan.nextLine();

        return guessedLetter;
    }

}
