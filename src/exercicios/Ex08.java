/* OBJETIVO: Receba o valor de um dep�sito em poupan�a. Calcule e mostre o valor ap�s 1 m�s de aplica��o sabendo que rende 1,3% a. m. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 28/02/19
 */ 
package exercicios;

import javax.swing.JOptionPane;

public class Ex08
{
	public static void main(String[] args) 
	{
		double deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do dep�sito"));
		double  m = Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero de meses de aplica��o"));
		JOptionPane.showMessageDialog(null, "O valor ap�s um m�s de aplica��o: "+CalculaRendimento(deposito,m));
	}
	
	public static double CalculaRendimento(double deposito, double m)
	{
		m = m * 0.03;
		double novoValor = deposito * (m + 1);
		return novoValor;
	}
}
