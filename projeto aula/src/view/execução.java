package view;
import model.Pessoa;

public class execução {
	public static void main(String[]args) {
		Pessoa pessoa=new Pessoa();
		pessoa.setNome("Mario The Best");
		pessoa.setEndereco("Frank Domingos Torchia");
		pessoa.setBairro("Parque Savoy");
		pessoa.setCep(1000);
		pessoa.setCidade("Sao Paulo");
		pessoa.setEstado("S.P.");
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getEndereco());
		System.out.println(pessoa.getBairro());
		System.out.println(pessoa.getCep());
		System.out.println(pessoa.getCidade());
		System.out.println(pessoa.getEstado());
		}
}
		
	