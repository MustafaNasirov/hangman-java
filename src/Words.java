import java.util.ArrayList;
public class Words {
    public String getWords(){
            ArrayList<String> wordsList = new ArrayList<>();
            wordsList.add("precautionary");
            wordsList.add("independence");
            wordsList.add("dyslexia");
            wordsList.add("motorbike");

        for (int i = 0; i < wordsList.size(); i++) {
            int listIndex = (int)(Math.random() * wordsList.size());
            return wordsList.get(listIndex);
        }
        return "did not find word";
    }
}
