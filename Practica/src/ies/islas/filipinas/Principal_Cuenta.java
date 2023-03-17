package ies.islas.filipinas;

import java.util.Scanner;

public class Principal_Cuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner c = new Scanner (System.in);
		Cuenta a = new Cuenta();
		Cuenta b = new Cuenta();
		//*************************************************
		System.out.println("-El saldo de la cuenta a es: "  );
		a.setSaldo(c.nextDouble());
		System.out.println("-El saldo de la cuenta b es: " );
		b.setSaldo(c.nextDouble());
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("-Voy a ingresar ");
		a.setIngreso(c.nextDouble());
		System.out.println("-Voy a sacar ");
		b.setReintegro(c.nextDouble());
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("-El saldo de la cuenta a es: " + a.getCalculo_ingreso());
		System.out.println("-El saldo de la cuenta b es: " + b.getCalculo_reintegro());
		c.close();
	}

}
