public class Streamdemo {


    public static void main(String[] args) {
        // reverse of the string
        String inputString = "Utkarsh";

        String reverseString = reverse(inputString);
        System.out.println("Reverse" + reverseString);



    }

    public static String reverse(String input){
        // you can make StringBuilder and go from last char to first char
        if (input == null)
            throw new IllegalArgumentException("NUll STRING IS NOT VALID");

        StringBuilder reverseOfTheString = new StringBuilder();
        for(int i = input.length() - 1; i >= 0; i--){
            reverseOfTheString.append(input.charAt(i));
        }

        return reverseOfTheString.toString();
    }


}
