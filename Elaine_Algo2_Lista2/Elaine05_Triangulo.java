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
Questão 05: Faça um programa em Java que leia tr?s números inteiros e depois mostre uma
mensagem dizendo se eles formam ou não um triângulo, se eles formarem diga qual tipo de
triângulo: equilátero, isósceles, escaleno, faça utilizando a classe JoptionPane.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Elaine05_Triangulo
{
    public static void main(String[] args) 
    {
 	int a,b,c;
	a = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado a: "));
	b = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado b: "));
	c = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado c: "));
 	if((a>b+c) != (b>a+c) != (c>a+b))
            JOptionPane.showMessageDialog(null,"NAO FORMA UM TRIANGULO");
 	else if(a==b && a==c)
           JOptionPane.showMessageDialog(null,"TRIANGULO EQUILATERO");
	else if(a!=b && a!=c && b!=c)
            JOptionPane.showMessageDialog(null,"TRIANGULO ESCALENO");
	else     
	    JOptionPane.showMessageDialog(null,"TRIANGULO ISOCELES");
    } 
}
