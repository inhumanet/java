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
Quest�o 07: Uma empresa dar� aumento aos seus funcion�rios, de acordo
com sua fun��o:
a) fun��o 1 (vendedor) = 0,10(10%) de aumento;
b) fun��o 2 (gerente) = 0,15(15%) de aumento;
c) fun��o 3 (diretor) = 0,20(20%) de aumento.
Usando o comando switch, fa�a um programa em Java que leia o sal�rio e a fun��o do funcion�rio,
calcule e exiba os sal�rios com os devidos aumentos, fa�a utilizando a classe JoptionPane.
*************************************************************************************/
import javax.swing.*;
public class Elaine07_AumentoFuncao
{
    public static void main(String[] args) 
    {
 	int op;
	double sal;
  	sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario: "));
	op = Integer.parseInt(JOptionPane.showInputDialog("QUAL A SUA FUN��O?\n\n1- VENDEDOR \n2- GERENTE\n3- DIRETOR"));
	switch(op)
           {
               case 1:              		
			JOptionPane.showMessageDialog(null, "Vendedor, o seu sal�rio atualizado e R$: "+(sal=((sal/100)*10)+sal));
                   	break;	      
               case 2:
               		JOptionPane.showMessageDialog(null, "Gerente, o seu sal�rio atualizado e R$: "+(sal=((sal/100)*15)+sal));
                   	break;

               case 3:
               		JOptionPane.showMessageDialog(null, "Diretor, o seu sal�rio atualizado e R$: "+(sal=((sal/100)*20)+sal));
                   	break;
               default: JOptionPane.showMessageDialog(null,"A OPCAO ESCOLHIDA E INVALIDA!");
                   	break;
	   }	

    } 
}
