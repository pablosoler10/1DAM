//Pablo Soler Ausina

package com.practicas.ede;

// �Qu� puede hacer esta Clase?
// Esta clase contiene una serie de metodos que transforma una cadena de caracteres a binario
public class BinString {
	public BinString(){}

	// �Qu� hace este m�todo?
	// Realiza los metodos sumar y abinario
	public String convertir(String s){
		return aBinario(sumar(s));
	}
	
	// �Qu� hace este m�todo?
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
	
	// �Qu� hace este m�todo?
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
