public class Funcionario {

	private String nome;
	private String codigo;
	protected float salario;
	private float salarioLiquido;

	public String getNome() {
		return this.nome;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public float getSalario() {
		return (float) (Math.round(this.salario * 100.0)/100.0);
	}

	public float getSalarioLiquido() {
		return (float) (Math.round(this.salarioLiquido * 100.0)/100.0);
	}

	public Funcionario(String nome, String codigo, float salario) {
		this.nome = nome;
		this.codigo = codigo;
		this.salario = salario;
		this.salarioLiquido = salario;
	}

	public double calculaSalario(double desconto) {
		this.salarioLiquido = this.salario - (float) (this.salario * desconto);
		return this.salarioLiquido;
	}

	@Override
	public String toString() {
		return "Nome:" + this.nome + "\nCódigo: " + this.codigo +
				"\nSalario-base: " + this.salario + "\n";
	}
}

