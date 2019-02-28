/* OBJETIVO: Receba a base e a altura de um triângulo. Calcule e mostre a sua área
 * AUTOR: Wagner Francisco da Silva
 * DATA: 28/02/19
 */

package exercicios;

import javax.swing.JOptionPane;

public class Ex03 
{

	public static void main(String[] args) 
	{
		int base, altura;
		base = Integer.parseInt(JOptionPane.showInputDialog("Informe a base do triângulo"));
		altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do triângulo"));
		JOptionPane.showMessageDialog(null, "A área do triângulo é: "+CalculaArea(base, altura));
	}
	
	public static int CalculaArea(int b, int h) 
	{
		int a = (b * h) / 2;
		return a ;
	}

}
