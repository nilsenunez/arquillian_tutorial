package org.arquillian.tutorial;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PruebaGitJenkisTest 
extends TestCase
	{
	    /**
	     * Create the test case
	     *
	     * @param testName name of the test case
	     */
	    public PruebaGitJenkisTest( String testName )
	    {
	        super( testName );
	    }

	    /**
	     * @return the suite of tests being tested
	     */
	    public static Test suite()
	    {
	        return new TestSuite( PruebaGitJenkisTest.class );
	    }

	    /**
	     * Rigourous Test :-)
	     */
	    public void PruebaGitJenkisTest()
	    {
	        assertTrue( true );
	    }
	}
	
	
