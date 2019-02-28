/* OBJETIVO: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 28/02/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex02 
{
	public static void main(String[] args) 
	{
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salário"));
		JOptionPane.showMessageDialog(null, "O salário reajustado é: " +CalculaSalario(salario));
	}
	
	public static double CalculaSalario(double salario)
	{
		salario = salario * 1.15;
		return salario;
	}
}
