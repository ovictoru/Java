package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01F {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		int opcao;
		String nome;
		
		while(true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Cliente na Fila            ");
			System.out.println("            2 - Listar todos os Clientes             ");
			System.out.println("            3 - Retirar Cliente da Fila              ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = leia.nextInt();
			
			if(opcao == 0) {
				System.out.println("Programa foi Finalizado");
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1: 
				System.out.println("Adicionar Cliente");
				System.out.println("Digite o nome do Cliente");
				leia.skip("\\R?");
				nome = leia.nextLine();
				fila.add(nome);
				System.out.println("Cliente foi Adicionado");
				break;
			case 2: 
				System.out.println("Consultar Clientes na fila");
				fila.forEach(System.out::println);
				break;
			case 3: 
				System.out.println("Chamar Cliente");
				if(fila.isEmpty())
					System.out.println("A Fila esta vazia!");
				else
					System.out.println("Cliente: " + fila.poll() + " Compareça ao Guiche 01");
				break;
			default:
				System.out.println("Opcao Inválida!");
			}
			
		}
		
		
		

	}

}
