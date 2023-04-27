package exercicio1_class;

import java.util.Scanner;

public class ClassCliente {

	    Scanner input = new Scanner (System.in);
		// Declaração de Atributos
		String nome; 
		String profissao;
		String email;
		String endereco;
		int cpf;
		
		// Declaração de Métodos
		
		void visualizar (String exibir_nome, String exibir_profissao, int exibir_cpf, String exibir_endereco, String exibir_email) {
			System.out.println("        ____Dados do Cliente____ \n\n"+ "nome: \n"+exibir_nome);
			System.out.println ("Profissao: \n" +exibir_profissao);
			System.out.println ("Endereço: \n" + exibir_email);
			System.out.println ("E-mail: \n" + exibir_endereco);
			System.out.println ("CPF: \n"+ exibir_cpf);
		}

}
