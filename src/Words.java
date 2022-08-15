import java.util.ArrayList;
import java.util.Random;
public class Words {
    private Random rand = new Random();
    private String currentWord;
    private String wordState = "";
    private String lettersLeft = "";
    public String getWord(){
            ArrayList<String> wordsList = new ArrayList<>();
            wordsList.add("precautionary");
            wordsList.add("independence");
            wordsList.add("dyslexia");
            wordsList.add("motorbike");

        currentWord = wordsList.get(rand.nextInt(wordsList.size()));

        return currentWord;
    }

    public void initialiseCurrentWord(String word){
        lettersLeft = currentWord;

        for(int i = 0; i<this.currentWord.length(); i++){
            this.wordState += "_";
        }
    }


    public void updateCurrentWordDisplay(char letter){

        for(int i = 0; i<lettersLeft.length(); i++){
            if(lettersLeft.toLowerCase().charAt(i) == Character.toLowerCase(letter)){
                wordState = wordState.substring(0,i) + letter + wordState.substring(i+1);
                lettersLeft = lettersLeft.substring(0,i) + " " + lettersLeft.substring(i+1);
            }
        }
    }
    public boolean checkIfGuessed(){
        return (currentWord.equals(wordState));
    }

    public String getCurrentWord() {
        return currentWord;
    }

    public String getLettersLeft() {
        return lettersLeft;
    }

    public String getWordState() {
        return wordState;
    }
}
