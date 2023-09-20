/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entity.TemperatureConverter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Haze
 */
public class TemperatureConverterTest {

    public TemperatureConverterTest() {
    }
    
    TemperatureConverter tc;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        tc = new TemperatureConverter();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void conversionCelciusAKelvin() {
        assertEquals(297, tc.conversionCaK(24), 0);
    }

    @Test
    public void conversionCelciusAFahrenheit() {
        assertEquals(60, tc.conversionCaF(16), 0);
    }

    @Test
    public void conversionKelvinACelcius() {
        assertEquals(-73, tc.conversionKaC(200), 0);
    }

    @Test
    public void conversionKelvinAFahrenheit() {
        assertEquals(-99, tc.conversionKaF(200), 0);
    }

    @Test
    public void conversionFahrenheitACelcius() {
        assertEquals(20, tc.conversionFaC(69), 0);
    }

    @Test
    public void conversionFahrenheitAKelvin() {
        assertEquals(308, tc.conversionFaK(96), 0);
    }

}
