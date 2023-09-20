/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entity.Password;
import Service.PasswordValidatorService;
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
public class PasswordValidatorTest {

    public PasswordValidatorTest() {
    }

    PasswordValidatorService ps;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ps = new PasswordValidatorService();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void checkFortalezaContrasenia() {
        Password p1 = new Password("Sussy_");
        Password p2 = new Password("amogus_");
        Password p3 = new Password("baka");
        Password p4 = new Password("JoaquinCas_09");
        assertEquals(2, ps.fortalezaContrasenia(p1), 0);
        assertEquals(1, ps.fortalezaContrasenia(p2), 0);
        assertEquals(0, ps.fortalezaContrasenia(p3), 0);
        assertEquals(3, ps.fortalezaContrasenia(p4), 0);
    }
}
