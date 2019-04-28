package cinco;

import java.util.Scanner;

public class TestSorteo {
	
	public static int pedirNumero() {
		int numero;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				numero = sc.nextInt();				
			} catch (Exception e) {
				numero = 0;
				sc.nextLine();
			}
			if(numero != 1 && numero != 2) {
				System.out.println("Opcion no valida solo 1 o 2");
			}
		} while (numero != 1 && numero != 2);
				
		return numero;
	}
	
	public static String moneda(int numero) {
		String opcion;
		
		if (numero == 1) {
			opcion = "cara";
		}else {
			opcion = "cruz";
		}
		
		return opcion;
	}
	
	public static void main(String[] args) {
		int opcion;
		int tirada;
		Dado d1 = new Dado();
		Moneda m1 = new Moneda();
		
		do {
			System.out.println("Si quieres lanzar un dado pulsa 1");
			System.out.println("Si quieres lanzar una moneda pulsa 2");
			opcion = pedirNumero();
			if(opcion == 1) {
				System.out.println("Has elegido el dado");
				tirada = d1.lanzar();
				System.out.println("Has sacado el numero " + tirada);
			}else {
				System.out.println("Has elegido la moneda");
				tirada = m1.lanzar();
				System.out.println("Has sacado " + moneda(tirada));
			}
			System.out.println("\nSi quieres hacer otra tirada pulsa 1");
			System.out.println("Si quieres salir pulsa 2");
			opcion = pedirNumero();
		} while (opcion == 1);
		System.out.println("El programa ha finalizado");

	}

}
