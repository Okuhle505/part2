/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package part_1;

import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author RC_Student_lab
 */
public class Registration extends javax.swing.JFrame (
    
     /**
     * Test of checkUserName method, of class Registration.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "kyl_";
        boolean expResult = true;
        boolean result = Registration.checkUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
