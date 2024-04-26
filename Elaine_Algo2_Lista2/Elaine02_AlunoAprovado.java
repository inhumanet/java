/* ***********************************************************************************
UAPI - UNIVERSIDADE ABERTA DO PIAUI
UFPI - UNIVERSIDADE FEDERAL DO PIAUI
POLO: INHUMA
Curso de Bacharelado em Sistemas de Informação
Disciplina: ALGORITMO E PROGRAMAÇÃO II
Tutora: Danielle Lago

**************************************************************************************
             Aluna: ELAINE DA SILVA MOURA         MATRIC: 10L06079
**************************************************************************************
                 Lista de Exercícios de Algoritmo e Programção II - 2
Questão 02: Faça um programa em Java que leia três notas de um aluno, calcule o valor da média e
depois mostre uma mensagem contendo o valor da média e se o mesmo foi ou não aprovado. Para
ser aprovado a média terá que ser maior ou igual a 7.0, faça primeiro utilizando a classe Scanner e
depois a classe JoptionPane.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Elaine02_AlunoAprovado
{
    public static void main(String[] args) 
    {
//Scanner
	Scanner sc = new Scanner(System.in);  
        System.out.println("Digite a nota 1: ");
        float num = sc.nextFloat();
        System.out.println("Digite a nota 2: ");
        float num2 = sc.nextFloat();
	System.out.println("Digite a nota 3:");
	float num3 = sc.nextFloat();
        float media = (num+num2+num3)/3;
        if(media>=7)
	        System.out.println("\n\n\nAluno APROVADO com media "+media);
	else
	        System.out.println("\n\n\nAluno REPROVADO com media "+media);
//JOption        
	JOptionPane.showMessageDialog(null,"AGORA NO JOptionPane"); 
        num = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1: "));
	num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2: "));
	num3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 3: "));
	media = (num+num2+num3)/3;
        if(media>=7)
		JOptionPane.showMessageDialog(null,"Aluno APROVADO com media "+media);
	else
	    	JOptionPane.showMessageDialog(null,"Aluno REPROVADO com media "+media);
//
    } 
}
