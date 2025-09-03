package view;

import logica.Hombre;
import logica.Mujer;


public class Principal {
	public static void main(String[] args) {
		try {
			//Hombre hombre1 = new Hombre(50, 160, 20);
			Hombre hombre2 = new Hombre(80, 160, 20);
			//double tmb1 = hombre1.calcularTMB();
			double tmb2 = hombre2.calcularTMB();
			//System.out.println("El TMB calculado: " + tmb1);
			System.out.println("El TMB calculado: " + tmb2);

			Mujer mujer2 = new Mujer(60, 160, 20);
			double tmb4 = mujer2.calcularTMB();
			System.out.println("El TMB calculado: " + tmb4);
			

		}catch (Exception e) {
			e.printStackTrace();
	
		}
	}
}

		


