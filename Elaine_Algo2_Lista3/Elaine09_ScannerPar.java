/* ***********************************************************************************
UAPI - UNIVERSIDADE ABERTA DO PIAUI
UFPI - UNIVERSIDADE FEDERAL DO PIAUI
POLO: INHUMA
Curso de Bacharelado em Sistemas de Informa��o
Disciplina: ALGORITMO E PROGRAMA��O II
Tutora: Danielle Lago

**************************************************************************************
             Aluna: ELAINE DA SILVA MOURA         MATRIC: 10L06079
**************************************************************************************11
                 Lista de Exerc�cios de Algoritmo e Programa��o II - 3
Quest�o 09: Fa�a um programa em java que obtenha um n�mero, passado pelo usu�rio usando
argumentos de linha de comando, e mostre se o mesmo � ou n�o par.
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
		System.out.println("O n�mero "+num+" � par.");
	else
		System.out.println("O n�mero "+num+" n�o � par.");


/*	NAO FUNCIONOU DESSE JEITO ABAIXO
	int n = Integer.parseInt(args[0]);
	if(n%2 == 0)
		System.out.println("O n�mero "+args[0]+" � par.");
	else
		System.out.println("O n�mero "+args[0]+" n�o � par.");
*/
    }
} 
