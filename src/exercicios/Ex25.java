/* OBJETIVO: Receba um número. Calcule e mostre os resultados da tabuada desse número. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 08/03/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex25 
{
	public static void main(String[] args) 
	{
		int x;
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de X"));
		calculaTabuada(x);
	}
	
	static void calculaTabuada(int x)
	{
		int z, i;
		for (i = 0; i <= 10; i++)
		{
			z = x * i;
			System.out.println(x+" * " +i+" = "+ z );
		}
	}

}
