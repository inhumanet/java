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
Questão 03: Faça um programa em Java que leia três inteiros e mostre no final a soma destes
números, faça primeiro utilizando a classe Scanner e depois a classe JoptionPane.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Elaine03_SomaInteiro
{
    public static void main(String[] args) 
    {
//Scanner
	Scanner sc = new Scanner(System.in);  
        System.out.println("Digite um numero: ");
        Integer num = sc.nextInt();
        System.out.println("Digite outro numero: ");
        Integer num2 = sc.nextInt();
	System.out.println("Digite um outro numero:");
	Integer num3 = sc.nextInt();
        Integer soma = num+num2+num3;
        System.out.println("\n\n\n"+num+" + "+num2+" + "+num3+" = "+soma);
//JOption        
	JOptionPane.showMessageDialog(null,"AGORA NO JOptionPane"); 
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));
	num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro numero:"));
	soma = num+num2+num3;
        JOptionPane.showMessageDialog(null,num+" + "+num2+" + "+num3+" = "+soma); 
    } 
}
