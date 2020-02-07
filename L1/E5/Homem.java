public class Homem extends PessoaIMC {

	public Homem(String nome, String dataNascimento, double peso, double altura) {
		super(nome, dataNascimento, peso, altura);
	}

	@Override
	public String resultIMC() {
		if (super.calculaIMC(super.getPeso(), super.getAltura()) < 20.1 ){
			return "Abaixo do Peso\n";
		}
		else if(super.calculaIMC(super.getPeso(), super.getAltura()) > 26.4) {
			return "Acima do Peso\n";
		}
		return "Peso Ideal";
	}
	
	@Override
	public String toString() {
		return super.toString() + "  " + this.resultIMC();
	}
}
