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
Questão 05: Faça um programa em Java que leia dois números inteiros x e y e depois mostre o
resultado da seguinte expressão: ((x + y)/5 * (y + 30 – x))/(x+y), faça primeiro utilizando a classe
Scanner e depois a classe JoptionPane.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Elaine05_SomaXY
{
    public static void main(String[] args) 
    {
//Scanner
	Scanner sc = new Scanner(System.in);  
        System.out.println("Digite o valor de X: ");
        Integer x = sc.nextInt();
	System.out.println("Digite o valor de Y: ");
        Integer y = sc.nextInt();
        Integer soma = ((x+y)/5 * (y+30-x))/(x+y);
        System.out.println("\n\n\n(("+x+" + "+y+")/5 * ("+y+"+30-"+x+"))/("+x+"+"+y+") = "+soma);
//JOption        
	JOptionPane.showMessageDialog(null,"AGORA NO JOptionPane"); 
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
 	y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y: "));
        soma = ((x+y)/5 * (y+30-x))/(x+y);
        JOptionPane.showMessageDialog(null,"(("+x+" + "+y+")/5 * ("+y+"+30-"+x+"))/("+x+"+"+y+") = "+soma); 
    } 
}
