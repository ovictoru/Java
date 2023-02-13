package aula_02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int item, quantidade;

		System.out.println("Escolha seu item:");

		System.out.println("1-Cachorro Quente");
		System.out.println("2-X-Salada");
		System.out.println("3-X-Bacon");
		System.out.println("4-Bauru");
		System.out.println("5-Refrigerante");
		System.out.println("6-Suco de Laranja");

		System.out.println("Digite o nº de seu item (1/6): ");
		item = leia.nextInt();
		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();

		switch (item) {
		case 1:
			System.out.println("O valor do Cachorro Quente é: R$" + (quantidade * 10));
			break;
		case 2:
			System.out.println("O valor do X-Salada é: R$" + (quantidade * 15));
			break;
		case 3:
			System.out.println("O valor do X-Bacon é: R$" + (quantidade * 18));
			break;
		case 4:
			System.out.println("O valor do Bauru é: R$" + (quantidade * 12));
			break;
		case 5:
			System.out.println("O valor do Refrigerante é: R$" + (quantidade * 8));
			break;
		case 6:
			System.out.println("O valor do suco de Laranja é: R$ " + (quantidade * 13));
			break;
		default:
			System.out.println("Código Inválido");

		}

		leia.close();

	}

}
