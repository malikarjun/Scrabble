import javafx.util.Pair;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utils {
    private static StringBuilder output = new StringBuilder();
    public static String inputstring;
    public static ArrayList<String> combinations = new ArrayList<String>();
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
    public static void combine() {
        combine( 0 );
    }
    private static void combine(int start ){
        for( int i = start; i < inputstring.length(); ++i ){
            output.append( inputstring.charAt(i) );
            combinations.add(output.toString());
            if ( i < inputstring.length() )
                combine( i + 1);
            output.setLength( output.length() - 1 );
        }
    }

    public static ArrayList<String> generateComninations(int n, String inputString) {
        if(inputString.length() == n) {
            combinations.add(inputString);
            return combinations;
        }
        inputstring = inputString;
        combine();
        Iterator itr = combinations.iterator();
        while(itr.hasNext()) {
            if(itr.next().toString().length() != n ) {
                itr.remove();
            }
        }
        return combinations;
    }

}
