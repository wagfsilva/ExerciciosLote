/* OBJETIO: Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume. 
 * AUTOR: Wagner Francisco da Silva
 * DATA: 28/02/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex07 
{
	public static void main(String[] args) 
	{
		int c,l,h;
		c = Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento"));
		l = Integer.parseInt(JOptionPane.showInputDialog("Informe a largura"));
		h = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura"));
		JOptionPane.showMessageDialog(null, "O volume do paralelepípedo é: "+CalculaVolume(c,l,h));
	}
	
	public static int CalculaVolume(int c, int l, int h)
	{
		int v = c * l * h;
		return v;
	}

}
