package estrutura_repeticao;

import java.util.Scanner;

public class Repeticao2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int resultado, numero, contador=1;
		
		while (contador <4) {
			System.out.println( "Digite o " + contador + "é número: ");
			numero = leia.nextInt();
			
			resultado= numero *3;
			
			System.out.println(numero + "x3 = " + resultado);
			System.out.println("\n");
			
			contador++;
			
		}
		System.out.println("_______Fim do Programa_____");
	}

}
