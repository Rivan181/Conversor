package Unidades;

import javax.swing.JOptionPane;

public class funcional extends  conversorLongitudes {
	
	public static void main(String[] args) {
		
		
		padre con = new padre();
		do {
		con.ingreseConversion();
		
		if (padre.opcion.equals("Conversion de temperatura")){			
			ingreseUnidades();
		}
			/*
			if (padre.tres.equals("Celcius a Farenheit")) {
				CelFar();				
			}
			else if (padre.tres.equals("Farenheit a Celcius")) { 
				FarCel();
			}
			else if (padre.tres.equals("Celcius a Kelvin")) {
				CelKel();
			}
			else if (padre.tres.equals("Kelvin a Celcius")) {
				KelCel();
			}
		}
		else if (padre.opcion.equals("Conversion de moneda")) {
			ingreseUnidades();
			if (padre.dos.equals("Dolar a Peso Argentino")) {
				DollAr();
			}
			else if (padre.dos.equals("Dolar a Peso Colombiano")) {
				DollCol();
			}
			else if (padre.dos.equals("Dolar a Euro")) {
				DollEur();
			}
			else if (padre.dos.equals("Peso Argentino a Dolar")) {
				ArDoll();
			}
			else if (padre.dos.equals("Peso Colombiano a Dolar")) {
				ColDoll();
			}
			else if (padre.dos.equals("Euro a Dolar")) {
				EurDoll();
			}
			*/
		else if (padre.opcion.equals("Conversion de longitud")) {
			ingreseUnidades();
			if (padre.cuatro.equals("Metros a Centimetros")) {
				MetCen();
			}
			else if (padre.cuatro.equals("Centimetros a Metros")) {
				CenMet();
			}
			else if (padre.cuatro.equals("Metros a Milimimetros")) {
				MetMil();
			}
			else if (padre.cuatro.equals("Milimetros a Metros")) {
				MilMet();
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
		
		}while (msj==0);
	
	
	
	
	
	
	}
	
}
