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
Questão 01: Faça um programa em Java que leia um número inteiro e depois mostre uma mensagem
dizendo se este número é ou não par, faça primeiro utilizando a classe Scanner e depois a classe
JoptionPane.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Elaine01_ParImpar
{
    public static void main(String[] args) 
    {
//Scanner
	Scanner sc = new Scanner(System.in);  
        System.out.println("Digite um numero: ");
        Integer num = sc.nextInt();
        if(num%2==0)
	        System.out.println("\n\n\nO "+num+" e um numero PAR");
	else
	        System.out.println("\n\n\nO "+num+" e um numero IMPAR");
//JOption        
	JOptionPane.showMessageDialog(null,"AGORA NO JOptionPane"); 
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
	if(num%2==0)
	        JOptionPane.showMessageDialog(null,"O "+num+" e um numero PAR");
	else
	    JOptionPane.showMessageDialog(null,"O "+num+" e um numero IMPAR");
    } 
}
