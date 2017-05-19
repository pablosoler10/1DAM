//Pablo Soler Ausina

package com.practicas.ede;

// ¿Qué puede hacer esta Clase?
// Esta clase contiene una serie de metodos que transforma una cadena de caracteres a binario
public class BinString {
	public BinString(){}

	// ¿Qué hace este método?
	// Realiza los metodos sumar y abinario
	public String convertir(String s){
		return aBinario(sumar(s));
	}
	
	// ¿Qué hace este método?
	// Transforma una cadena de caracteres en ascii
	public int sumar(String s){
		String s1 = s.substring(0);
		int sum = 0;
		while(!s1.equals(""))
		{
			sum = sum+(int)(s1.charAt(0));
			s1 = s1.substring(1);
		}
		
		return sum;
	}
	
	// ¿Qué hace este método?
	// Transforma un valor en binario
	public String aBinario(int n){
	    String s = "";
	    
	    while (n > 0)
	    {
	    	if(n%2==0)
	    		s = "0"+s;
	    	else
	    		s = "1"+s;
	        n = n / 2;
	    }
	    
	    return s;
	}
}
