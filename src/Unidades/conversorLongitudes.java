package Unidades;

import javax.swing.JOptionPane;

public class conversorLongitudes extends padre {
	

		public static void ingreseUnidades() {
			cuatro = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Longitud", JOptionPane.PLAIN_MESSAGE, null, longitud, null).toString();
		}
		
		public static void MetCen() {
			ingreseValor();
			unit = Double.parseDouble(unidades);
			JOptionPane.showMessageDialog(null,  "Son "+ (unit * padre.metrosAcentimetros) +" metros");
		}
		
		public static void CenMet() {
			ingreseValor();
			unit = Double.parseDouble(unidades);
			JOptionPane.showMessageDialog(null,  "Son "+ (unit /padre.centimetrosAmetros)+" centimetros");
		}
		
		public static void MetMil() {
			ingreseValor();
			unit = Double.parseDouble(unidades);
			JOptionPane.showMessageDialog(null,  "Son "+ (unit *padre.metrosAmilimetros)+" milimetros");
		}
		
		public static void MilMet() {
			ingreseValor();
			unit = Double.parseDouble(unidades);
			JOptionPane.showMessageDialog(null,  "Son "+ (unit /padre.milimetrosAmetros)+" metros");
		}
		
}



