/* OBJETIVO: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado. 
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
		
		JOptionPane.showMessageDialog(null, "A área do quadrado é: "+CalculaLado(lado));
		
	}
	
	public static int CalculaLado(int l)
	{
		int a = l * l;
		return a;
	}

}
