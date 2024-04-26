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
                 Lista de Exercícios de Algoritmo e Programção II - 3
Questão 01: Faça um programa em Java que leia 10 números inteiros e armazene-os em um vetor,
depois multiplique por 2 cada elemento do vetor e por fim mostre o conteúdo do vetor na tela, faça
utilizando a classe JoptionPane.
*************************************************************************************/
import javax.swing.*;
public class Elaine01_Vetor10Num
{
    public static void main(String[] args) 
    {
 	int num[] = new int[10];
	int x;
	String msg = "";
	for(x=1;x<=10;x++)
	   num[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));	
	for(x=1;x<=10;x++)
           msg += (num[x]+" X 2 = "+(num[x]*2)+"\n");
	JOptionPane.showMessageDialog(null, msg,"Valores do vetor * 2",JOptionPane.INFORMATION_MESSAGE);
    } 
}
