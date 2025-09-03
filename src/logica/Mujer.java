package logica;

public class Mujer extends Persona {
	public Mujer(double peso, double altura, int edad) {
		super(peso, altura, edad);

	}
	public double calcularTMB() throws Exception {
		if(this.peso < 40 || this.peso > 80) {
			throw new Exception("El peso no cumple con las caracteristicas requeridas");
		}
		else if(this.altura < 140 || this.altura > 180) {
			throw new Exception("La altura no cumple con las caracteristicas requeridas");
		}
		else if(this.edad <= 15) {
			throw new Exception("La edad no cumple con las caracteristicas requeridas");
		}
					
		return 447.593 +(9.247 * this.peso)+(3.098 * this.altura) - (4.33 * this.edad);
	}
	
}


