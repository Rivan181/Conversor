package Unidades;

import javax.swing.JOptionPane;

public class conversorLongitudes {
	
	static String unidades;
	static double unit;
	static int msj;
	static String opcion;
	
	public static void main(String[] args) {
		
		
		String [] longitud={"Metros a Centimetros", "Centimetros a Metros", "Metros a Milimimetros", "Milimetros a Metros"};
		
		
		
				
				//if (opcion.equals("Conversion de longitud")) {
					
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


