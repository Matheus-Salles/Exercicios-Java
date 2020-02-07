public class Ex1 {
	
	private static float calcula(float r){

		float area = (float) (r * r * Math.PI);
		return area;
	}

	private static float calcula(float a, float b){
		float area = (float) a * b;
		return area;
	}

	private static float calcula(float l1, float l2, float l3){
		float P = (float) (l1 + l2 + l3)/(float)2.0;
		float area = (float) Math.sqrt(P*((P-l1)*(P-l2)*(P-l3)));

		return area;
	}


	public static void main(String[] args){

		Criticante1 crt = new Criticante1();

		if(crt.validaArgumentos(args)){
			int NUMERO_DE_ARGUMENTOS = args.length;

			if(NUMERO_DE_ARGUMENTOS == 1){
				float r = Float.parseFloat(args[0]);
				float area = calcula(r);
				System.out.printf("A area do ciruclo eh: %.2f unidades de area\n", area);
			}
			else if(NUMERO_DE_ARGUMENTOS == 2){
				float a = Float.parseFloat(args[0]);
				float b = Float.parseFloat(args[1]);
				float area = calcula(a, b);
				System.out.printf("A area do retangulo eh: %.2f unidades de area\n", area);
			}
			else{
				float l1 = Float.parseFloat(args[0]);
				float l2 = Float.parseFloat(args[1]);
				float l3 = Float.parseFloat(args[2]);
				float area = calcula(l1, l2, l3);
				System.out.printf("A area do triangulo eh: %.2f unidades de area\n", area);
			}
		}
	}
}
