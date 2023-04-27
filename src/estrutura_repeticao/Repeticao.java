package estrutura_repeticao;

import java.util.Scanner;

public class Repeticao {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int contador=0; 
		
		for (contador=1; contador <= 4; contador++) {
			System.out.println("Digite o "+ contador + "º nome: ");
			nome = leia.nextLine();
			
			System.out.println("\nO " + contador + "º nome e " + nome + ".\n");
		}
		
		
	}
}
