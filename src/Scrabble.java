import javafx.util.Pair;

import java.util.ArrayList;

public class Scrabble {
    Pair<String, Integer> findHighestScore(String tiles, int condition) {
        Pair<String, Integer> ans = new Pair<>("", 0);


        int score = -1;
        String answerWord;
        for(int i = 0; i < tiles.length(); i++) {
            ArrayList<Pair<String, Integer>> wordList = Utils.extractWords("sowpods.txt", tiles.length() - i);
            ArrayList<String> tileLetterCombos = Utils.generateComninations(tiles.length() - i, tiles);

            for(String word: tileLetterCombos) {
                int currScore = Utils.checkWordList(wordList, word);
                if(score < currScore) {
                    score = currScore;
                    answerWord = word;

                }

            }
        }
        return ans;
    }

}
