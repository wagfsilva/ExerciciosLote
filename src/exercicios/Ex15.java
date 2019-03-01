/* OBJETIVO: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o n�mero de dependentes. 
 * 			 Calcule o sal�rio que ser�o as horas trabalhadas x o valor por hora. Calcule o sal�rio l�quido (= Sal�rio Bruto � desconto).
 * 			 A cada dependente ser� acrescido R$ 100 no Sal�rio L�quido. Exiba o sal�rio a receber. 
 * AUTOR: Wagner Francisco
 * DATA: 01/03/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex15 
{
	public static void main(String[] args)
	{
		int dependente;
		double valorH, desconto, horaT;
		valorH = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor por hora"));
		horaT= Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas"));
		desconto = Integer.parseInt(JOptionPane.showInputDialog("Informe o percentual de desconto"));
		dependente = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de dependentes"));
		JOptionPane.showMessageDialog(null, "O sal�rio a receber: "+ CalculaSalario(valorH, horaT, desconto, dependente));
	}
	
	public static double CalculaSalario(double vh, double ht, double desc, int depen) 
	{
		double salarioBruto = ht * vh;
		desc = desc / 100;
		depen = depen * 100;
		desc = salarioBruto * desc;
		double salarioLiquido = (salarioBruto - desc ) + depen;
		
		return salarioLiquido;
	}

}
