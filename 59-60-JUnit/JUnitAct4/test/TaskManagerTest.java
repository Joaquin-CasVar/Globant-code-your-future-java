/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entity.TaskManager;
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
public class TaskManagerTest {
    
    public TaskManagerTest() {
    }
    TaskManager t;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        t = new TaskManager();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCarga() {
        t.agregarTarea("Sus");
        t.agregarTarea("Amogus");
        t.agregarTarea("asdasd");
        assertEquals(3, t.cantTareas(), 0);

        t.eliminarTarea("Sus");
        assertEquals(2, t.cantTareas(), 0);
        
        t.listarTareas();
    }
}
