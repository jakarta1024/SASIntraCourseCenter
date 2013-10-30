/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sas.brd.dao.hibernate;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.search.Query;
import org.hibernate.Session;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tzuhsien
 */
public class HibernateSearchToolsTest {
    
    public HibernateSearchToolsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of generateQuery method, of class HibernateSearchTools.
     * @throws java.lang.Exception
     */
    @Test
    public void testGenerateQuery() throws Exception {
        System.out.println("generateQuery");
        String searchTerm = "";
        Class searchedEntity = null;
        Session sess = null;
        Analyzer defaultAnalyzer = null;
        Query expResult = null;
        Query result = HibernateSearchTools.generateQuery(searchTerm, searchedEntity, sess, defaultAnalyzer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reindex method, of class HibernateSearchTools.
     */
    @Test
    public void testReindex() {
        System.out.println("reindex");
        Class clazz = null;
        Session sess = null;
        HibernateSearchTools.reindex(clazz, sess);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reindexAll method, of class HibernateSearchTools.
     */
    @Test
    public void testReindexAll() {
        System.out.println("reindexAll");
        boolean async = false;
        Session sess = null;
        HibernateSearchTools.reindexAll(async, sess);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
