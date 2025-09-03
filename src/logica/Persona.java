package logica;

public abstract class Persona {
	protected double peso;
	protected double altura;
	protected int edad;
	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;	
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Persona(double peso, double altura, int edad) {
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
		
	
	public abstract double calcularTMB() throws Exception;
	

}
