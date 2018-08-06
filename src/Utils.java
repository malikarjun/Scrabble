import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Utils {
    public static int[] primes = new int[]{ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101 };

    private static long getSignature(String word) {
        long signValue = 1;
        for(int i=0;i<word.length();i++) {
            signValue *= primes[word.toUpperCase().charAt(i) - 65];
        }
        return signValue;
    }

    public static ArrayList<Pair<String, Long>> extractWords(String path, int n) {
        ArrayList<Pair<String, Long>> words = new ArrayList<Pair<String, Long>>();

        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader(path));

            String sCurrentLine;
            long signature;

            while ((sCurrentLine = br.readLine()) != null) {
                if(sCurrentLine.length() == n) {
                     signature = getSignature(sCurrentLine);
                     words.add(new Pair<String, Long> (sCurrentLine, signature));
                }
            }

            br.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

        return words;
    }

    ArrayList<String> generateComninations(int n, String tiles) {
        ArrayList<String> combos = new ArrayList<>();
        return combos;
    }
}
