package Unidades;

import javax.swing.JOptionPane;

public class conversionMoneda {
	
	static String unidades;
	static double unit;
	static int msj;
	static String opcion;
	
	public static void main(String[] args) {
		
		
		String [] moneda={"Dolar a Peso Argentino", "Dolar a Peso Colombiano","Dolar a Euro", "Peso Argentino a Dolar", "Peso Colombiano a Dolar", "Euro a Dolar"};
		
		
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
		
		
	}

}
