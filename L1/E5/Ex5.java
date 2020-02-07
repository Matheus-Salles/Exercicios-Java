import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Criticante5 crt = new Criticante5();
		ArrayList lista = new ArrayList();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o numero de pessoas:");
		String str = ler.nextLine();
		
		while(!crt.testaConversaoInt(str)) {
			System.out.println("Digite o numero de pessoas:");
			str = ler.nextLine();
		}
		
		int num = crt.converteParaInt(str);
		
		for(int i = 1; i <= num; i++) {
			System.out.println("Inserir homem (h) ou mulher(m)?");
			str = ler.nextLine();
		
			while(!(str != "h") || !(str != "m")) {
				System.out.println("--- Opcao Invalida!!!");
				System.out.println("Inserir homem (h) ou mulher(m)?");
				str = ler.nextLine();
			}
			if(str == "h") {
				String nome, dataNascimento;
				double peso, altura;
				
				System.out.println("Digite o nome:");
				nome = ler.nextLine();
				
				System.out.println("Data de Nascimento:");
				dataNascimento = ler.nextLine();
				
				System.out.println("Peso:");
				str = ler.nextLine();
				while(!crt.testaConversaoDouble(str)){
					System.out.println("--- O peso deve ser um numero real!!!");
					str = ler.nextLine();
				}peso = crt.converteParaDouble(str);
				
				System.out.println("Altura:");
				str = ler.nextLine();
				while(!crt.testaConversaoDouble(str)){
					System.out.println("--- A altura deve ser um numero real!!!");
					str = ler.nextLine();
				}altura = crt.converteParaDouble(str);
				
				Homem homem = new Homem(nome, dataNascimento, peso, altura);
				lista.add(homem);
			}
			else {
				String nome, dataNascimento;
				double peso, altura;
				
				System.out.println("Digite o nome:");
				nome = ler.nextLine();
				
				System.out.println("Data de Nascimento:");
				dataNascimento = ler.nextLine();
				
				System.out.println("Peso:");
				str = ler.nextLine();
				while(!crt.testaConversaoDouble(str)){
					System.out.println("--- O peso deve ser um numero real!!!");
					str = ler.nextLine();
				}peso = crt.converteParaDouble(str);
				
				System.out.println("Altura:");
				str = ler.nextLine();
				while(!crt.testaConversaoDouble(str)){
					System.out.println("--- A altura deve ser um numero real!!!");
					str = ler.nextLine();
				}altura = crt.converteParaDouble(str);
				
				Mulher mulher = new Mulher(nome, dataNascimento, peso, altura);
				lista.add(mulher);
			}
		}
		ler.close();
		
		for (Object pessoa : lista) {
			System.out.println(pessoa);
		}

	}

}
