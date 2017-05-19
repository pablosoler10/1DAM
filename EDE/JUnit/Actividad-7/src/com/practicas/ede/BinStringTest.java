package com.practicas.ede;

import static org.junit.Assert.*;
import junit.framework.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinStringTest {

	private BinString binString;
	
	
	public BinStringTest(){
		
		binString = new BinString();
		
	}
	
	@Test
	public void  sumarTest(){
		// Test de la función sumar
		int expected = 292;		
		
		assertEquals(expected, binString.sumar("aba"), 0.1);
		//expected = 100;
	}
	
	@Test
	public void aBinarioTest() {
		
		String expected = "100100100";
		
		assertEquals(expected, binString.aBinario(292));

	}
	
	@Test
	public void convertirTest() {
		// Test de la función convertirTest
		String expected = "100100100";
		
		assertEquals(expected, binString.convertir("aba"));
	}
}
