public class Criticante2 {

	private boolean numeroInvalidoArgumentos(String[] str){
		
		if(str.length < 1){
			System.out.println("Numero de argumentos insuficientes");
			System.out.println();
			return false;
		}
		if(str.length > 1){
			System.out.println("Numero de excessivo de argumentos");
			System.out.println();
			return false;
		}
		return true;
	}	

	private boolean testaConversao(String str){

		boolean control = true;
		
		try{								
			Double.parseDouble(str);
		}catch(NumberFormatException ex){
			System.out.println("o argumento \"" + str + "\" nao eh um numero valido");
			System.out.println();
			control = false;
		}
		return control;		
	}

	public boolean validaArgumentos(String[] str){

		if(!this.numeroInvalidoArgumentos(str)){
			return false;
		}
		else if(!this.testaConversao(str[0])){
			return false;
		}
		return true;
	}	

	public boolean validaArgumentos(String str) {

		if(!this.testaConversao(str)){
			return false;
		}
		return true;
	}
	
	public double converteParaDouble(String str) {
		return Double.parseDouble(str);
	}


}

