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
			if (padre.dos.equals("Dolar a Peso argentino")) {
				fun.DollAr();
			}
			else if (padre.dos.equals("Peso argentino a Dolar")) {
				fun.ArDoll();
			}
			else if (padre.dos.equals("Libras a peso argentino")) {
				fun.GBParg();
			}
			else if (padre.dos.equals("Peso argentino  libras")) {
				fun.argGBP();
			}
			else if (padre.dos.equals("YEN a peso argentino")) {
				fun.YENarg();
			}
			else if (padre.dos.equals("Peso argentino a YEN")) {
				fun.argYEN();
			}
			else if (padre.dos.equals("Won sul-coreano a peso argentino")) {
				fun.KRWarg();
			}
			else if (padre.dos.equals("Peso argentino a Won sul-coreano")) {
				fun.argKRW();
			}
			else if (padre.dos.equals("Peso argentino a Euro")) {
				fun.argEUR();
			}
			else if (padre.dos.equals("Euro a peso argentino")) {
				fun.EURarg();
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
