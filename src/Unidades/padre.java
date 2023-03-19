package Unidades;


public abstract class padre {

	
	protected static String unidades;
	protected static double unit = 0;
	protected static String opcion;
	protected static String dos ;
	protected static String tres;
	protected static String cuatro;

	protected static String [] conversion={"Conversion de moneda", "Conversion de temperatura", "Conversion de longitud"};
	protected static String [] temperatura={"Celcius a Farenheit", "Farenheit a Celcius", "Celcius a Kelvin", "Kelvin a Celcius"};
	protected static String [] moneda={"Dolar a Peso Argentino", "Dolar a Peso Colombiano","Dolar a Euro", "Peso Argentino a Dolar", "Peso Colombiano a Dolar", "Euro a Dolar"};
	protected static String [] longitud={"Metros a Centimetros", "Centimetros a Metros", "Metros a Milimimetros", "Milimetros a Metros"};
	
	protected static double dollarpesoArg = 198.25;
	protected static double dollarApesoColom = 4785.10;
	protected static double dollarAeuro= 0.94;	
	protected static double pesoArgdolLar = 1/198.25;
	protected static double ApesoColomdollar = 1/4785.10;
	protected static double Aeurodollar= 1/0.94;
	
	//TEMPERATURA
	
	protected static double celAfar = ((9/5) + 32) ;
	protected static double celAkelvin = (+273);
	protected static double farAcel= ((-32) *(5/9));	
	protected static double kelvinAcel = (-273);
	
	//LONGITUD

	protected static double metrosAcentimetros= (100) ;
	protected static double centimetrosAmetros = (100);
	protected static double metrosAmilimetros = (1000);	
	protected static double milimetrosAmetros = (1000);
	
	//METODOS
	
	protected abstract void ingreseConversion();
	protected abstract void ingreseUnidades();
	protected abstract void ingreseValor();
	protected abstract void posNeg();

	
}
	
	
	

		
		
		
		
		