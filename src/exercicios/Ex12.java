/* OBJETIVO: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 28/02/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex12 
{
	public static void main(String[] args)
	{
		int anoN, anoA;
		anoN = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento"));
		anoA = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual"));
		JOptionPane.showMessageDialog(null, "A idade daqui 17 anos será: "+CalculaIdade(anoN, anoA));
	}
	
	public static int CalculaIdade(int nasc, int atual)
	{
		int idade = (atual - nasc) + 17;
		return idade;
	}

}
