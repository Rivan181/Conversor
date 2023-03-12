package Unidades;




import javax.swing.JOptionPane;



public class ingreseMoneda {
	
	static String unidades;
	static double unit;
	static int msj;
	static String opcion;

	
	public static void main(String[] args) {
		//do {
	
	
		String [] conversion={"Conversion de moneda", "Conversion de temperatura", "Conversion de longitud"};
		
		 opcion = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Menu", JOptionPane.PLAIN_MESSAGE, null, conversion, null).toString();
		
		JOptionPane.showMessageDialog(null, "Seleccionó "+ opcion);
		
		
//CONVERSION DE MONEDA
		
	
		/*

		
		
				int msj = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
				
		
				if (msj==JOptionPane.YES_OPTION) {
				 opcion = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Menu", JOptionPane.PLAIN_MESSAGE, null, conversion, null).toString();
					
				}
				else if (msj==JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, "Finalizo el programa");
						
				}else if (msj==JOptionPane.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(null, "Finalizo el programa");
				}*/
				
		}
	
		
		//}while (msj==0);
	}
	


		
		
		
		
		
		