public class FuncionarioContratado extends Funcionario {

	private int numeroDependentes;
	private float salarioFamilia;
	private final float VALOR_POR_DEP = 9.58f;
	private final float ALIQUOTA_RI = 0.15f;

	public FuncionarioContratado(String nome, String codigo, float salario) {
		super(nome, codigo, salario);

	}

	public FuncionarioContratado(String nome, String codigo, float salario, int numeroDependentes) {
		super(nome, codigo, salario);
		this.numeroDependentes = numeroDependentes;
		this.calculaSalario();
		this.calculaSalario(numeroDependentes);
	}

	public void calculaSalario() {
		super.calculaSalario(ALIQUOTA_RI);
	}
	public void calculaSalario(int numeroDependentes) {
		this.salarioFamilia = (numeroDependentes * VALOR_POR_DEP);
		super.salario += this.salarioFamilia;
		this.calculaSalario();
	}

	@Override
	public String toString() {
		return "Nome:" + super.getNome() + "\nCódigo: " + super.getCodigo() +
				"\nSalario-base: " + super.getSalario() + "\nSlaraio-Liquido: " 
				+ super.getSalarioLiquido() + "\n";
	}

	public int getNumeroDependentes() {
		return this.numeroDependentes;
	}

	public float getSalarioFamilia() {
		return this.salarioFamilia;
	}

	public float getVALOR_POR_DEP() {
		return this.VALOR_POR_DEP;
	}

	public float getALIQUOTA_RI() {
		return this.ALIQUOTA_RI;
	}

}

