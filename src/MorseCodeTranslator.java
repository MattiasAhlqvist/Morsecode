

import java.util.HashMap;
import java.util.Map;

public class MorseCodeTranslator {
    private static HashMap<String, Character> morseCharacters = new HashMap<>(){
        {
            put("*_", 'A');
            put("_***", 'B');
            put("_*_*", 'C');
            put("_**", 'D');
            put("*", 'E');
            put("**_*", 'F');
            put("__*", 'G');
            put("****", 'H');
            put("**", 'I');
            put("*___", 'J');
            put("_*_", 'K');
            put("*_**", 'L');
            put("__", 'M');
            put("_*", 'N');
            put("___", 'O');
            put("*__*", 'P');
            put("__*_", 'Q');
            put("*_*", 'R');
            put("***", 'S');
            put("_", 'T');
            put("**_", 'U');
            put("***_", 'V');
            put("*__", 'W');
            put("_**_", 'X');
            put("_*__", 'Y');
            put("__**", 'Z');
            put("*____", '1');
            put("**___", '2');
            put("***__", '3');
            put("****_", '4');
            put("*****", '5');
            put("_****", '6');
            put("__***", '7');
            put("___**", '8');
            put("____*", '9');
            put("_____", '0');
            put("*_*_*_", '.');
            put("__**__", ',');
            put("**__**", '?');
            put(" ", ' ');
        }
    };

    public static String translateToEnglish(String s){
        String[] parts = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String letter : parts){
            Character englishChar = morseCharacters.get(letter);
            if (englishChar == null) {
                return null;
            }
            sb.append(englishChar);
        }
        System.out.println(sb);
        return sb.toString();
    }

    public static String translateToMorse(String s){
        s = s.toUpperCase(); //Felhantering
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            String morseString = findMorseCode(s.charAt(i));
            if (morseString == null) {
                return null;
            }

            sb.append(morseString);
            sb.append(" ");
        }
        System.out.println(sb);
        return sb.toString();
    }

    private static String findMorseCode(char ch){
        for(Map.Entry<String, Character> entry : morseCharacters.entrySet()){
            if(entry.getValue().equals(ch)) return entry.getKey();
        }
        return null;
    }

}