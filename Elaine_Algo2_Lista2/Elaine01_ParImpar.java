/* ***********************************************************************************
UAPI - UNIVERSIDADE ABERTA DO PIAUI
UFPI - UNIVERSIDADE FEDERAL DO PIAUI
POLO: INHUMA
Curso de Bacharelado em Sistemas de Informa��o
Disciplina: ALGORITMO E PROGRAMA��O II
Tutora: Danielle Lago

**************************************************************************************
             Aluna: ELAINE DA SILVA MOURA         MATRIC: 10L06079
**************************************************************************************
                 Lista de Exerc�cios de Algoritmo e Program��o II - 2
Quest�o 01: Fa�a um programa em Java que leia um n�mero inteiro e depois mostre uma mensagem
dizendo se este n�mero � ou n�o par, fa�a primeiro utilizando a classe Scanner e depois a classe
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
