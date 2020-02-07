import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {

	static ArrayList<FuncionarioContratado> lista = new ArrayList<FuncionarioContratado>();
	static Ex4 ex4;
	static Scanner ler = new Scanner(System.in);

	public Ex4(int args) {

		for(int i = 1; i <= args; i++) {
			Ex4.calculaSalario();
		}
	}
	private static void calculaSalario() {

		Criticante4 crt = new Criticante4();

		System.out.printf("\n--- Cadastro de Funcionarios");
		System.out.printf("\nDigite o nome:");
		String nome = ler.nextLine();
		System.out.printf("Digite o codigo:");
		String codigo = ler.nextLine();
		System.out.printf("Digite o salario:");
		String salario = ler.nextLine();
		System.out.printf("Digite o numero de dependentes:");
		String dependentes = ler.nextLine();

		if(crt.testaConversaoDouble(salario) && crt.testaConversaoInt(dependentes)) {

			float sal = (float) crt.converteParaDouble(salario);
			int dep = crt.converteParaInt(dependentes);

			FuncionarioContratado fc = new FuncionarioContratado(nome, codigo, sal, dep);
			lista.add(fc);
		}
	}

	public static void main(String[] args) {

		Criticante4 crt = new Criticante4();

		System.out.printf("Digite o numero de Funcionarios Contratados:");
		String str = ler.nextLine();

		if(crt.testaConversaoInt(str)) {
			int num = crt.converteParaInt(str);
			ex4 = new Ex4(num);

			System.out.printf("\n\n --- Folha Salarial ---\n");
			for (FuncionarioContratado fc : lista) {
				System.out.println(fc);
			}
		}
		ler.close();
	}
}

