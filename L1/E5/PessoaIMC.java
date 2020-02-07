public abstract class PessoaIMC extends Pessoa{
	
	private double peso, altura;

	public PessoaIMC(String nome, String dataNascimento, double peso, double altura) {
		super(nome, dataNascimento);
		this.peso = peso;
		this.altura = altura;
	}

	public double getPeso() {
		return this.peso;
	}

	public double getAltura() {
		return this.altura;
	}
	
	public double calculaIMC(double peso, double altura ) {
		return (double)peso/(double)(altura*altura);
	}
	
	public abstract String resultIMC();
	
	@Override
	public String toString() {
		return super.toString() + "\nPeso: " + this.getPeso() + 
				"\nAltura: " + this.getAltura() + "\n IMC: " + 
				this.calculaIMC(this.peso, this.altura);
	}
}
