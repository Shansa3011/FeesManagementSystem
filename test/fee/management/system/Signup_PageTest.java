/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package fee.management.system;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sathw
 */
public class Signup_PageTest {
    
    public Signup_PageTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Signup_Page.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Signup_Page instance = new Signup_Page();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validation method, of class Signup_Page.
     */
    @Test
    public void testValidation() {
        System.out.println("validation");
        Signup_Page instance = new Signup_Page();
        boolean expResult = false;
        boolean result = instance.validation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkpassword method, of class Signup_Page.
     */
    @Test
    public void testCheckpassword() {
        System.out.println("checkpassword");
        Signup_Page instance = new Signup_Page();
        instance.checkpassword();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkcontact method, of class Signup_Page.
     */
    @Test
    public void testCheckcontact() {
        System.out.println("checkcontact");
        Signup_Page instance = new Signup_Page();
        instance.checkcontact();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertDetails method, of class Signup_Page.
     */
    @Test
    public void testInsertDetails() {
        System.out.println("insertDetails");
        Signup_Page instance = new Signup_Page();
        instance.insertDetails();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Signup_Page.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Signup_Page.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
