public class Display {

    private int lives = 5;

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLives() {
        return lives;
    }

    public void decrementLives(){
        lives--;
    }

    public void updateHangmanImg(){
        switch (lives){
            case 5:
                System.out.println("/******");
                System.out.println("|   |  ");
                System.out.println("|      ");
                System.out.println("|      ");
                System.out.println("|      ");
                System.out.println("|______");
                break;

            case 4:
                System.out.println("/******");
                System.out.println("|   |  ");
                System.out.println("|   0  ");
                System.out.println("|      ");
                System.out.println("|      ");
                System.out.println("|______");
                break;

            case 3:
                System.out.println("/******");
                System.out.println("|   |  ");
                System.out.println("|   0  ");
                System.out.println("|   |  ");
                System.out.println("|      ");
                System.out.println("|______");
                break;

            case 2:
                System.out.println("/******");
                System.out.println("|   |  ");
                System.out.println("|   0  ");
                System.out.println("|  /|  ");
                System.out.println("|      ");
                System.out.println("|______");
                break;

            case 1:
                System.out.println("/******");
                System.out.println("|   |  ");
                System.out.println("|   0  ");
                System.out.println("|  /|\\");
                System.out.println("|      ");
                System.out.println("|______");
                break;

            case 0:
                System.out.println("/*******");
                System.out.println("|   |  ");
                System.out.println("| (x x)  ");
                System.out.println("|  /|\\");
                System.out.println("|  / \\ ");
                System.out.println("|______");
                break;

        }
    }

    public void getIntro(){
        System.out.println("Welcome to Hangman, can you guess what the word is?");
    }
    public void getWin(String word){
        System.out.println("Well done! You guessed the word : " + word);
    }
    public void getLose(String word){
        System.out.println("Better luck next time! The word was : " + word);
    }
}
