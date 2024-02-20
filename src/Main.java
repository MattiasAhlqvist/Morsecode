

public class Main {
    public static void main(String[] args) {
        String morse1 = "**** * *___"; //HEJ
        String english = "HEJ";
        MorseCodeTranslator translator = new MorseCodeTranslator();
        translator.translateToEnglish(morse1);
        translator.translateToMorse(english);
    }
}