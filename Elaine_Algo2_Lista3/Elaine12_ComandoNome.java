/* ***********************************************************************************
UAPI - UNIVERSIDADE ABERTA DO PIAUI
UFPI - UNIVERSIDADE FEDERAL DO PIAUI
POLO: INHUMA
Curso de Bacharelado em Sistemas de Informação
Disciplina: ALGORITMO E PROGRAMAÇÃO II
Tutora: Danielle Lago

**************************************************************************************
             Aluna: ELAINE DA SILVA MOURA         MATRIC: 10L06079
**************************************************************************************11
                 Lista de Exercícios de Algoritmo e Programação II - 3
Questão 12: Faça um programa em Java que obtenha um nome, passado pelo usuário usando
argumentos de linha de comando, e mostre quantas vogias existe no nome.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.*;
public class Elaine12_ComandoNome
{
    public static void main(String[] args) 
    {
	//AINDA NAO ENTENDI COMO FUNCIONA ESSA LINHA DE COMANDO
	


int i=0,cont=0;
if (args.length ==1)
{
String nome = args[0].toUpperCase();
for(i=0;i<nome.length();i++)
{
if(nome.charAt(i) == 'A' || nome.charAt(i) == 'E' || nome.charAt(i) == 'I' || nome.charAt(i) == 'O' ||
nome.charAt(i) == 'U')
cont+=1;
}
System.out.println("O número de vogais na string é:"+ cont);
}
else System.out.println("O número de argumentos está errado, deveria ser 1.");    }
} 
