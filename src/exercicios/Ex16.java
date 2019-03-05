/* OBJETIVO: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 01/03/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex16 
{

	public static void main(String[] args) 
	{
		int x,y;
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de X"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de Y"));
		JOptionPane.showMessageDialog(null, "A diferença do maior valor pelo menor valor é: " + CalculaDif(x,y));
	}
	
	public static int CalculaDif(int x, int y)
	{
		int z;
		if (x > y) 
		{
		 	z = x - y;
		}else
		{
			z = y - x;
		}
		
		return z;
	}
}
