/* OBJETIVO: Coletar o valor do lado de um quadrado, calcular sua �rea e apresentar o resultado. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 28/02/19
 */ 
package exercicios;

import javax.swing.JOptionPane;

public class Ex01
{

	public static void main(String[] args)
	{
		int lado= Integer.parseInt(JOptionPane.showInputDialog("Informe o lado do quadrado" ));
		
		JOptionPane.showMessageDialog(null, "A �rea do quadrado �: "+CalculaLado(lado));
		
	}
	
	public static int CalculaLado(int l)
	{
		int a = l * l;
		return a;
	}

}
