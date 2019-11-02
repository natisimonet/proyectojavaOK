package Paquete1;

public class Persona {
	
	private int altura; //160
	private String nombre; //"cadena"
	private boolean fuma; // true
	private char inicial; //'a'
	private float peso; //60.5f
	private double sueldo; //65000d
	private String nacionalidad; 
	private Persona padre;
	private Persona madre;
	
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isFuma() {
		return fuma;
	}
	public void setFuma(boolean fuma) {
		this.fuma = fuma;
	}
	public char getInicial() {
		return inicial;
	}
	public void setInicial(char inicial) {
		this.inicial = inicial;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Persona getPadre() {
		return padre;
	}
	public void setPadre(Persona padre) {
		this.padre = padre;
	}
	public Persona getMadre() {
		return madre;
	}
	public void setMadre(Persona madre) {
		this.madre = madre;
	}
	
	
}
