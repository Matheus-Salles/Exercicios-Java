
public class Pessoa {

	private String nome, dataNascimento;

	public Pessoa(String nome, String dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return this.nome;
	}

	@Override
	public String toString() {
		return "\nNome: " + this.nome + "\nData de Nascimento: " 
				+ this.dataNascimento;
	}


}
