package poe;


import static org.junit.Assert.*;
import org.junit.Test;

public class LoginTest
{
    
    public LoginTest()
    {
    }

    @Test
    public void testCheckPasswordComplexity()
    {
        Login instance = new Login();
        boolean result, expResult;
        String str;
        //-------------------------------------------------
        System.out.println("checkPasswordComplexity - Ch&&sec@ke99!\\");
        str = "Ch&&sec@ke99!\\";
        expResult = true;
        result = instance.checkPasswordComplexity(str);
        assertEquals(expResult, result);
        //-------------------------------------------------
        System.out.println("checkPasswordComplexity - password");
        str = "password";
        expResult = false;
        result = instance.checkPasswordComplexity(str);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckUserName()
    {
        Login instance = new Login();
        boolean result, expResult;
        String str;
        //-------------------------------------------------
        System.out.println("checkUserName - kyl_1");
        str = "kyl_1";
        expResult = true;
        result = instance.checkUserName(str);
        assertEquals(expResult, result);
        //-------------------------------------------------
        System.out.println("checkUserName - kyle!!!!!!!");
        str = "kyle!!!!!!!";
        expResult = false;
        result = instance.checkUserName(str);
        assertEquals(expResult, result);
    }
    
}