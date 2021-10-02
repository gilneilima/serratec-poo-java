package exercicioNove;

public class TesteEndereco {

	public static void main(String[] args) {
		Estado estado1 = new Estado("Minas Gerais", "MG");
		Cidade cidade1 = new Cidade("Betim", estado1);
		Endereco endereco1 = new Endereco("Rua do Trem", "Morro Verde", "25067-456", cidade1);
		Telefone telefone1 = new Telefone("3445-8267");
		Contato contato1 = new Contato("Roni Rodan", endereco1);
		
		Telefone[] telefones = new Telefone[1];
		telefones[0] = telefone1;
		
		contato1.setTelefones(telefones);
		
		System.out.println(contato1.toString());//toString é redundante.
		
		
	}

}
