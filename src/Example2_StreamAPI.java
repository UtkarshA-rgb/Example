import java.util.HashMap;
import java.util.Map;

public class Example2_StreamAPI {

    public static void main(String[] args) {

        // check if 2 string is anagram or not
        String s1 = "i am programmer";
        String s2 = "programmer are we";

        boolean isAnagramOrNot = isAnagram(s1,s2);

        System.out.println(isAnagramOrNot);

    }

    public static boolean isAnagram(String str1, String str2){

        Map<Character, Integer> frqofstr1 = new HashMap<>();

        // frequency of first string
        for(char c: str1.toCharArray()){
            frqofstr1.put(c, frqofstr1.getOrDefault(c,0) + 1);
        }

        // cross-check with next string
        for (char c: str2.toCharArray()){
            // exception case
            if(!frqofstr1.containsKey(c)){
                return false;
            }
            // happy case
            frqofstr1.put(c,(frqofstr1.get(c) - 1));
            //cleanups
            if(frqofstr1.get(c) == 0){
                frqofstr1.remove(c);
            }
        }
        return frqofstr1.isEmpty();
    }

}
