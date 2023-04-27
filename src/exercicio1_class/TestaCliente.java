package exercicio1_class;

public class TestaCliente {

	public static void main(String[] args) {
		
		ClassCliente C1 = new ClassCliente();
		
		C1.nome= "Rafaela\n";
		C1.profissao = "Engenheira\n";
		C1.endereco = "R. Jacupiranga\n";
		C1.email = "rafaelaferreira996@gmail.com\n";
		C1.cpf = 123456789;
		
		
		C1.visualizar(C1.nome,C1.profissao, C1.cpf, C1.email, C1.endereco);
				
	}

}
