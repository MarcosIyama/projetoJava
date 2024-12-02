package introducao;

import java.util.Scanner; // Importando Scanner para dentro da Classe

public class EntradaSaida {

	public static void main(String[] args) {
		
		// Variaveis
		String nome;
		float temperatura;
		float fahrenheit;
		
		Scanner leia = new Scanner(System.in);
		
		// Pedir/Inserir o nome, temperatura
		System.out.println("Insira o seu nome: ");
		nome = leia.nextLine(); // .next() lê apenas a primeira palavra
		
		System.out.println("Insira a temperatura em Celsius: ");
		temperatura = leia.nextFloat();
		
		// Processamento
		fahrenheit = temperatura * 1.8f + 32;
		
		// Saída dos Dados
		System.out.println("Bom dia, " + nome);
		//System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "°F"); // Concatenação
		System.out.printf("A temperatura em Fahrenheit é: %.2f°F" , fahrenheit); // Outra opção utilizando o printf()
	}

}
