package logica;

public class Hombre extends Persona {

	public Hombre(double peso, double altura, int edad) {
		super(peso, altura, edad);

	}
	public double calcularTMB() throws Exception {
		if(this.peso > 110 || this.peso < 60) {
			throw new Exception("El peso no cumple con las caracteristicas requeridas");
		}
		else if(this.altura > 180 || this.altura < 140) {
			throw new Exception("La altura no cumple con las caracteristicas requeridas");
		}
		else if(this.edad <= 15) {
			throw new Exception("La edad no cumple con las caracteristicas requeridas");
		}
					
		return 88.362+(13.397 * this.peso)+(4.799 * this.altura) - (5.677 * this.edad);
	}
	
}

