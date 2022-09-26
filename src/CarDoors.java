
public class CarDoors {
	
	public static void main(String[] args) {
		
	// PRIMERA PARTE
		
		int a;
		int b;
		int c;
		
	// SEGUNDA PARTE	
		
		coche miCoche = new coche();
		
		miCoche.agregarPuerta();
		miCoche.agregarPuerta();
		miCoche.agregarPuerta();
		miCoche.agregarPuerta();
		
		System.out.println(suma(5,5,10));
		System.out.println("el coche tiene "+miCoche.puertas + " puertas");
	
	}
	
	// METODO PRIMERA PARTE
	
	static int suma(int a, int b , int c) {
		
		int suma = a + b + c;
		
		return suma;
	}
	
	
	
	


}


