/*OBJETIVO: Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 *AUTOR: Wagner Francisco da Silva
 *DATA: 11/03/19
*/
package exercicios;

import javax.swing.JOptionPane;

public class Ex30 
{
	public static void main(String[] args) 
	{
		int base, exp;
		double z;
		base = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da base"));
		exp = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do expoente"));
		z = Math.pow(base, exp);
		JOptionPane.showMessageDialog(null, "O valor da potência é: "+z);
	}
}
