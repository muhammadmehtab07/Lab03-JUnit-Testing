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
public class TemperatureConverterTest {

    @Test
    public void testCelsiusToFahrenheitZero() {
        TemperatureConverter converter = new TemperatureConverter();

        double result = converter.celsiusToFahrenheit(0);

        assertEquals(32, result, 0.01);
    }

    @Test
    public void testCelsiusToFahrenheitHundred() {
        TemperatureConverter converter = new TemperatureConverter();

        double result = converter.celsiusToFahrenheit(100);

        assertEquals(212, result, 0.01);
    }

    @Test
    public void testFahrenheitToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();

        double result = converter.fahrenheitToCelsius(32);

        assertEquals(0, result, 0.01);
    }

    @Test
    public void testCelsiusToKelvin() {
        TemperatureConverter converter = new TemperatureConverter();

        double result = converter.celsiusToKelvin(0);

        assertEquals(273.15, result, 0.01);
    }

    @Test
    public void testRoundTripConversion() {
        TemperatureConverter converter = new TemperatureConverter();

        double celsius = 25;

        double fahrenheit = converter.celsiusToFahrenheit(celsius);
        double result = converter.fahrenheitToCelsius(fahrenheit);

        assertEquals(celsius, result, 0.01);
    }
}