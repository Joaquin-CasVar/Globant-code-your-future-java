/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entity.DateValidator;
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
public class DateValidatorTest {
    
    public DateValidatorTest() {
    }
    
    DateValidator d;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        d = new DateValidator();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testValidarFechas() {
        assertTrue(d.checkFechaValida("01/03/2002"));
        assertTrue(d.checkFechaValida("29/02/2004"));
        assertTrue(d.checkFechaValida("30/04/2004"));
        assertTrue(d.checkFechaValida("28/02/2003"));
    }
}
