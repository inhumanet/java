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
                 Lista de Exercícios de Algoritmo e Programção II
Questão 09: Faça um programa em Java que leia o nome de uma aluno e suas três notas, calcule a
média do aluno e mostre uma mensagem contendo o nome do aluno e sua média, faça primeiro
utilizando a classe Scanner e depois a classe JoptionPane.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Elaine09_AlunoMedia
{
    public static void main(String[] args) 
    {
//Scanner
	Scanner sc = new Scanner(System.in);  
        System.out.println("Nome do aluno(a): ");
	String nome = sc.next();
	System.out.println("Digite a nota 1: ");
        float num = sc.nextFloat();
        System.out.println("Digite a nota 2: ");
        float num2 = sc.nextFloat();
	System.out.println("Digite a nota 3:");
	float num3 = sc.nextFloat();
        float media = (num+num2+num3)/3;
        System.out.println("\n\n\nA media do(a) aluno(a) "+nome+" = "+media);
//JOption        
	JOptionPane.showMessageDialog(null,"AGORA NO JOptionPane"); 
	nome = JOptionPane.showInputDialog("Nome do aluno(a): ");
        num = Float.parseFloat(JOptionPane.showInputDialog("Digite um numero: "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite outro numero: "));
	num3 = Float.parseFloat(JOptionPane.showInputDialog("Digite um outro numero:"));
	media = (num+num2+num3)/3;
        JOptionPane.showMessageDialog(null,"A media do(a) aluno(a) "+nome+" = "+media); 
    } 
}
