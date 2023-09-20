/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entity.DiscountCalculator;
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
public class DiscountCalculatorTest {

    public DiscountCalculatorTest() {
    }

    DiscountCalculator dc;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        dc = new DiscountCalculator();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void verificarCalculoDescuento() {
        assertEquals(10, dc.calcularDescuento(100, 10), 0);
        assertEquals(250, dc.calcularDescuento(500, 50), 0);
        assertEquals(0, dc.calcularDescuento(120, 0), 0);
    }
}
