
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MinhaListaOrdenavel {

	private ArrayList<PessoaIMC> lista = new ArrayList<PessoaIMC>();

	private final int  ALFABETICA = 1;
	private final int  ALFABETICA_REVERSO = 2;
	private final int  PESO = 3;
	private final int  PESO_REVERSO= 4;
	private final int  ALTURA = 5;
	private final int  ALTURA_REVERSO = 6;
	private final int  IMC = 7;
	private final int  IMC_REVERSO = 8;
	private final int  HOMEM_MULHER = 9;
	private final int  MULHER_HOMEM = 10;


	public void add(PessoaIMC p) {
		lista.add(p);
	}

	public PessoaIMC get(int index) {
		return this.lista.get(index);
	}

	private Comparator<PessoaIMC> pesoC = new Comparator<PessoaIMC> () {
		@Override
		public int compare (PessoaIMC p1, PessoaIMC p2){
			return (int) Double.compare(p1.getPeso(), p2.getPeso()); 
		}
	};

	private Comparator<PessoaIMC> alturaC = new Comparator<PessoaIMC> () {
		@Override
		public int compare (PessoaIMC p1, PessoaIMC p2){
			return (int) Double.compare(p1.getAltura(), p2.getAltura()); 
		}
	};

	private Comparator<PessoaIMC> imcC = new Comparator<PessoaIMC> () {
		@Override
		public int compare (PessoaIMC p1, PessoaIMC p2){
			return (int) Double.compare(p1.getIMC(), p2.getIMC()); 
		}
	};

	private Comparator<PessoaIMC> nomeC = new Comparator<PessoaIMC> () {
		@Override
		public int compare (PessoaIMC p1, PessoaIMC p2){
			return p1.getNome().compareTo(p2.getNome());
		}
	};

	public ArrayList<PessoaIMC> ordena(int criterio) {
		switch (criterio) {

		case ALFABETICA:
			Collections.sort(this.lista, nomeC);
			return this.lista;

		case ALFABETICA_REVERSO:
			Collections.sort(this.lista, nomeC);
			Collections.reverse(this.lista);
			return this.lista;

		case PESO:
			Collections.sort(this.lista, pesoC);
			return this.lista;

		case PESO_REVERSO:
			Collections.sort(this.lista, pesoC);
			Collections.reverse(this.lista);
			return this.lista;

		case ALTURA:
			Collections.sort(this.lista, alturaC);
			return this.lista;

		case ALTURA_REVERSO:
			Collections.sort(this.lista, alturaC);
			Collections.reverse(this.lista);
			return this.lista;

		case IMC:
			Collections.sort(this.lista, imcC);
			return this.lista;

		case IMC_REVERSO:
			Collections.sort(this.lista, imcC);
			Collections.reverse(this.lista);
			return this.lista;

		case HOMEM_MULHER:
			int aux=0;
			for (int i=0; i < lista.size(); i++) {
				try {
					Homem m =(Homem) lista.get(i);
					if(aux == i) {
						aux++;
						i = aux;
					}else {
						Collections.swap(lista, aux, i);
						aux++;
						i = aux;
					}
				}catch (ClassCastException ex) {

				}
			}
			return this.lista;

		case MULHER_HOMEM:
			int aux2=0;
			for (int i=0; i < lista.size(); i++) {
				try {
					Mulher m =(Mulher) lista.get(i);
					if(aux2 == i) {
						aux2++;
						i = aux2;
					}else {
						Collections.swap(lista, aux2, i);
						aux2++;
						i = aux2;
					}
				} catch (ClassCastException ex) {

				}
			}
		default:
			System.out.println("Opcao invalida!");
			return this.lista;
		}
	}
}

