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
Questão 08: Faça um programa em Java que leia um número inteiro e calcule o somatório do
número lida, depois mostre em uma mensagem o valor do somatório, faça utilizando a classe
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
	JOptionPane.showMessageDialog(null, "O somatório do número "+num+" e: "+soma);
    } 
}
