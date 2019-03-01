/* OBJETIVO: Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo. 
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
		a1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro ângulo"));
		a2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo ângulo"));
		JOptionPane.showMessageDialog(null,"O terceiro ângulo é: "+CalculaAng(a1,a2));
	}
	
	static int CalculaAng(int x, int y)
	{
		int z = 180 - (x + y);
		return z;
	}

}
