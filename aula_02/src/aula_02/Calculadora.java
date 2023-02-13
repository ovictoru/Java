package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("###.##");
		// Formatação do número

		double n1, n2;

		System.out.println("Digite o 1º número: ");
		n1 = leia.nextDouble();

		System.out.println("Digite o 2º número: ");
		n2 = leia.nextDouble();

		System.out.println("O número " + n1 + " somado ao numero  " + n2 + " é igual a " + (n1 + n2));
		System.out.println("O número " + n1 + " somado ao numero  " + n2 + " é igual a " + (n1 - n2));
		System.out.println("O número " + n1 + " somado ao numero  " + n2 + " é igual a " + (n1 * n2));

		if (n2 > 0)
			System.out.println("O número " + n1 + " somado ao numero  " + n2 + " é igual a " + (n1 / n2));

		else
			System.out.println("Não é possível dividir um numero por zero!");

		System.out.println("O número " + n1 + " elevado ao numero " + n2 + " é igual a " + Math.pow(n1, n2));
		// Math.pow é para calcular porcentagem.

		System.out.println("A raiz quadrada do número " + n1 + " é igual a " + df.format(Math.sqrt(n1)));
		// Match.sqrt é para calcular a raiz.

		System.out.println("Pré Incremento");
		System.out.println(n1);
		System.out.println(++n1);
		// System sem aspas ("") porque é variavel, somente usar quando é texto.
		System.out.println("Pós Incremento");
		System.out.println(n2);
		System.out.println(n2++);
		System.out.println(n2);

		// Operadores de Atribuição;

		// System.out.println("A soma de n1 + n2 é igual a: " + (n1 = n1 + n2));
		// System.out.println("O novo valor de n1 é igual a : " + n1);

		// Operadores Relacionais (uteis para pegar os intervalos de dados. Vão sempre
		// devolver um valor verdadeiro ou falso);

		// Operadores Lógicos (também retornam um valor verdadeiro ou falso, a diferença
		// é que vai testar mais de uma condição.

		leia.close();
		// Fechar o recurso leia.

	}

}
