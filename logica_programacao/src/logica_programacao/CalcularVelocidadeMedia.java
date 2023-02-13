package logica_programacao;

public class CalcularVelocidadeMedia {

	public static void main(String[] args) {

		//Mensagem que funciona como uma espécie de titulo para o programa.
		System.out.println("=== CÁLCULO DA VELOCIDADE MÉDIA ==========");
		// Sempre que nos deparamos com o comando "System.out.println", entendemos que alguma coisa será mostrada no console.
		
		double distanciaPercorrida = 150;
		// Este próximo passo é a declaração de uma Variavel(uma informação, valor) que guardara o valor referente a distância percorrida.
		// Variável é como se fosse uma caixinha da nossa memória, onde nós podemos guardar alguma informação (dados), no caso acima, foi a distância percorrida.
		
		System.out.println("A distância percorrida foi de " + distanciaPercorrida + "Km.");
		// Aqui também utilizamos o comando "sysout", mas a diferença é que foi feito o uso do sinal + que quando utilizado junto com textos é para juntar a informação da variável. 
		// Chamamos esse processo de juntar a informação do texto com a informação da variável de "CONCATENAÇÃO".
		// JUNTAR O LADO ESQUERDO COM O LADO DIREITO E VICE VERSA.
		//Dentro da programação o sinal de + funciona como um OPERADOR DE ADIÇÃO, mas junto com um texto, seja qual for o lado, vai acontecer uma CONCATENAÇÃO, formando uma só sentença (mensagem).
		// A CONCATENAÇÃO é uma técnica muito util onde for necessário colocar um VALOR DINÂMICO junto com um TEXTO.
		// No caso acima, o valor dinamico é o distanciaPercorrida.
		
		double tempoGasto = 1.5; 
		
		System.out.println("O tempo gasto foi de " + tempoGasto + " horas.");
		
		double velocidadeMedia = distanciaPercorrida / tempoGasto;
		
		System.out.println("Para encontrar a velocidade média " + "dividimos a distância (" + distanciaPercorrida + ") pelo tempo gasto no " + "percurso (" + tempoGasto + ").");
		
		System.out.println("A velocidade média é de " + velocidadeMedia + "Km/h");

		
		/* DICA
		Comentários de blocos

		*/
		
		
		/** DICA
		 * Comentarios de blocos
		 * Melhor formatado
		 * Da para fazer tópicos
		**/
		
		
		
	}

}
