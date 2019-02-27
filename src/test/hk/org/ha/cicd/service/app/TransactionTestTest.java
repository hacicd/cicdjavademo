package hk.org.ha.cicd.service.app;

import static org.junit.Assert.assertFalse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.Assert;
import org.junit.Test;

public class TransactionTestTest {
	
	public TransactionTestTest(){};

	@Test
	public void testJavaVersion(){
		System.out.println("/*********************************");
		System.out.println("*********" + System.getProperty("java.version") + "**********");
		System.out.println("*********************************/");
	}

	@Test
	public void testXSLVersion(){
		System.out.println("/*********************************");
		System.out.println("System.getProperty(xsl:version) = " + System.getProperty("xsl:version"));
		System.out.println("*********************************/");
	}
	
	@Test
	public void testPass(){
		assertFalse(false);
		//test 2

		// test 3
	}
	
	
	/*@Test
	public void testFail(){
		assertFalse(true);
	}*/
	

	// test


}