package Paquete1;
/**
 * Primera clase java "Hola Mundo"
 * @author tati0
 *
 */
public class HolaMundo {
/**
 * 
 * @param args
 */
public static void main(String[] args) {
	

		Persona per = new Persona();
		per.setAltura(170);
		per.setNacionalidad("Argentina");
		per.setFuma(false);
		Persona padre = new Persona();
		per.setPadre(padre);
		padre.setNombre("Jorge");
		Persona madre = new Persona();
		per.setMadre(madre);
		madre.setNombre("María");
		

		Persona per2 = new Persona();
		per2.setAltura(180);
		per2.setNacionalidad("Brasilero");
		per2.setFuma(true);
		Persona padre1 = new Persona();
		per2.setPadre(padre1);
		padre1.setNombre("Lucho");
		Persona madre1 = new Persona();
		per2.setMadre(madre1);
		madre1.setNombre("Rosa");
		
		

		System.out.println(per2.getAltura());
		System.out.println(per.getAltura());
		System.out.println("per:" + "con altura" + per.getAltura() + " per2:" + per2.getAltura());
		System.out.println(per.getNacionalidad());
		System.out.println(padre.getNombre());
		System.out.println(per.isFuma() + " " + per.getMadre().getNombre());
		System.out.println(per2.isFuma() + " " + per2.getMadre().getNombre()); // opción diferente donde vas accediendo con .a los atributos de un objeto a través de otro.

		
		
	}

}
