import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    @Test
    public void convert_1_into_I(){
        //GIVEN
        int input = 1;
        String expected = "I";
        RomanNumerals romanNumerals = new RomanNumerals();
        //WHEN
        String result = romanNumerals.convert(input);
        //THEN
        assertEquals(expected,result);
    }

    @Test
    public void convert_3_into_III(){
        //GIVEN
        int input = 3;
        String expected = "III";
        RomanNumerals romanNumerals = new RomanNumerals();
        //WHEN
        String result = romanNumerals.convert(input);
        //THEN
        assertEquals(expected,result);
    }

    @Test
    public void convert_4_into_IV(){
        //GIVEN
        int input = 4;
        String expected = "IV";
        RomanNumerals romanNumerals = new RomanNumerals();
        //WHEN
        String result = romanNumerals.convert(input);
        //THEN
        assertEquals(expected,result);
    }

    @Test
    public void convert_5_into_V(){
        //GIVEN
        int input = 5;
        String expected = "V";
        RomanNumerals romanNumerals = new RomanNumerals();
        //WHEN
        String result = romanNumerals.convert(input);
        //THEN
        assertEquals(expected,result);
    }

    @Test
    public void convert_15_into_XV(){
        //GIVEN
        int input = 15;
        String expected = "XV";
        RomanNumerals romanNumerals = new RomanNumerals();
        //WHEN
        String result = romanNumerals.convert(input);
        //THEN
        assertEquals(expected,result);
    }

    @Test
    public void convert_17_into_XVII(){
        //GIVEN
        int input = 17;
        String expected = "XVII";
        RomanNumerals romanNumerals = new RomanNumerals();
        //WHEN
        String result = romanNumerals.convert(input);
        //THEN
        assertEquals(expected,result);
    }

    @Test
    public void convert_11_into_XI(){
        //GIVEN
        int input = 11;
        String expected = "XI";
        RomanNumerals romanNumerals = new RomanNumerals();
        //WHEN
        String result = romanNumerals.convert(input);
        //THEN
        assertEquals(expected,result);
    }

    @Test
    public void convert_3999_into_MMMCMXCIX(){
        //GIVEN
        int input = 3999;
        String expected = "MMMCMXCIX";
        RomanNumerals romanNumerals = new RomanNumerals();
        //WHEN
        String result = romanNumerals.convert(input);
        //THEN
        assertEquals(expected,result);
    }

    @Test
    public void convert_3588_into_MMMDLXXXVIII(){
        //GIVEN
        int input = 3588;
        String expected = "MMMDLXXXVIII";
        RomanNumerals romanNumerals = new RomanNumerals();
        //WHEN
        String result = romanNumerals.convert(input);
        //THEN
        assertEquals(expected,result);
    }
}