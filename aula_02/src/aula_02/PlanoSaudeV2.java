package aula_02;

import java.util.Scanner;

public class PlanoSaudeV2 {

	public static void main(String[] args) {	

		Scanner leia = new Scanner(System.in);

		int faixa;

		//Apresentar opções de faixa etária para usuário
		System.out.println("Escolha sua Faixa Etária:");
		
		// O /t serve para manter espaços.
		System.out.println("1-\tAté 10 anos");
		System.out.println("2-\tDe 11 a 29 anos");
		System.out.println("3-\tDe 30 a 45 anos");		
		System.out.println("4-\tDe 46 a 59 anos");
		System.out.println("5-\tDe 60 a 65 anos");
		System.out.println("6-\tAcima de 65 anos \n \n");
		
		System.out.println("Digite a sua Faixa Etária: ");
		faixa = leia.nextInt();

		switch (faixa) {
		case 1:
			System.out.println("O valor do seu Plano de Saúde será de: R$100,00");
			break;
		case 2:
			System.out.println("O valor do seu Plano de Saúde será de: R$200,00");
			break;
		case 3:
			System.out.println("O valor do seu Plano de Saúde será de: R$300,00");
			break;
		case 4:
			System.out.println("O valor do seu Plano de Saúde será de: R$500,00");
			break;
		case 5:
			System.out.println("O valor do seu Plano de Saúde será de: R$600,00");
			break;
		case 6:
			System.out.println("O valor do seu Plano de Saúde será de: R$1000,00");
			break;
		default:
			System.out.println("Faixa etária inválida!");
		}

		leia.close();

	}

}
