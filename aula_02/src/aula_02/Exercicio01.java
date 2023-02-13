package aula_02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int a, b, c;

		System.out.println("Informe o 1º valor:");
		a = leia.nextInt();

		System.out.println("Informe o 2º valor:");
		b = leia.nextInt();

		System.out.println("Informe o 3º valor:");
		c = leia.nextInt();

		if ((a + b) > c)
			System.out.println("Soma de A + B é maior que C");
		else if ((a + b) < c)
			System.out.println("Soma de A + B é menor que C");
		else
			System.out.println("A soma A + B é igual a C");

		leia.close();

	}

}
