import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Criticante3 crt = new Criticante3();
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o numero de angulos:");
		
		String str = ler.nextLine();
		
		if(crt.testaConversaoInt(str)) {
			ArrayList<AnguloObj> lista = new ArrayList<AnguloObj>();
			int num = crt.converteParaInt(str);
			
			for(int i = 1; i<= num; i++) {
				System.out.printf("Digite o valor em graus do angulo %d:\n", i);
				str = ler.nextLine();
				if(crt.testaConversaoDouble(str)) {
					AnguloObj anguloObj = new AnguloObj(crt.converteParaDouble(str));
					lista.add(anguloObj);
				}
			}
			System.out.println();
			System.out.println("Resultado================");
			for (AnguloObj anguloObj : lista) {
				System.out.println(anguloObj);
			}
		}
		ler.close();
	}
}
