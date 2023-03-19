package Unidades;

import javax.swing.JOptionPane;

public class Conversor extends funcional {
	
	static int msj=0;
	public static void main(String[] args) {
		
		funcional fun = new funcional ();
		
		
		
		do {
			
		fun.ingreseConversion();
		
		
		if (opcion.equals("Conversion de temperatura")){
			fun.ingreseUnidades();
			if (padre.tres.equals("Celcius a Farenheit")) {
				fun.CelFar();				
			}
			else if (padre.tres.equals("Farenheit a Celcius")) { 
				fun.FarCel();
			}
			else if (padre.tres.equals("Celcius a Kelvin")) {
				fun.CelKel();
			}
			else if (padre.tres.equals("Kelvin a Celcius")) {
				fun.KelCel();
			}
		}
		else if (padre.opcion.equals("Conversion de moneda")) {
			fun.ingreseUnidades();
			if (padre.dos.equals("Dolar a Peso Argentino")) {
					fun.DollAr();
			}
			else if (padre.dos.equals("Dolar a Peso Colombiano")) {
					fun.DollCol();
			}
			else if (padre.dos.equals("Dolar a Euro")) {
					fun.DollEur();
			}
			else if (padre.dos.equals("Peso Argentino a Dolar")) {
					fun.ArDoll();
			}
			else if (padre.dos.equals("Peso Colombiano a Dolar")) {
					fun.ColDoll();
			}
			else if (padre.dos.equals("Euro a Dolar")) {
					fun.EurDoll();
			}
		}		
		else if (opcion.equals("Conversion de longitud")) {
			fun.ingreseUnidades();
			if (padre.cuatro.equals("Metros a Centimetros")) {
				fun.MetCen();
			}
			else if (cuatro.equals("Centimetros a Metros")) {
				fun.CenMet();
			}
			else if (cuatro.equals("Metros a Milimimetros")) {
				fun.MetMil();
			}
			else if (cuatro.equals("Milimetros a Metros")) {
				fun.MilMet();
			}
			
		}
			
		int msj = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		if (msj==JOptionPane.YES_OPTION) {
						
		}else if (msj==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Finalizo el programa");
			break;
		}else if (msj==JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Finalizo el programa");
			break;
			}	
			
			
		}while (msj == 0);
		
		
	}
		
}
