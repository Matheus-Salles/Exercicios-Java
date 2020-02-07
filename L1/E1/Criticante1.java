public class Criticante1{


	private boolean numeroArgumentos(String[] str){

		if(str.length < 1){
			System.out.println("Numero de argumentos insuficientes");
			return false;
		}
		if(str.length > 3){
			System.out.println("Numero de excessivo de argumentos");
			return false;
		}
		return true;
	}	
	
	private boolean converteFloat(String[] str){

		boolean control = true;
		
		for(int i = 0; i < str.length; i++){
			try{								
				Float.parseFloat(str[i]);
			}catch(NumberFormatException ex){
				System.out.println(i+1 + "o argumento, \"" + str[i] + "\" nao eh um numero");
				control = false;
			}
		}
		return control;		
	}

	private boolean classificaTriangulo(String[] str){

		float l1 = Float.parseFloat(str[0]);
		float l2 = Float.parseFloat(str[1]);
		float l3 = Float.parseFloat(str[2]);
		
		if (!((l1<l2+l3) && (l2<l1+l3) && (l3<l1+l2))){
			System.out.println("Os lados passados nao formam um triangulo");
			return false;
		}else{
        	if(l1==l2 && l1==l3){
          		System.out.println("Triangulo Equilatero");
        	}else if((l1==l2) || (l1==l3) || (l2==l3)){
          		System.out.println("Triangulo Isosceles");
        	}else{
            	System.out.println("Triangulo Escaleno.");
       		}
			return true;
   		 }
	}

	public boolean validaArgumentos(String[] str){
		
		if(!this.numeroArgumentos(str)){
			return false;
		}
		else if(!this.converteFloat(str)){
			return false;
		}
		else if(str.length == 3){
			return this.classificaTriangulo(str);
    	} 
		return true;
	}	
}
