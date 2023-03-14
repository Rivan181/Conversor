package Unidades;

import javax.swing.JOptionPane;

public class conversionTemperatura extends padre{
	
	public static void ingreseUnidades() {
		tres = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Menu", JOptionPane.PLAIN_MESSAGE, null, temperatura, null).toString();
	}
	
	public static void CelFar() {
		ingreseValor();
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null, "Son "+ ((unit * 9/5)+32)+" grados Farenhait");
	}
	


	public static void FarCel() {
		ingreseValor();	
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null, "Son "+ (((unit-32)*5)/9) +" grados Farenhait");
		}
	
	public static void CelKel() {
		ingreseValor();	
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null, "Son "+ (unit + padre.celAkelvin)+" grados Kelvin");
		}
	
	public static void KelCel() {
		ingreseValor();	
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null, "Son "+ (unit + padre.kelvinAcel)+" grados Celcius");
		}
	
	public static void DollAr() {
		ingreseValor();
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * padre.dollarpesoArg) +" Dolares");
	}
}

