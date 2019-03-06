/* OBJETIVO: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento.
 *  Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados. 
 *  AUTOR = Wagner Francisco da Silva
 *  DATA: 06/03/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex22 
{
	public static void main(String[] args) 
	{
		int inv;
		double valor;
		inv = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de investimento \n 1 = poupança \n 2 = renda fixa"));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do investimento"));
		JOptionPane.showMessageDialog(null, "O valor corrigido: "+ CalculaInv( inv, valor));
	}
	
	public static double CalculaInv(int inv, double valor)
	{
		switch (inv)
		{
		case 1:
			valor =(valor * 1.03);
			break;
		case 2:
			valor= (valor * 1.05);
			break;
		default:
				JOptionPane.showMessageDialog(null, "Investimento inválido");
		}
		return valor;
	}

}
