/* OBJETIVO: Receba 2�ngulos de um tri�ngulo. Calcule e mostre o valor do 3� �ngulo. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 01/03/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex13 
{
	public static void main(String[] args) 
	{
		int a1,a2;
		a1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro �ngulo"));
		a2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo �ngulo"));
		JOptionPane.showMessageDialog(null,"O terceiro �ngulo �: "+CalculaAng(a1,a2));
	}
	
	static int CalculaAng(int x, int y)
	{
		int z = 180 - (x + y);
		return z;
	}

}
