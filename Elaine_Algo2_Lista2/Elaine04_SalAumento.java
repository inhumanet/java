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
Quest�o 04: Fa�a um programa em Java que leia o valor do sal�rio bruto de um funcion�rio. Se o
sal�rio for menor ou igual a R$ 545,00, o programa deve aplicar um aumento de 10%, e para s�l�rio
maior do que R$545,00, o programa deve aplicar um aumento de 5%, depois mostre uma
mensagem que exiba o sal�rio, fa�a primeiro utilizando a classe Scanner e depois a classe
JoptionPane.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Elaine04_SalAumento
{
    public static void main(String[] args) 
    {
//Scanner
	Scanner sc = new Scanner(System.in);  
        System.out.println("Digite o valor do salario: R$ ");
        float sal = sc.nextFloat();
	if(sal<=545)
		sal=(sal+((sal/100)*10));		
	else
		sal=(sal+((sal/100)*5));		
	System.out.println("O seu salario atual e: R$ "+sal);
//JOption        
	JOptionPane.showMessageDialog(null,"AGORA NO JOptionPane"); 
        sal = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do salario: R$ "));
	if(sal<=545)
		sal=(sal+((sal/100)*10));		
	else
		sal=(sal+((sal/100)*5));		
	    	JOptionPane.showMessageDialog(null,"O seu salario atual e: R$ "+sal);
//
    } 
}
