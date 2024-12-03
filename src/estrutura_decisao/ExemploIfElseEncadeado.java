package estrutura_decisao;

import java.util.Scanner;

public class ExemploIfElseEncadeado {

	public static void main(String[] args) {

		// Variáveis
		float media;

		Scanner leia = new Scanner(System.in);

		// Entrada
		System.out.println("Digite a sua média: ");
		media = leia.nextFloat();

		// Processamento
		if (media >= 6) {
			System.out.println("Parabéns, você foi aprovade!");
			
		} else if(media >= 5){
			System.out.println("Participante de Exame.");
			
		}else {
			System.out.println("Infelizmente, você foi reprovade.");
		}

		leia.close();

	}

}
