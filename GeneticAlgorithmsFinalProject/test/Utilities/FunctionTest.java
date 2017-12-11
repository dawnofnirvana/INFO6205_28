/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import Gene.Individual;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class FunctionTest {
    
    public FunctionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of crossover method, of class Function.
     */
    @Test
    public void testCrossover() {
        System.out.println("crossover");
        Individual a =new Individual();
        a.generate();
        Individual expResult = null;
        Individual result = Function.crossover(a);
        assertNotNull( result);
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of mutation method, of class Function.
     */
    @Test
    public void testMutation() {
        System.out.println("mutation");
        Individual a=new Individual();
        a.generate();
        Function.mutation(a);
        assertNotNull(a);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of InsertionSort method, of class Function.
     */
    @Test
    public void testInsertionSort() {
        System.out.println("InsertionSort");
        Individual[] a =new Individual[10];
        for(int i=0;i<10;i++){a[i]=new Individual();a[i].generate();}
        Function.InsertionSort(a);
        assertNotNull(a);
        // TODO review the generated test code and remove the default call to fail.
   
    }
    
}
