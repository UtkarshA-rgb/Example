import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Example2_StreamAPI {

    public static void main(String[] args) {

        // check if 2 string is anagram or not
        String s1 = "i am programmer";
        String s2 = "programmer are we";
        boolean isAnagramOrNot = isAnagram(s1,s2);
        System.out.println(isAnagramOrNot);

        // merge 2 arrays
        int[] numbers1 = new int[]{1,3,5,7,9};
        int[] numbers2 = new int[]{2,4,6,8,10};

        int[] resultArray = mergeTwoArray(numbers1,numbers2);
        System.out.println(Arrays.toString(resultArray));

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

    public static int[] mergeTwoArray(int[] array1, int[] array2){
        int maxLength = Math.max(array1.length, array2.length);

        int[] resultArray = new int[array1.length+array2.length];
        int index = 0;

        for(int i = 0 ; i < maxLength; i++){
            if(i < array1.length){
                resultArray[index] = array1[i];
                index = index + 1;
            }
            if(i < array2.length){
                resultArray[index] = array2[i];
                index = index + 1;
            }
        }
        return  resultArray;
    }

}
