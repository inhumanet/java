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
Quest�o 09: Fa�a um programa em Java que leia 10 n�meros e depois mostre em uma mensagem o
valor do produto destes n�meros, fa�a utilizando a classe JoptionPane.
*************************************************************************************/
import javax.swing.*;
public class Elaine09_Soma10Num
{
    public static void main(String[] args) 
    {
 	int num=0,soma=0,x;
	for(x=1;x<=10;x++)
           {
	   num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));        	
	   soma=soma+num;            		
           }	
	JOptionPane.showMessageDialog(null, "O somat�rio dos n�meros e: "+soma);
    } 
}
