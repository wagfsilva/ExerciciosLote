/* OBJETIVO: Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 28/02/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex06
{
	public static void main(String[] args)
	{
		int x,y;
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de X"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de Y"));
		TrocaValores(x,y);
	}
	
	public static void TrocaValores(int x, int y)
	{
		int aux;
		aux = x;
		x = y;
		y = aux;
		JOptionPane.showMessageDialog(null, "Os valores trocados:\n X = "+x+"\n Y = "+y);
	}

}
