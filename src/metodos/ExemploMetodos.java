package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {
		
		int resultado = somar(2,5);
		System.out.println("O primeiro resultado é " + resultado);
		
		System.out.println("O segundo resultado é " + somar(8,3));
		
		falar("\nBom dia!");
		falar("O gato amarelo");
		
		falar("\nO primeiro resultado é " + resultado);
		
		ExemploMetodoExterno.mensagem();
		
	}
	
	// Definição do Método Somar - Método Com Retorno e Com Parâmetro
	public static int somar(int x, int y) {
		return x + y;
	}
	
	// Definição do Método Falar - Método Sem Retorno e Com Parâmetro
	public static void falar(String mensagem) {
		System.out.println(mensagem);
	}

}
