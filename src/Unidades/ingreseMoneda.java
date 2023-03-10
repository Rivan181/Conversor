package Unidades;




import javax.swing.JOptionPane;



public class ingreseMoneda {
	
	static String unidades;
	static double unit;
	static int msj;
	static String opcion;

	
	public static void main(String[] args) {
		//do {
	
	
		String [] conversion={"Conversion de moneda", "Conversion de temperatura", "Conversion de longitud"};
		String [] moneda={"Dolar a Peso Argentino", "Dolar a Peso Colombiano","Dolar a Euro", "Peso Argentino a Dolar", "Peso Colombiano a Dolar", "Euro a Dolar"};
		String [] temperatura={"Celcius a Farenheit", "Farenheit a Celcius", "Celcius a Kelvin", "Kelvin a Celcius"};
		String [] longitud={"Metros a Centimetros", "Centimetros a Metros", "Metros a Milimimetros", "Milimetros a Metros"};
		
	
	
		
		 opcion = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Menu", JOptionPane.PLAIN_MESSAGE, null, conversion, null).toString();
		
		JOptionPane.showMessageDialog(null, "Seleccionó "+ opcion);
		
		
//CONVERSION DE MONEDA
		
		if (opcion.equals("Conversion de moneda")) {
				
			
			String dos = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Moneda", JOptionPane.PLAIN_MESSAGE, null, moneda, null).toString();
			
			JOptionPane.showMessageDialog(null, "Seleccionó "+dos);
			
			if (dos.equals("Dolar a Peso Argentino")) {					
					
				unidades = JOptionPane.showInputDialog("introduzca el valor");		
				
				while (!unidades.matches("^[0-9]+([\\.,][0-9]+)?+$")) {
					JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
					unidades = JOptionPane.showInputDialog("introduzca el valor");
				}
				 unit = Double.parseDouble(unidades);
					JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * Conversion.dollarpesoArg) +" Dolares");
				
				
				}
			else if (dos.equals("Dolar a Peso Colombiano")) {
				unidades = JOptionPane.showInputDialog("introduzca el valor");		
				
				while (!unidades.matches("^[0-9]+([\\.,][0-9]+)?+$")) {
					JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
					unidades = JOptionPane.showInputDialog("introduzca el valor");					
				}
				unit = Double.parseDouble(unidades);
				JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * Conversion.dollarApesoColom) +" Dolares");
				
			}else if (dos.equals("Dolar a Euro")) {
					unidades = JOptionPane.showInputDialog("introduzca el valor");		
				
				while (!unidades.matches("^[0-9]+([\\.,][0-9]+)?+$")) {
					JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
					unidades = JOptionPane.showInputDialog("introduzca el valor");
				}
					unit = Double.parseDouble(unidades);
					JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * Conversion.dollarAeuro)+ " Dolares");
			
			}
			//CONVERSION INVERSA
			
			if (dos.equals("Peso Argentino a Dolar")) {
				unidades = JOptionPane.showInputDialog("introduzca el valor");
				while (!unidades.matches("^[0-9]+([\\.,][0-9]+)?+$")) {
					JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
					unidades = JOptionPane.showInputDialog("introduzca el valor");					
					}
				unit = Double.parseDouble(unidades);
				JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * Conversion.pesoArgdolLar)+" Pesos Argentinos");
				
				}else if (dos.equals("Peso Colombiano a Dolar")) {
					unidades = JOptionPane.showInputDialog("introduzca el valor");
					while (!unidades.matches("^[0-9]+([\\.,][0-9]+)?+$")) {
						JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
						unidades = JOptionPane.showInputDialog("introduzca el valor");					
						}
					unit = Double.parseDouble(unidades);
					JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * Conversion.ApesoColomdollar)+" Pesos Colombianos");
			
				}else if (dos.equals("Euro a Dolar")) {
					unidades = JOptionPane.showInputDialog("introduzca el valor");
					while (!unidades.matches("^[0-9]+([\\.,][0-9]+)?+$")) {
						JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
						unidades = JOptionPane.showInputDialog("introduzca el valor");					
						}
					unit = Double.parseDouble(unidades);
						JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * Conversion.Aeurodollar) + " Euros");
				}
		
		
//CONVERSION TEMPERATURA
	
			//String [] temperatura={"Celcius a Farenheit", "Farenheit a Celcius", "Celcius a Kelvin", "Kelvin a Celcius"};
			
				else if  (opcion.equals("Conversion de temperatura")) {
			
				String tres = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, temperatura, null).toString();
			
				JOptionPane.showMessageDialog(null, "Seleccionó "+ tres);
				if (tres.equals("Celcius a Farenheit")) {
					unidades = JOptionPane.showInputDialog("introduzca el valor");
					while (!unidades.matches("^[0-9]+([\\.,][0-9]+)?+$")) {
						JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
						unidades = JOptionPane.showInputDialog("introduzca el valor");					
						}
					unit = Double.parseDouble(unidades);
					JOptionPane.showMessageDialog(null, "Son "+ ((unit * (9/5)+(32)))+" grados Farenhait");
					
				}else if (tres.equals("Farenheit a Celcius")) {
					unidades = JOptionPane.showInputDialog("introduzca el valor");
					while (!unidades.matches("^[0-9]+([\\.,][0-9]+)?+$")) {
						JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
						unidades = JOptionPane.showInputDialog("introduzca el valor");					
						}		
					unit = Double.parseDouble(unidades);
					JOptionPane.showMessageDialog(null, "Son "+ ((unit -(32))*(5/9))+" grados Farenhait");
					
				}else if (tres.equals("Celcius a Kelvin")) {
					unidades = JOptionPane.showInputDialog("introduzca el valor");
					while (!unidades.matches("^[0-9]+([\\.,][0-9]+)?+$")) {
						JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
						unidades = JOptionPane.showInputDialog("introduzca el valor");					
						}	
					unit = Double.parseDouble(unidades);
					JOptionPane.showMessageDialog(null, "Son "+ (unit + Conversion.celAkelvin)+" grados Kelvin");

				}else if (tres.equals("Kelvin a Celcius")) {
					unidades = JOptionPane.showInputDialog("introduzca el valor");
					while (!unidades.matches("^[0-9]+([\\.,][0-9]+)?+$")) {
						JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
						unidades = JOptionPane.showInputDialog("introduzca el valor");					
						}
					unit = Double.parseDouble(unidades);
					JOptionPane.showMessageDialog(null, "Son "+ (unit + Conversion.kelvinAcel)+" grados Celcius");
				}
		
				
		
				}
		
//CONVERSION DE LONGITUD		
		
		//String [] longitud={"Metros a Centimetros", "Centimetros a Metros", "Metros a Milimimetros", "Milimetros a Metros"};
		
		else if (opcion.equals("Conversion de longitud")) {
			
			String cuatro = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Longitud", JOptionPane.PLAIN_MESSAGE, null, longitud, null).toString();
			
			JOptionPane.showMessageDialog(null, "Seleccionó "+ cuatro);		
		
			
				if(cuatro.equals("Metros a Centimetros")) {
					unidades = JOptionPane.showInputDialog("introduzca el valor");
					while (!unidades.matches("^[0-9]+([\\.,][0-9]+)?+$")) {
						JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
						unidades = JOptionPane.showInputDialog("introduzca el valor");					
						}	
					unit = Double.parseDouble(unidades);
					JOptionPane.showMessageDialog(null, "Son "+ (unit *Conversion.metrosAcentimetros)+" centimetros");					
					
				}else if(cuatro.equals("Centimetros a Metros")) {
					unidades = JOptionPane.showInputDialog("introduzca el valor");
					while (!unidades.matches("^[0-9]+([\\.,][0-9]+)?+$")) {
						JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
						unidades = JOptionPane.showInputDialog("introduzca el valor");					
						}	
					unit = Double.parseDouble(unidades);
					JOptionPane.showMessageDialog(null, "Son "+ (unit /Conversion.centimetrosAmetros)+" metros");
					
				}else if(cuatro.equals("Metros a Milimimetros")) {
					unidades = JOptionPane.showInputDialog("introduzca el valor");
					while (!unidades.matches("^[0-9]+([\\.,][0-9]+)?+$")) {
						JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
						unidades = JOptionPane.showInputDialog("introduzca el valor");						
						}		
					unit = Double.parseDouble(unidades);
					JOptionPane.showMessageDialog(null, "Son "+ (unit /Conversion.metrosAmilimetros)+" milimetros");
				}else if(cuatro.equals("Milimetros a Metros")) {
					unidades = JOptionPane.showInputDialog("introduzca el valor");
					while (!unidades.matches("^[0-9]+([\\.,][0-9]+)?+$")) {
						JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
						unidades = JOptionPane.showInputDialog("introduzca el valor");					
						}
					unit = Double.parseDouble(unidades);
					JOptionPane.showMessageDialog(null, "Son "+ (unit /Conversion.milimetrosAmetros)+" metros");
				}
				
		}
		}
		
				int msj = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
				
		
				if (msj==JOptionPane.YES_OPTION) {
				 opcion = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Menu", JOptionPane.PLAIN_MESSAGE, null, conversion, null).toString();
					
				}
				else if (msj==JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, "Finalizo el programa");
						
				}else if (msj==JOptionPane.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(null, "Finalizo el programa");
				}
		//}while (msj==0);
	}
	
	
			
}
	

		
		
		
		
		
		