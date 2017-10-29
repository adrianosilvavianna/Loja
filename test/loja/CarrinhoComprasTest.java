/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adriano
 */
public class CarrinhoComprasTest {
    
    private CarrinhoCompras cp;
    
    public CarrinhoComprasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cp = new CarrinhoCompras();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getValorTotal method, of class CarrinhoCompras.
     */
    @Test
    public void testGetValorTotal() {
        cp.getPrecoCompra();
    }

    /**
     * Test of setValorTotal method, of class CarrinhoCompras.
     */
    @Test
    public void testSetValorTotal() {
        System.out.println("setValorTotal");
        double valorTotal = 0.0;
        CarrinhoCompras instance = null;
        instance.setValorTotal(valorTotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CarrinhoCompras.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CarrinhoCompras instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
