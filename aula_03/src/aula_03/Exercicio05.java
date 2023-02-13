package aula_03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0;
		boolean continua = true;
		
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero > 0)
				soma += numero;
			else if(numero  == 0)
				continua = false;
			
		} while (continua == true);
		
		System.out.println("A soma dos números positivos é: " + soma);
		
		leia.close();

	}

}
