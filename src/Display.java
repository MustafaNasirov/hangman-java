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
}
