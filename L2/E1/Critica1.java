public class Critica1 {

	public boolean testaConversaoInt(String str){
		boolean control = true;
		
		try{								
			Integer.parseInt(str);
		}catch(NumberFormatException ex){
			System.out.println();
			control = false;
		}
		return control;		
	}
	
	public int converteParaInt(String str) {
		return Integer.parseInt(str);
	}
}
