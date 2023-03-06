package Unidades;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.text.html.Option;

public class ingreseMoneda {
	
	
	public static void main(String[] args) {
	
		double unidades;
		
		String [] conversion={"Conversion de moneda", "Conversion de temperatura", "Conversion de longitud"};
		String [] moneda={"Selecciona","Peso Argentino", "Peso Colombiano","Euro"};
		String [] temperatura={"Celcius", "Farenheit", "Kelvin"};
		String [] longitud={"Metros", "Centimetros", "Milimimetros"};
		
		
		
		String opcion = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Menu", JOptionPane.PLAIN_MESSAGE, null, conversion, null).toString();
		JOptionPane.showMessageDialog(null, "Seleccionó "+ opcion);
		
		if (opcion.equals("Conversion de moneda")) {
			
			String dos = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Moneda", JOptionPane.PLAIN_MESSAGE, null, moneda, null).toString();
			
			JOptionPane.showMessageDialog(null, "Seleccionó "+dos);
			
		}else if  (opcion.equals("Conversion de temperatura")) {
			
			String tres = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, temperatura, null).toString();
			
			JOptionPane.showMessageDialog(null, "Seleccionó "+ tres);
			
		} else if (opcion.equals("Conversion de longitud")) {
			
			String cuatro = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Longitud", JOptionPane.PLAIN_MESSAGE, null, longitud, null).toString();
			
			JOptionPane.showMessageDialog(null, "Seleccionó "+ cuatro);
		}
		
		unidades = Double.parseDouble(JOptionPane.showInputDialog("introduzca el valor"));
		
		JOptionPane.showMessageDialog(null, "La cantidad es "+ unidades);
		
	
		
		
		
		
		
		
		
		
		
		
		//String segundaopcion = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Menu", JOptionPane.PLAIN_MESSAGE, null, opcion, null).toString();
		
		//JOptionPane.showMessageDialog(null, "Seleccionó "+segundaopcion);
		
		
		
		
		//String conversion = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversion de moneda", "Conversion de temperatura", "Conversion de longitud"}, null).toString();
		
		
		//String moneda = JOptionPane.showInputDialog(null, "Seleccione la moneda que quiere convertir ", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Selecciona","Peso Argentino", "Peso Colombiano","Euro"}, null).toString();
		
		
		
		//JOptionPane.showMessageDialog(null, "la seleccion es "+ moneda);
		
	}

}
