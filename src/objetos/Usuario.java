package objetos;

import java.util.Scanner;

public class Usuario {
	private String nombre;
	private String fechaNac;
	private String cuenta;
	private double saldo;
	private String log_ing = "";
	private String log_ret = "";
	
	// Constructor
	public Usuario(String nombre, String fechaCreacion, String cuenta, double saldo) {
		this.nombre = nombre;
		this.fechaNac = fechaCreacion;
		this.cuenta = cuenta;
		this.saldo = saldo;
	}

	// Métodos
	
	public void verDatos() {
		System.out.println("\nDatos de la cuenta\n" + "Nombre: " + getNombre() + "\n" + "Fecha de nacimiento: " + getFechaNac() + "\n" + "Numero de cuenta: " + getCuenta());
	}
	
	public void ingresarDinero(double ingreso) {
		if (ingreso < 0) {
			System.out.println("Lo siento, no se puede ingresar una cantidad negativa");
		} else {
			saldo += ingreso;
			log_ing += "+" + ingreso + "€" + "\n";
			System.out.println("\nSaldo actual: " + saldo + "€");
		}
		
	}
	
	public void retirarDinero(double retiro) {
		Scanner sc = new Scanner(System.in);
		String confirmacion;
		if (retiro < 0) {
			System.out.println("Lo siento, no se puede retirar una cantidad negativa");
		}
		if (retiro > saldo) {
			System.out.print("\n¿Quiere retirar? Su saldo será negativo (S/N): ");
			confirmacion = sc.nextLine();
			
			if (confirmacion.toUpperCase().equals("S")) {
				saldo -= retiro;
				log_ret += "-" + retiro + "€" + "\n";
				System.out.println("\nSaldo actual: " + saldo + "€");
			} else if (confirmacion.toUpperCase().equals("N")){
				System.out.println("\nLa cantidad no ha sido retirada");
				System.out.println("\nSaldo actual: " + saldo + "€");
			} else {
				System.err.println("ERROR: opcion desconocida");
			}
			
		} else {
			saldo -= retiro;
			log_ret += "-" + retiro + "€" + "\n";
			System.out.println("\nSaldo actual: " + saldo + "€");
		}
	}
	
	public void cambioMonedas(int cambio) {
		switch (cambio) {
		case 1:
			System.out.println("\nTu saldo en dólares estadounidenses es: " + (saldo * 0.95) + "$");
			break;
		case 2:
			System.out.println("\nTu saldo en libras esterlinas es: " + (saldo * 1.15) + "£");
			break;
		case 3:
			System.out.println("\nTu saldo en yuanes chinos es: " + (saldo * 0.13) + "¥");
			break;
		default:
			System.err.println("ERROR: Opcion desconocida");
		}
	}
	
	public void verIngresos() {
		System.out.print("\n" + "Tus ingresos han sido:\n" + log_ing);
	}
	
	public void verRetiros() {
		System.out.println("\n" + "Tus retiros han sido:\n" + log_ret);
	}
	
	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaCreacion) {
		this.fechaNac = fechaCreacion;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
