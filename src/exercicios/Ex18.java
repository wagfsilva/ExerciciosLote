/* OBJETIVO: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média: 
 *a) Se a média for >= 6,0 exibir “APROVADO”; 
 *b) Se a média for >= 3,0 ou < 6,0 exibir “EXAME”; 
 *c) Se a média for < 3,0 exibir “RETIDO”;
 *AUTOR: Wagner Francisco da Silva
 *DATA: 05/03/19
 */
package exercicios;

import javax.swing.JOptionPane;

public class Ex18 
{
	public static void main(String[] args) 
	{
		double vet[] = new double[4];
		CarregaVetor(vet);
		CalculaMedia(vet);
		
	}
	
	public static double[] CarregaVetor(double[] vet)
	{
		int i;
		for(i = 0; i <4; i++)
		{	
			vet[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a "+(i+1)+"° nota"));
		}
		return vet;
	}
	
	public static double CalculaMedia(double[] vet)
	{
		int i;
		double media = 0;
		for( i = 0; i < 4; i++)
		{
			media = vet[i]+ media;
		}
		media = media / 4;
		return VerificaStatus(media);
	}
	
	public static double VerificaStatus(double media)
	{
		if (media >= 6)
		{
			JOptionPane.showMessageDialog(null, "APROVADO.\n MEDIA: "+ media);
		}else
			if ((media >= 3) || (media <6))
			{
				JOptionPane.showMessageDialog(null, "EXAME.\n MEDIA:"+ media);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "REPROVADO.\n MEDIA: "+ media);
			}
		return media;
	}
}
