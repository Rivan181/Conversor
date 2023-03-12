package Unidades;

import javax.swing.JOptionPane;

public class conversionTemperatura {
	
	static String unidades;
	static double unit;
	static int msj;
	static String opcion;

	public static void main(String[] args) {
		
		
		
		
		String [] temperatura={"Celcius a Farenheit", "Farenheit a Celcius", "Celcius a Kelvin", "Kelvin a Celcius"};
		
		//if (opcion.equals("Conversion de moneda")) {
			
			
			
						
							// if (opcion.equals("Conversion de temperatura")) {
							
							
							String tres = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Moneda", JOptionPane.PLAIN_MESSAGE, null, temperatura, null).toString();
							
							JOptionPane.showMessageDialog(null, "Seleccionó "+tres);
						
							
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
							
					
							

	}

