package Unidades;

import javax.swing.JOptionPane;

public class conversionMoneda extends padre {
	
	
	public static void ingreseUnidades() {
		dos = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Moneda", JOptionPane.PLAIN_MESSAGE, null, moneda, null).toString();
	}

	

		public static void DollAr() {
			ingreseValor();
			unit = Double.parseDouble(unidades);
			JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * padre.dollarpesoArg) +" Dolares");
		}
		
		public static void DollCol() {
			ingreseValor();
			unit = Double.parseDouble(unidades);
			JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * padre.dollarApesoColom) +" Dolares");
		}
		
		public static void DollEur() {
			ingreseValor();
			unit = Double.parseDouble(unidades);
			JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * padre.dollarAeuro) +" Dolares");
		}

		
		public static void ArDoll() {
			ingreseValor();
			unit = Double.parseDouble(unidades);
			JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * padre.pesoArgdolLar) +" Dolares");
		}
		
		public static void ColDoll() {
			ingreseValor();
			unit = Double.parseDouble(unidades);
			JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * padre.ApesoColomdollar) +" Dolares");
		}
		
		public static void EurDoll() {
			ingreseValor();
			unit = Double.parseDouble(unidades);
			JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * padre.Aeurodollar) +" Dolares");
		}
		
			

}
