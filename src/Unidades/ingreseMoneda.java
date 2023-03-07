package Unidades;



import javax.swing.JOptionPane;

public class ingreseMoneda {
	
	static double unidades;
	public static void main(String[] args) {
	
	
		
		String [] conversion={"Conversion de moneda", "Conversion de temperatura", "Conversion de longitud"};
		String [] moneda={"Dollar a Peso Argentino", "Dollar a Peso Colombiano","Dollar a Euro", "Peso Argentino a Dollar", "Peso Colombiano a Dollar", "Euro a Dollar"};
		String [] temperatura={"Celcius", "Farenheit", "Kelvin"};
		String [] longitud={"Metros", "Centimetros", "Milimimetros"};
		
		
		
		String opcion = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Menu", JOptionPane.PLAIN_MESSAGE, null, conversion, null).toString();
		JOptionPane.showMessageDialog(null, "Seleccionó "+ opcion);
		
		
//CONVERSION DE MONEDA
		
		if (opcion.equals("Conversion de moneda")) {
			
			String dos = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Moneda", JOptionPane.PLAIN_MESSAGE, null, moneda, null).toString();
			
			JOptionPane.showMessageDialog(null, "Seleccionó "+dos);
			
			if (dos.equals("Dollar aPeso Argentino")) {
			unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
			
			JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unidades * Conversion.dollarpesoArg) +" Dollares");
			
			}else if (dos.equals("Dollar a Peso Colombiano")) {
				unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
				
				JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unidades * Conversion.dollarApesoColom) +" Dollares");
				
			}else if (dos.equals("Dollar a Euro")) {
					unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
					
					JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unidades * Conversion.dollarAeuro)+ " Dollares");
			}
			
			//CONVERSION INVERSA
			
			if (dos.equals("Peso Argentino a Dollar")) {
				unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
				
				JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unidades * Conversion.pesoArgdolLar)+" Pesos Argentinos");
				
				}else if (dos.equals("Peso Colombiano a Dollar")) {
					unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
					
					JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unidades * Conversion.ApesoColomdollar)+" Pesos Colombianos");
					
				}else if (dos.equals("Euro a Dollar")) {
						unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
						
						JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unidades * Conversion.Aeurodollar) + " Euros");
				}
			
//CONVERSION TEMPERATURA
			
			
			
		}else if  (opcion.equals("Conversion de temperatura")) {
			
			String tres = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, temperatura, null).toString();
			
			JOptionPane.showMessageDialog(null, "Seleccionó "+ tres);
			unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
			
			JOptionPane.showMessageDialog(null, "La cantidad es "+ ((unidades * 9/5)+32)) ;			
		}else if  (opcion.equals("Conversion de temperatura")) {
			
			String tres = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, temperatura, null).toString();
			
			JOptionPane.showMessageDialog(null, "Seleccionó "+ tres);
			unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
			
			JOptionPane.showMessageDialog(null, "La cantidad es "+ ((unidades * 9/5)+32)) ;
		}else if  (opcion.equals("Conversion de temperatura")) {
			
			String tres = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, temperatura, null).toString();
			
			JOptionPane.showMessageDialog(null, "Seleccionó "+ tres);
			unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
			
			JOptionPane.showMessageDialog(null, "La cantidad es "+ ((unidades * 9/5)+32)) ;
		}else if  (opcion.equals("Conversion de temperatura")) {
			
			String tres = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, temperatura, null).toString();
			
			JOptionPane.showMessageDialog(null, "Seleccionó "+ tres);
			unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
			
			JOptionPane.showMessageDialog(null, "La cantidad es "+ ((unidades * 9/5)+32)) ;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		else if (opcion.equals("Conversion de longitud")) {
			
			String cuatro = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Longitud", JOptionPane.PLAIN_MESSAGE, null, longitud, null).toString();
			
			JOptionPane.showMessageDialog(null, "Seleccionó "+ cuatro);		
		
		unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
		
		JOptionPane.showMessageDialog(null, "La cantidad es "+ (unidades * Conversion.dollarpesoArg));
		
		}
		JOptionPane.showMessageDialog(null, "Finalizo el programa");
	
	
		
		
		
		
		
		
		
		
		
		
		//String segundaopcion = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Menu", JOptionPane.PLAIN_MESSAGE, null, opcion, null).toString();
		
		//JOptionPane.showMessageDialog(null, "Seleccionó "+segundaopcion);
		
		
		
		
		//String conversion = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversion de moneda", "Conversion de temperatura", "Conversion de longitud"}, null).toString();
		
		
		//String moneda = JOptionPane.showInputDialog(null, "Seleccione la moneda que quiere convertir ", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Selecciona","Peso Argentino", "Peso Colombiano","Euro"}, null).toString();
		
		
		
		//JOptionPane.showMessageDialog(null, "la seleccion es "+ moneda);
		
	}

}
