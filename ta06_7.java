package project6;

import java.util.Scanner;

public class ta06_7 {
	public static void main(String args[]){						
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Euros: ");
		String aux = sc.nextLine();		
		Double eu = Double.parseDouble(aux);
		System.out.println("Introduzca moneda: ");
		System.out.println("dolar,libra o yen");
		String moneda = sc.nextLine();
		
		conversio(eu,moneda);
						
		sc.close();
		
	}
	
	public static void conversio(double euro, String moneda) {
		
		final double dolar = 1.28611;
		final double yen = 129.852;
		final double libra = 0.86;
		
		double r = 0;
		
		moneda = moneda.toLowerCase();
		
		System.out.println("Conversión");
		
		switch(moneda) {
		case "dolar":
			
			r = euro * dolar;
			System.out.println(euro+" euro = "+r+" dolar");
			
			break;
		case "libra":
			
			r = euro * libra;
			System.out.println(euro+" euro = "+r+" libra");
			
			break;
		case "yen":
			
			r = euro * yen;
			System.out.println(euro+" euro = "+r+" yen");
			
			break;
		default:
			
		}				
		
	}
}
