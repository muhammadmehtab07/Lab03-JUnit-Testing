/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rana
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    @Test
    public void testMadamIsPalindrome() {
        StringUtil util = new StringUtil();

        assertTrue(util.isPalindrome("madam"));
    }

    @Test
    public void testRaceCarIsPalindrome() {
        StringUtil util = new StringUtil();

        assertTrue(util.isPalindrome("RaceCar"));
    }

    @Test
    public void testHelloIsNotPalindrome() {
        StringUtil util = new StringUtil();

        assertFalse(util.isPalindrome("hello"));
    }

    @Test
    public void testNullIsNotPalindrome() {
        StringUtil util = new StringUtil();

        assertFalse(util.isPalindrome(null));
    }

    @Test
    public void testEmptyStringIsNotPalindrome() {
        StringUtil util = new StringUtil();

        assertFalse(util.isPalindrome(""));
    }
}