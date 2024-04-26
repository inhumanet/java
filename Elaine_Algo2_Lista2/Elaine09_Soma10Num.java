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
Questão 09: Faça um programa em Java que leia 10 números e depois mostre em uma mensagem o
valor do produto destes números, faça utilizando a classe JoptionPane.
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
	JOptionPane.showMessageDialog(null, "O somatório dos números e: "+soma);
    } 
}
