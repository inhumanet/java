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
Quest�o 08: Fa�a um programa em Java que leia um n�mero inteiro e calcule o somat�rio do
n�mero lida, depois mostre em uma mensagem o valor do somat�rio, fa�a utilizando a classe
JoptionPane.
*************************************************************************************/
import javax.swing.*;
public class Elaine08_SomaFor
{
    public static void main(String[] args) 
    {
 	int num,soma=0,x;
	num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
	for(x=1;x<=num;x++)
           {
        	soma=soma+x;            		
           }	
	JOptionPane.showMessageDialog(null, "O somat�rio do n�mero "+num+" e: "+soma);
    } 
}
