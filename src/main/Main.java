package main;

import java.util.Scanner;

import objetos.Usuario;

public class Main {

	public static void main(String[] args) {
		int opcion = 0;
		
		Scanner sc = new Scanner(System.in);
		
		Usuario u1 = new Usuario("Claudia", "12 de marzo del 2005", "ES45 0926 6535 6328 7352 3134", 0.0);
		
		while (opcion != 7) {
			System.out.print("\n1- Ver datos de la cuenta\n" + "2- Ingresar\n" + "3- Retirar\n" + "4- Cambio de monedas\n" + "5- Ver ingresos realizados\n" + "6- Ver gastos realizados\n" + "7- Salir\n" + ">>> ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				u1.verDatos();
				break;
			case 2:
				double ingreso;
				System.out.print("\nCantidad de dinero a ingresar: ");
				ingreso = sc.nextDouble();
				
				u1.ingresarDinero(ingreso);
				break;
			case 3:
				double retiro;
				System.out.print("\nCantidad de dinero a retirar: ");
				retiro = sc.nextDouble();
				
				u1.retirarDinero(retiro);
				break;
			case 4:
				int cambio;
				System.out.print("\n" + "Elige la equivalencia:\n" + "1- Dólares estadounidenses\n"
						+ "2- Libras esterlinas\n" + "3- Yuanes chinos\n" + ">>> ");
				cambio = sc.nextInt();
				
				u1.cambioMonedas(cambio);
				break;
			case 5:
				u1.verIngresos();
				break;
			case 6:
				u1.verRetiros();
				break;
			case 7:
				System.out.println("\n" + "Gracias por confiar en nosotros!");
				break;
			default:
				System.err.println("ERROR: opcion desconocida");
			}
			
		}
		
		sc.close();

	}

}
