package Unidades;

public class funcional extends Conversion {
	
	public static void main(String[] args) {
		Conversion con = new Conversion();
		
		con.ingreseConversion();
		
		if (Conversion.opcion.equals("Conversion de temperatura")){			
			ingreseUnidades();
			if (Conversion.tres.equals("Celcius a Farenheit")) {
				CelFar();
				
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
