package aula_03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n1, n2;

		System.out.println("Digite o primeiro número do intervalo:");
		n1 = leia.nextInt();

		System.out.println("Digite o último número do intervalo:");
		n2 = leia.nextInt();

		if (n1 > n2)
			System.out.println("Intervalo inválido!");

		for (n1 = n1; n1 <= n2; n1++) {
			if (n1 % 3 == 0 && n1 % 5 == 0)
				System.out.println(n1 + " É mutiplo de 3 e 5 ");
		}

		leia.close();

	}

}
