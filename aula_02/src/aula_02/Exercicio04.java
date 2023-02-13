package aula_02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
	    
        Scanner leia = new Scanner(System.in);

        String palavra1, palavra2, palavra3;

        System.out.println("O animal é Vertebrado ou Invertebrado? ");
        leia.skip("\\R?");
		palavra1 = leia.nextLine();


        if (palavra1.equals("Vertebrado") || palavra1.equals("vertebrado"))  {
            
            System.out.println("O animal é uma Ave ou um Mamífero? ");
            leia.skip("\\R?");
            palavra2 = leia.nextLine();

            if (palavra2.equals("Ave") || palavra2.equals("ave")){
                
                System.out.println("O animal é Carnívoro ou Onívoro? ");
                leia.skip("\\R?");
                palavra3 = leia.nextLine();

	                if (palavra3.equals("Carnívoro") || palavra3.equals("Carnivoro") || palavra3.equals("carnívoro") || palavra3.equals("carnivoro"))
	                    System.out.println("O animal escolhido foi Águia.");
	                else if (palavra3.equals("Onívoro") || palavra3.equals("Onivoro") || palavra3.equals("onívoro") || palavra3.equals("onivoro"))
	                    System.out.println("O animal escolhido foi Pomba.");

            }
            else if (palavra2.equals("Mamífero") || palavra2.equals("Mamifero") || palavra2.equals("mamífero") || palavra2.equals("mamifero")){

                System.out.println("O animal é Onívoro ou Herbívoro? ");
                leia.skip("\\R?");
                palavra3 = leia.nextLine();

                if (palavra3.equals("Onívoro") || palavra3.equals("Onivoro") || palavra3.equals("onívoro") || palavra3.equals("onivoro"))
                    System.out.println("O animal escolhido foi Homem.");
                else if (palavra3.equals("Herbívoro") || palavra3.equals("Herbivoro") || palavra3.equals("herbívoro") || palavra3.equals("herbivoro"))
                    System.out.println("O animal escolhido foi Vaca.");

            }

        }
        else if (palavra1.equals("Invertebrado") || palavra1.equals("invertebrado")) {
            
            System.out.println("O animal é Inseto ou Anelídeo? ");
            leia.skip("\\R?");
            palavra2 = leia.nextLine();

            if (palavra2.equals("Inseto") || palavra2.equals("inseto")) {

                System.out.println("O animal é Hematófago ou Herbívoro? ");
                leia.skip("\\R?");
                palavra3 = leia.nextLine();

                if (palavra3.equals("Hematófago") || palavra3.equals("Hematofago")  || palavra3.equals("hematófago")  || palavra3.equals("hematofago"))
                    System.out.println("O animal escolhido foi Pulga.");
                else if (palavra3.equals("Herbívoro") || palavra3.equals("Herbivoro") || palavra3.equals("herbívoro") || palavra3.equals("herbivoro"))
                    System.out.println("O animal escolhido foi Lagarta.");

            }
            else if (palavra2.equals("Anelídeo") || palavra2.equals("Anelideo") || palavra2.equals("anelídeo") || palavra2.equals("anelideo")) {
                
                System.out.println("O animal é Hematófago ou Onívoro? ");
                leia.skip("\\R?");
                palavra3 = leia.nextLine();

	                if (palavra3.equals("Hematófago") || palavra3.equals("Hematofago")  || palavra3.equals("hematófago")  || palavra3.equals("hematofago"))
	                    System.out.println("O animal escolhido foi Sanguessuga.");
	                else if (palavra3.equals("Onívoro") || palavra3.equals("Onivoro") || palavra3.equals("onívoro") || palavra3.equals("onivoro"))
	                    System.out.println("O animal escolhido foi Minhoca.");

            }

        }

        leia.close();

	}

}
