package Unidades;

import javax.swing.JOptionPane;

public class funcional extends padre implements conversorLongitudes, conversionTemperatura, conversionMoneda{
	
	//CONSTRUCTOR
	public funcional()  {
		
	}
	
	
	@Override
	protected void ingreseConversion() {
		opcion = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Menu", JOptionPane.PLAIN_MESSAGE, null, conversion, null).toString();	
	}
	@Override
	protected void ingreseUnidades() {
		if (opcion.equals("Conversion de temperatura")) {
			
		tres = JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, temperatura, null).toString();
		}
		else if(opcion.equals("Conversion de moneda")) {
			dos =JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Moneda", JOptionPane.PLAIN_MESSAGE, null, moneda, null).toString();	
		}
		else if(opcion.equals("Conversion de longitud")) {
			cuatro =JOptionPane.showInputDialog(null, "Seleccione la opcion de convercion", "Longitud", JOptionPane.PLAIN_MESSAGE, null, longitud, null).toString();
		}
	
	}
		
		
	
	@Override
	protected void ingreseValor() {
		unidades = JOptionPane.showInputDialog("introduzca el valor");
		while (!unidades.matches("^[0-9]+([\\.,][0-9]+)?+$")) {
			JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
			unidades = JOptionPane.showInputDialog("introduzca el valor");
		}
	}
		@Override
		public void posNeg() {
			unidades = JOptionPane.showInputDialog("introduzca el valor");
			while (!unidades.matches("^-?[0-9]+([\\.,][0-9]+)?+$")) {
				JOptionPane.showMessageDialog(null, "Solo se acepta un valor numerico");
				unidades = JOptionPane.showInputDialog("introduzca el valor");
			
		}
	}
	@Override
	public void MetCen() {
		ingreseValor();
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null,  "Son "+ (unit * padre.metrosAcentimetros) +" metros");		
	}
	@Override
	public void CenMet() {
		ingreseValor();
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null,  "Son "+ (unit /padre.centimetrosAmetros)+" centimetros");
		
	}
	@Override
	public void MetMil() {
		ingreseValor();
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null,  "Son "+ (unit *padre.metrosAmilimetros)+" milimetros");
		
	}
	@Override
	public void MilMet() {
		ingreseValor();
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null,  "Son "+ (unit /padre.milimetrosAmetros)+" metros");
		
	}

	//TEMPERATURA

	@Override
	public void FarCel() {
		posNeg();	
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null, "Son "+ (((unit-32)*5)/9) +" grados Farenhait");
		
	}


	@Override
	public void CelKel() {
		posNeg();	
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null, "Son "+ (unit + padre.celAkelvin)+" grados Kelvin");
		
	}


	@Override
	public void KelCel() {
		posNeg();	
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null, "Son "+ (unit + padre.kelvinAcel)+" grados Celcius");
		
	}


	@Override
	public void CelFar() {
		posNeg();
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null, "Son "+ ((unit * 9/5) + 32) +" grados Farenheit");
		
	}
//MONEDA

	@Override
	public void DollAr() {
		ingreseValor();
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * padre.dollarpesoArg) +" Pesos Argentinos");
		
	}
	@Override
	public void ArDoll() {
		ingreseValor();
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * padre.pesoArgdolLar) +" Dolares");
		
	}


	@Override
	public void argGBP() {
		ingreseValor();
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * padre.argGbp) +" Libras");
		
	}


	@Override
	public void GBParg() {
		ingreseValor();
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null, "Son $"+ (unit * padre.gbpArg) +" Pesos Argentinos");
		
	}


	@Override
	public void YENarg() {
		ingreseValor();
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * padre.yenArg) +" Pesos Argentinos");
		
	}


	@Override
	public void argYEN() {
		ingreseValor();
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * padre.argYen) +" Yenes japoneses");
		
	}
	
	@Override
	public void KRWarg() {
		ingreseValor();
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * padre.krwArg) +" Won sul-coreano");
		
	}
	@Override
	public void argKRW() {
		ingreseValor();
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * padre.argKrw) +" Pesos Argentinos");
		
	}
	@Override
	public void EURarg() {
		ingreseValor();
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * padre.eurArg) +" Pesos Argentinos");
		
	}
	@Override
	public void argEUR() {
		ingreseValor();
		unit = Double.parseDouble(unidades);
		JOptionPane.showMessageDialog(null, "La cantidad es $"+ (unit * padre.argEur) +" Euros");
		
	}


	


		
		
	
		
		
		
		
		
		
	}
		
		
		
		
		
		
		

		
		
		
		
		

		
		
		
		
	


