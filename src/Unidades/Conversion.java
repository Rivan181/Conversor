package Unidades;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class Conversion {
		
		static String unidades;
		static double unit;
		static int msj;
		static String opcion;
		static String dos;
		static String tres;
		static String cuatro;
		
		String [] conversion={"Conversion de moneda", "Conversion de temperatura", "Conversion de longitud"};
		static String [] temperatura={"Celcius a Farenheit", "Farenheit a Celcius", "Celcius a Kelvin", "Kelvin a Celcius"};
	
		//MONEDAS

		static double dollarpesoArg = 198.25;
		static double dollarApesoColom = 4785.10;
		static double dollarAeuro= 0.94;	
		static double pesoArgdolLar = 1/198.25;
		static double ApesoColomdollar = 1/4785.10;
		static double Aeurodollar= 1/0.94;
		
		//TEMPERATURA
		
		static double celAfar = ((9/5) + 32) ;
		static double celAkelvin = (+273);
		static double farAcel= ((-32) *(5/9));	
		static double kelvinAcel = (-273);
		
		//LONGITUD
		
		static double metrosAcentimetros= (100) ;
		static double centimetrosAmetros = (100);
		static double metrosAmilimetros = (1000);	
		static double milimetrosAmetros = (1000);
	
		
		//Metodos
		
		public void ingreseConversion(){			
			 opcion = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Menu", JOptionPane.PLAIN_MESSAGE, null, conversion, null).toString();
			 }
		
		public static void ingreseUnidades() {
			tres = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Menu", JOptionPane.PLAIN_MESSAGE, null, temperatura, null).toString();
		}
		
		
		public static void CelFar() {
			unidades = JOptionPane.showInputDialog("introduzca el valor");
			while (!unidades.matches("^[0-9]+([\\.,][0-9]+)?+$")) {
				JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
				unidades = JOptionPane.showInputDialog("introduzca el valor");					
				}
			unit = Double.parseDouble(unidades);
			JOptionPane.showMessageDialog(null, "Son "+ ((unit * (9/5)+(32)))+" grados Farenhait");
		}
		
		
		
		public static void conversionTemp() {
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
		


