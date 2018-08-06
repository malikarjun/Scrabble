import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;

public class Utils {
    public static ArrayList<Pair<String, Integer>> extractWords(String path, int n) {
        ArrayList<Pair<String, Integer>> words = new ArrayList<Pair<String, Integer>>();
        return words;
    }

    public static ArrayList<String> generateComninations(int n, String tiles) {
        ArrayList<String> combos = new ArrayList<>();
        return combos;
    }

    private static int getSignature(String word) {
        return -1;
    }

    private static int computeScore(String word) {
        int []scoreMap = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
        int score = 0;
        for(char c: word.toCharArray()) {
            score += scoreMap[(c - 'A')];
        }
        return score;
    }

    public static int checkWordList(ArrayList<Pair<String, Integer>> wordList, String word) {
        int signature = getSignature(word);



        return -1;
    }
}
