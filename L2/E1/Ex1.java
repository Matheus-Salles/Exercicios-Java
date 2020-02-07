import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Critica1 crt = new Critica1();
		MinhaListaOrdenavel lista = new MinhaListaOrdenavel();

		Mulher m1 = new Mulher("Vitoria Barbosa", "08/02/1998", 61.5, 1.70);
		Mulher m2 = new Mulher("Amanda Vieira", "25/12/2000", 51, 1.79);
		Mulher m3 = new Mulher("Jennifer Monteiro", "15/04/1992", 70.5, 1.65);
		Mulher m4 = new Mulher("Luisa", "19/03/2006", 40, 1.55);
		Homem h1 = new Homem("Felipe Brandino", "08/08/2005", 106.8, 2.10);
		Homem h2 = new Homem("Jean Santiago", "28/09/1990", 56.6, 1.66);
		Homem h3 = new Homem("Fernando", "01/02/1999", 89.9, 1.93);
		Homem h4 = new Homem("Vitor Gabriel", "08/02/1998", 65, 1.75);
		Homem h5 = new Homem("Leo Vicare", "07/06/2001", 60.4, 1.78);
		Homem h6 = new Homem("Nicolas Cesar", "06/06/2006", 50.9, 1.84);

		lista.add(m2);
		lista.add(h1);
		lista.add(h5);
		lista.add(m4);
		lista.add(h2);
		lista.add(h3);
		lista.add(h6);
		lista.add(m1);
		lista.add(h4);
		lista.add(m3);
		
		Scanner ler = new Scanner(System.in);
		Menu.inicial();
		String str = ler.nextLine();

		while(!str.equals("2")) {
			if(str.equals("1")) {
				Menu.secundario();
				str = ler.nextLine();
				if(crt.testaConversaoInt(str)) {
					int num = crt.converteParaInt(str);
					if((num>=1) && (num<=10)) {
						System.out.println(lista.ordena(num));
					} else {
						Menu.argumentoInvalido(str);}
				}else {
					Menu.argumentoInvalido(str);}
			}else {
				Menu.argumentoInvalido(str);}

			Menu.inicial();
			str = ler.nextLine();
		}
		ler.close();
	}
}
