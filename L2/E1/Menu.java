public class Menu {

	public static void inicial() {
		System.out.println("     1.Imprimir lista");
		System.out.println("     2.Sair");
		System.out.printf("Digite sua opcao:");
	}
	public static void secundario() {
		System.out.println("          Escolha seu modo de ordenacao:");
		System.out.println("     1.Alfabetica (A-Z)");
		System.out.println("     2.Alfabetica (Z-A)");
		System.out.println("     3.Menor Peso");
		System.out.println("     4.Maior Peso");
		System.out.println("     5.Menor Altura");
		System.out.println("     6.Maior Altura");
		System.out.println("     7.Menor IMC");
		System.out.println("     8.Maior IMC");
		System.out.println("     9.Genero (H-M)");
		System.out.println("     10.Genero (M-H)");
		System.out.printf("Digite sua opcao:");
	}
	public static void argumentoInvalido(String str) {
		System.out.printf("\nO argumento passado \"" +
				str + "\" nao eh uma opcao valida\n\n");
	}
}

