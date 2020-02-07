public class Mulher extends PessoaIMC{

	public Mulher(String nome, String dataNascimento, double peso, double altura) {
		super(nome, dataNascimento, peso, altura);
	}

	@Override
	public String resultIMC() {
		if (super.calculaIMC(super.getPeso(), super.getAltura()) < 19 ){
			return "Abaixo do Peso\n";
		}
		else if(super.calculaIMC(super.getPeso(), super.getAltura()) > 25.8) {
			return "Acima do Peso\n";
		}
		return "Peso Ideal";
	}
	
	@Override
	public String toString() {
		return super.toString() + "  " + this.resultIMC();
	}
}
