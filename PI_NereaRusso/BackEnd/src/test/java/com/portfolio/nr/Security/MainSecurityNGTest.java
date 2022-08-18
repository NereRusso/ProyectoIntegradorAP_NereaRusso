/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.portfolio.nr.Security;

import com.portfolio.nr.Security.jwt.JwtTokenFilter;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author Usuario
 */
public class MainSecurityNGTest {
    
    public MainSecurityNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of jwtTokenFilter method, of class MainSecurity.
     */
    @org.testng.annotations.Test
    public void testJwtTokenFilter() {
        System.out.println("jwtTokenFilter");
        MainSecurity instance = new MainSecurity();
        JwtTokenFilter expResult = null;
        JwtTokenFilter result = instance.jwtTokenFilter();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of passwordEncoder method, of class MainSecurity.
     */
    @org.testng.annotations.Test
    public void testPasswordEncoder() {
        System.out.println("passwordEncoder");
        MainSecurity instance = new MainSecurity();
        PasswordEncoder expResult = null;
        PasswordEncoder result = instance.passwordEncoder();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configure method, of class MainSecurity.
     */
    @org.testng.annotations.Test
    public void testConfigure_HttpSecurity() throws Exception {
        System.out.println("configure");
        HttpSecurity http = null;
        MainSecurity instance = new MainSecurity();
        instance.configure(http);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticationManager method, of class MainSecurity.
     */
    @org.testng.annotations.Test
    public void testAuthenticationManager() throws Exception {
        System.out.println("authenticationManager");
        MainSecurity instance = new MainSecurity();
        AuthenticationManager expResult = null;
        AuthenticationManager result = instance.authenticationManager();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticationManagerBean method, of class MainSecurity.
     */
    @org.testng.annotations.Test
    public void testAuthenticationManagerBean() throws Exception {
        System.out.println("authenticationManagerBean");
        MainSecurity instance = new MainSecurity();
        AuthenticationManager expResult = null;
        AuthenticationManager result = instance.authenticationManagerBean();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configure method, of class MainSecurity.
     */
    @org.testng.annotations.Test
    public void testConfigure_AuthenticationManagerBuilder() throws Exception {
        System.out.println("configure");
        AuthenticationManagerBuilder auth = null;
        MainSecurity instance = new MainSecurity();
        instance.configure(auth);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
