public class Main {

    public static void main(String args[]) {
        System.out.println("Hangman Game");

        Words word = new Words();
        Input input = new Input();
        Display display = new Display();
        String guessedLetter = "";
        Boolean isGameStart = true;

        display.getIntro();

            word.getWord();
            word.initialiseCurrentWord(word.getCurrentWord());

            while(!word.checkIfGuessed() && display.getLives() > 0) {

            display.updateHangmanImg();
            System.out.println("Word to Guess\n" + word.getWordState() + "\n");
            guessedLetter = input.askLetter();

            if (word.getLettersLeft().contains(guessedLetter.toLowerCase())) {
                word.updateCurrentWordDisplay(guessedLetter.charAt(0));
            } else {
                display.decrementLives();
                System.out.println("Lives Left: " + display.getLives());
            }
        }

        if (display.getLives() > 0) {
            display.getWin(word.getCurrentWord());
        } else display.getLose(word.getCurrentWord());

    }

}
