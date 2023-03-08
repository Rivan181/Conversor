package Unidades;



import java.util.Scanner;

import javax.swing.JOptionPane;

public class ingreseMoneda {
	
	static double unidades = 0;
	
	
	

	
	public static void main(String[] args) {
	
	
		
		String [] conversion={"Conversion de moneda", "Conversion de temperatura", "Conversion de longitud"};
		String [] moneda={"Dolar a Peso Argentino", "Dolar a Peso Colombiano","Dolar a Euro", "Peso Argentino a Dolar", "Peso Colombiano a Dolar", "Euro a Dolar"};
		String [] temperatura={"Celcius a Farenheit", "Farenheit a Celcius", "Celcius a Kelvin", "Kelvin a Celcius"};
		String [] longitud={"Metros a Centimetros", "Centimetros a Metros", "Metros a Milimimetros", "Milimetros a Metros"};
		
		Scanner s = new Scanner(System.in);
		
		
		String opcion = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Menu", JOptionPane.PLAIN_MESSAGE, null, conversion, null).toString();
		JOptionPane.showMessageDialog(null, "Seleccionó "+ opcion);
		
		
//CONVERSION DE MONEDA
		
		if (opcion.equals("Conversion de moneda")) {
				
			
			String dos = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Moneda", JOptionPane.PLAIN_MESSAGE, null, moneda, null).toString();
			
			JOptionPane.showMessageDialog(null, "Seleccionó "+dos);
			
			if (dos.equals("Dolar a Peso Argentino")) {	
				//try {
					
				unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
				String unidades = s.nextLine();
				while (!unidades.matches("[0-9]*")) {
					while (!unidades.matches("[0-9]*")) {
						JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
						unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));
						

					}
				
				
				}
				//} catch (NumberFormatException ex) {					
						//JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
					
					
							
				JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unidades * Conversion.dollarpesoArg) +" Dolares");
					}
			else if (dos.equals("Dolar a Peso Colombiano")) {
				try {
				unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
				} catch (NumberFormatException ex) {					
					JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");					
				}
				JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unidades * Conversion.dollarApesoColom) +" Dolares");
				
			}else if (dos.equals("Dolar a Euro")) {
				try {
					unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
					} catch (NumberFormatException ex) {					
						JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");					
					}
					JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unidades * Conversion.dollarAeuro)+ " Dolares");
			}
			
			//CONVERSION INVERSA
			
			if (dos.equals("Peso Argentino a Dolar")) {
				try {
					unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
					} catch (NumberFormatException ex) {					
						JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");					
					}
				JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unidades * Conversion.pesoArgdolLar)+" Pesos Argentinos");
				
				}else if (dos.equals("Peso Colombiano a Dolar")) {
					try {
						unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
						} catch (NumberFormatException ex) {					
							JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");					
						}
					JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unidades * Conversion.ApesoColomdollar)+" Pesos Colombianos");
					
				}else if (dos.equals("Euro a Dolar")) {
					try {
						unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
						} catch (NumberFormatException ex) {					
							JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");					
						}
						JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unidades * Conversion.Aeurodollar) + " Euros");
				}
		}
			
//CONVERSION TEMPERATURA
			
			//String [] temperatura={"Celcius a Farenheit", "Farenheit a Celcius", "Celcius a Kelvin", "Kelvin a Celcius"};
			
		else if  (opcion.equals("Conversion de temperatura")) {
			
				String tres = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, temperatura, null).toString();
			
				JOptionPane.showMessageDialog(null, "Seleccionó "+ tres);
				if (tres.equals("Celcius a Farenheit")) {
					try {
						unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
						} catch (NumberFormatException ex) {					
							JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");					
						}
					JOptionPane.showMessageDialog(null, "Son "+ ((unidades * (9/5)+(32)))+" grados Farenhait");
					
				}else if (tres.equals("Farenheit a Celcius")) {
					try {
						unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
						} catch (NumberFormatException ex) {					
							JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");					
						}							
					JOptionPane.showMessageDialog(null, "Son "+ ((unidades -(32))*(5/9))+" grados Farenhait");
					
				}else if (tres.equals("Celcius a Kelvin")) {
					try {
						unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
						} catch (NumberFormatException ex) {					
							JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");					
						}							
					JOptionPane.showMessageDialog(null, "Son "+ (unidades + Conversion.celAkelvin)+" grados Kelvin");

				}else if (tres.equals("Kelvin a Celcius")) {
					try {
						unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
						} catch (NumberFormatException ex) {					
							JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");					
						}							
					JOptionPane.showMessageDialog(null, "Son "+ (unidades + Conversion.kelvinAcel)+" grados Celcius");
				}
		
			
		
		}		
		
//CONVERSION DE LONGITUD		
		
		//String [] longitud={"Metros a Centimetros", "Centimetros a Metros", "Metros a Milimimetros", "Milimetros a Metros"};
		
		else if (opcion.equals("Conversion de longitud")) {
			
			String cuatro = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Longitud", JOptionPane.PLAIN_MESSAGE, null, longitud, null).toString();
			
			JOptionPane.showMessageDialog(null, "Seleccionó "+ cuatro);		
		
			
				if(cuatro.equals("Metros a Centimetros")) {
					try {
						unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
						} catch (NumberFormatException ex) {					
							JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");					
						}							
					JOptionPane.showMessageDialog(null, "Son "+ (unidades *Conversion.metrosAcentimetros)+" centimetros");					
					
				}else if(cuatro.equals("Centimetros a Metros")) {
					try {
						unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
						} catch (NumberFormatException ex) {					
							JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");					
						}							
					JOptionPane.showMessageDialog(null, "Son "+ (unidades /Conversion.centimetrosAmetros)+" metros");
					
				}else if(cuatro.equals("Metros a Milimimetros")) {
					try {
						unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
						} catch (NumberFormatException ex) {					
							JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");					
						}							
					JOptionPane.showMessageDialog(null, "Son "+ (unidades /Conversion.metrosAmilimetros)+" milimetros");
				}else if(cuatro.equals("Milimetros a Metros")) {
					try {
						unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));		
						} catch (NumberFormatException ex) {					
							JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");					
						}							
					JOptionPane.showMessageDialog(null, "Son "+ (unidades /Conversion.milimetrosAmetros)+" metros");
				}
		
		
		}
		JOptionPane.showMessageDialog(null, "Finalizo el programa");
	}
		
}
	

		
		
		
		
		
		