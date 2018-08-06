import javafx.util.Pair;
import java.util.Iterator;
import java.util.ArrayList;

public class Utils {
    private static StringBuilder output = new StringBuilder();
    public static String inputstring;
    public static ArrayList<String> combinations = new ArrayList<String>();

    ArrayList<Pair<String, Integer>> extractWords(String path, int n) {
        ArrayList<Pair<String, Integer>> words = new ArrayList<Pair<String, Integer>>();
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
