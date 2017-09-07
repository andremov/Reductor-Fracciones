/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reductorfracciones;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Andrés Movilla
 */
public class ReductorFracciones {

    static String numerator;
    static String denominator;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	numerator = s.nextLine();
	denominator = s.nextLine();
	
	while (!simplify()) {
	    System.out.println(numerator + " / " + denominator);
	}
    }
    
    public static boolean simplify() {
	
	if (!rule10()) {
	    if (!rule2()) {
		if (!rule5()) {
		    
		}
	    }
	}
	
	return false;
    }
    
    public static boolean rule10() {
	String lastN = "" + numerator.charAt(numerator.length()-1);
	String lastD = "" + denominator.charAt(denominator.length()-1);
	if (lastN.equals(lastD) && lastD.equals("0")) {
	    numerator = numerator.substring(0, numerator.length()-1);
	    denominator = denominator.substring(0, denominator.length()-1);
	    return true;
	}
	return false;
    }
    
    public static boolean rule2() {
	String lastN = "" + numerator.charAt(numerator.length()-1);
	String lastD = "" + denominator.charAt(denominator.length()-1);
	int intLastN = Integer.parseInt(lastN);
	int intLastD = Integer.parseInt(lastD);
	
	if (intLastN%2 == 0 && intLastD%2 == 0) {
	    BigInteger num = new BigInteger(numerator);
	    num = num.divide(new BigInteger("2"));
	    numerator = num.toString();
	    
	    BigInteger den = new BigInteger(denominator);
	    den = den.divide(new BigInteger("2"));
	    denominator = den.toString();
	    return true;
	}
	return false;
    }
    
    public static boolean rule5() {
	String lastN = "" + numerator.charAt(numerator.length()-1);
	String lastD = "" + denominator.charAt(denominator.length()-1);
	if ((lastN.equals("0") || lastN.equals("5")) && (lastD.equals("0") || lastD.equals("5"))) {
	    BigInteger num = new BigInteger(numerator);
	    num = num.divide(new BigInteger("5"));
	    numerator = num.toString();
	    
	    BigInteger den = new BigInteger(denominator);
	    den = den.divide(new BigInteger("5"));
	    denominator = den.toString();
	    return true;
	}
	return false;
    }
    
    public static int[] getPrimes(String bigNumber) {
	int[] primes = new int[10];
	
	for (int i = 0; i < 10; i++) {
	    
	}
	
	return primes;
    }
    
}
