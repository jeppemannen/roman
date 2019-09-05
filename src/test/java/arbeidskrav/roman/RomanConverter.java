package arbeidskrav.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverter {

    @Test
    void shouldReturnIVfor4() {
        assertEquals("IV", RunRomanConverter.toRoman(4));
    }

    @Test
    void shouldReturnIXfor9() {
        assertEquals("IX", RunRomanConverter.toRoman(9));
    }

    @Test
    void shouldCalculateSimpleDigits() {
        assertEquals("MMMDCCCLXXXVIII", RunRomanConverter.toRoman(3888));
    }

    @Test
    void shouldCalculateFourDigits() {
        assertEquals("CDXLIV", RunRomanConverter.toRoman(444));
    }

    @Test
    void shouldCalculateNinelikeDigits() {
        assertEquals("CMXCIX", RunRomanConverter.toRoman(999));
    }

}
