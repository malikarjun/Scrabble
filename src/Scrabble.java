import javafx.util.Pair;

import java.util.ArrayList;

public class Scrabble {
    Pair<String, Integer> findHighestScore(String tiles, int condition) {
        Pair<String, Integer> ans = new Pair<>("", 0);


        int score = -1;
        String answerWord = null;
        for(int i = 0; i < tiles.length() -1; i++) {
            int shift = 0;
            if(condition == 2)
                shift = 1;

            ArrayList<Pair<String, Long>> wordList = Utils.extractWords("sowpods.txt", tiles.length() - i + shift);
            ArrayList<String> tileLetterCombos = Utils.generateCombinations(tiles.length() - i, tiles);

            for(String word: tileLetterCombos) {
                String dictWord = Utils.checkWordList(wordList, word);
                if(dictWord != null && score < Utils.computeScore(dictWord)) {
                    score = Utils.computeScore(dictWord);
                    answerWord = dictWord;

                }

            }
        }

        return new Pair<String, Integer>(answerWord, score);

    }

}
