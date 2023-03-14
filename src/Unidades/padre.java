package Unidades;

import javax.swing.JOptionPane;

public  class padre {

	static String unidades;
	static double unit = 0;
	static int msj;
	static String opcion;
	static String dos;
	static String tres;
	static String cuatro;
	
	static String [] conversion={"Conversion de moneda", "Conversion de temperatura", "Conversion de longitud"};
	static String [] temperatura={"Celcius a Farenheit", "Farenheit a Celcius", "Celcius a Kelvin", "Kelvin a Celcius"};
	static String [] moneda={"Dolar a Peso Argentino", "Dolar a Peso Colombiano","Dolar a Euro", "Peso Argentino a Dolar", "Peso Colombiano a Dolar", "Euro a Dolar"};
	static String [] longitud={"Metros a Centimetros", "Centimetros a Metros", "Metros a Milimimetros", "Milimetros a Metros"};
	
	//MONEDAS

	static double dollarpesoArg = 198.25;
	static double dollarApesoColom = 4785.10;
	static double dollarAeuro= 0.94;	
	static double pesoArgdolLar = 1/198.25;
	static double ApesoColomdollar = 1/4785.10;
	static double Aeurodollar= 1/0.94;
	
	//TEMPERATURA
	
	static double celAfar = ((9/5) + 32) ;
	static double celAkelvin = (+273);
	static double farAcel= ((-32) *(5/9));	
	static double kelvinAcel = (-273);
	
	//LONGITUD
	
	static double metrosAcentimetros= (100) ;
	static double centimetrosAmetros = (100);
	static double metrosAmilimetros = (1000);	
	static double milimetrosAmetros = (1000);
	
	
	
	public void ingreseConversion(){			
		 opcion = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Menu", JOptionPane.PLAIN_MESSAGE, null, conversion, null).toString();
		 }
	
	
	public static void ingreseValor() {
		unidades = JOptionPane.showInputDialog("introduzca el valor");
		while (!unidades.matches("^[0-9]+([\\.,][0-9]+)?+$")) {
			JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
			unidades = JOptionPane.showInputDialog("introduzca el valor");
		}
	}
}
		
		
		
		
		