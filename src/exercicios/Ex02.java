/* OBJETIVO: Receba o sal�rio de um funcion�rio e mostre o novo sal�rio com reajuste de 15%. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 28/02/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex02 
{
	public static void main(String[] args) 
	{
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do sal�rio"));
		JOptionPane.showMessageDialog(null, "O sal�rio reajustado �: " +CalculaSalario(salario));
	}
	
	public static double CalculaSalario(double salario)
	{
		salario = salario * 1.15;
		return salario;
	}
}
