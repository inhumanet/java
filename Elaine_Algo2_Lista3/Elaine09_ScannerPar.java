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
Questão 09: Faça um programa em java que obtenha um número, passado pelo usuário usando
argumentos de linha de comando, e mostre se o mesmo é ou não par.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.*;
public class Elaine09_ScannerPar
{
    public static void main(String[] args) 
    {
	//variaveis
	Scanner sc = new Scanner(System.in);  
        System.out.println("Digite um numero: ");
        Integer num = sc.nextInt();	
	if(num%2 == 0)
		System.out.println("O número "+num+" é par.");
	else
		System.out.println("O número "+num+" não é par.");


/*	NAO FUNCIONOU DESSE JEITO ABAIXO
	int n = Integer.parseInt(args[0]);
	if(n%2 == 0)
		System.out.println("O número "+args[0]+" é par.");
	else
		System.out.println("O número "+args[0]+" não é par.");
*/
    }
} 
