package classe_scanner;

import java.util.Scanner;

public class EntradaDados {
	
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int quantidade; 
		long identificador;
		float altura;
		double area;
		char tipo;
		String palavra;
		
		System.out.println("\nDigite um valor para a variavel quantidade (int): ");
		quantidade = leia.nextInt();
		
		System.out.println("\nDigite um valor para a variavel identificador (long): ");
		identificador = leia.nextLong();
		
		System.out.println("\nVariavel quantidade= " + quantidade);
		System.out.println("\nVariavel identificador= " + identificador);
	}

}

