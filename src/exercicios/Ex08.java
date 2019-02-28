/* OBJETIVO: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 28/02/19
 */ 
package exercicios;

import javax.swing.JOptionPane;

public class Ex08
{
	public static void main(String[] args) 
	{
		double deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do depósito"));
		double  m = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de meses de aplicação"));
		JOptionPane.showMessageDialog(null, "O valor após um mês de aplicação: "+CalculaRendimento(deposito,m));
	}
	
	public static double CalculaRendimento(double deposito, double m)
	{
		m = m * 0.03;
		double novoValor = deposito * (m + 1);
		return novoValor;
	}
}
