package ProjetoConversordeMoedas;

import java.io.IOException;

import cores.util.Cores;

public class Conversor {

	double valorConvertido;
	double valor;
	String simbolo;
	
	public Conversor(double valor)
	{
		this.valor = valor;
	}
	public void conversaoMult (double valor, double cotacao, String simbolo)
	{
		valorConvertido=this.valor*cotacao;
		System.out.printf(Cores.TEXT_GREEN+"\nValor da moeda convertida: %.2f %s",valorConvertido, simbolo);
	}
	public void keyPress()
	{
		try
		{
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();
		} 
		catch (IOException e)
		{
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
		finally
		{
			System.out.println("\n\nPressione Enter para Continuar...");
		}
	}

/**********************************************************************************************************************************/
	public double getValorConvertido() {
		return valorConvertido;
	}
	public void setValorConvertido(double valorConvertido) {
		this.valorConvertido = valorConvertido;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
/**********************************************************************************************************************************/
}
		

