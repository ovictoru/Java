package aula_03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade = 0, maiores = 0, menores = 0, contador = 0;

		while (contador >= 0) {

			System.out.println("Informe sua idade:");
			idade = leia.nextInt();

			if (idade < 0)
				break;
			if (idade > 0 && idade < 21)
				menores++;
			else if (idade > 50)
				maiores++;

			contador++;

		}

		System.out.println("Total de pessoas menores que 21 anos:" + menores);
		System.out.println("Total de pessoas maiores que 50 anos:" + maiores);

		leia.close();

	}

}
