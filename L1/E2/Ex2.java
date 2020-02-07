import java.util.Scanner;

public class Ex2 {
		
	public static void imprimeFuncoes(double num){
		
		double rad = Angulo.converteAngulo(num);
		
		double seno = Angulo.funcaoSeno(rad);
		double cosseno =Angulo.funcaoCoseno(rad);
		double tangente = Angulo.funcaoTangente(rad);
		double cotangente = Angulo.funcaoCotangente(rad);
		
		System.out.printf("Seno: %.2f\n", seno);
		System.out.printf("Cosseno: %.2f\n", cosseno);
		System.out.printf("Tangente: %.2f\n", tangente);
		System.out.printf("Cotangente: %.2f\n\n", cotangente);
	}
	
	public static void main(String[] args) {
		
		Criticante2 crt = new Criticante2();

		if(crt.validaArgumentos(args)){
			Double num = crt.converteParaDouble(args[0]);
			imprimeFuncoes(num);
		}
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite uma medida em graus do angulo: ");
		String str = ler.nextLine();
		
		while(!str.isEmpty()) {
			if(crt.validaArgumentos(str)){
				Double num = crt.converteParaDouble(str);
				imprimeFuncoes(num);
			}
			System.out.println("Digite uma medida em graus do angulo: ");
			str = ler.nextLine();
		}
		ler.close();
	}
}

