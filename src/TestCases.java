import org.junit.Test;
import  org.junit.Assert;
public class TestCases {

    @Test
    public void english_to_morse_fails_when_morse_is_input() {
        String input = "*** ___ ***";
        String actual = MorseCodeTranslator.translateToMorse(input);
        Assert.assertNull("Program should fail", actual);
    }


    @Test
    public void morse_to_english_fails_when_english_is_input(){
        String input = "SOS";
        String actual = MorseCodeTranslator.translateToEnglish(input);
        Assert.assertNull("Program should fail.", actual);
    }


    @Test
    public void Hello_should_translate(){
        String input = "Hello";
        String expected = "**** * *_** *_** ___ ";
        String actual = MorseCodeTranslator.translateToMorse(input);
        Assert.assertEquals( expected, actual);
    }

  @Test
    public void morse_should_translate_to_HELLO(){
        String input = "**** * *_** *_** ___";
        String expected = "HELLO";
        String actual = MorseCodeTranslator.translateToEnglish(input);
        Assert.assertEquals( expected, actual);
  }
}