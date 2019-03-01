/* OBJETIVO: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de dependentes. 
 * 			 Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto).
 * 			 A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber. 
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
		dependente = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de dependentes"));
		JOptionPane.showMessageDialog(null, "O salário a receber: "+ CalculaSalario(valorH, horaT, desconto, dependente));
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
