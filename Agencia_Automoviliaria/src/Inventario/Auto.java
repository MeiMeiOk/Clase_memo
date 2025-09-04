package Inventario;

public class Auto {
	int cant_puertas;
	String color;
	int velocidades;
	String motor;
	
	
		public Auto(int puertas, String color) {
			this.color = color;
			this.cant_puertas = puertas;
		}
	
	
	
		public void avanza() {
			System.out.println("El auto esta caminando...");
			//no return 
		}
		
		public double reversa(double num) {
			double vel = 2, resul;
			resul = vel * num;
			return resul;
		}
		
		public static void main(String[] args) {
			Auto auto = new Auto(4, "Azul");
			System.out.println(auto.color + auto.cant_puertas);
			auto.avanza();
			double velo = auto.reversa(8.8);
			System.out.println("Velocidad es igual a: " + velo);
			
		}
}
