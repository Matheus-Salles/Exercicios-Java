public class Criticante5 {

	public boolean testaConversaoInt(String str){

		boolean control = true;
		
		try{								
			Integer.parseInt(str);
		}catch(NumberFormatException ex){
			System.out.println("o argumento \"" + str + "\" "
					+ "nao eh um numero inteiro valido");
			System.out.println();
			control = false;
		}
		return control;		
	}
	public boolean testaConversaoDouble(String str){

		boolean control = true;
		
		try{								
			Double.parseDouble(str);
		}catch(NumberFormatException ex){
			System.out.println("o argumento \"" + str + "\" "
					+ "nao eh um numero double valido");
			System.out.println();
			control = false;
		}
		return control;		
	}
	public double converteParaDouble(String str) {
		return Double.parseDouble(str);
	}
	public int converteParaInt(String str) {
		return Integer.parseInt(str);
	}
}

