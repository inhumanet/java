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
Questão 07: Uma empresa dará aumento aos seus funcionários, de acordo
com sua função:
a) função 1 (vendedor) = 0,10(10%) de aumento;
b) função 2 (gerente) = 0,15(15%) de aumento;
c) função 3 (diretor) = 0,20(20%) de aumento.
Usando o comando switch, faça um programa em Java que leia o salário e a função do funcionário,
calcule e exiba os salários com os devidos aumentos, faça utilizando a classe JoptionPane.
*************************************************************************************/
import javax.swing.*;
public class Elaine07_AumentoFuncao
{
    public static void main(String[] args) 
    {
 	int op;
	double sal;
  	sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario: "));
	op = Integer.parseInt(JOptionPane.showInputDialog("QUAL A SUA FUNÇÃO?\n\n1- VENDEDOR \n2- GERENTE\n3- DIRETOR"));
	switch(op)
           {
               case 1:              		
			JOptionPane.showMessageDialog(null, "Vendedor, o seu salário atualizado e R$: "+(sal=((sal/100)*10)+sal));
                   	break;	      
               case 2:
               		JOptionPane.showMessageDialog(null, "Gerente, o seu salário atualizado e R$: "+(sal=((sal/100)*15)+sal));
                   	break;

               case 3:
               		JOptionPane.showMessageDialog(null, "Diretor, o seu salário atualizado e R$: "+(sal=((sal/100)*20)+sal));
                   	break;
               default: JOptionPane.showMessageDialog(null,"A OPCAO ESCOLHIDA E INVALIDA!");
                   	break;
	   }	

    } 
}
