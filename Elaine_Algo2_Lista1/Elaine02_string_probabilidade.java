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
                 Lista de Exerc�cios de Algoritmo e Program��o II
Quest�o 02: Fa�a um programa em Java que leia tr�s strings e mostre seis frases poss�veis com estas
tr?s strings, fa�a primeiro utilizando a classe BufferedReader e depois fa�a utilizando a classe
JoptionPane.
*************************************************************************************/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.*;
//import javax.swing.JOptionPane;
public class Elaine02_string_probabilidade 
{
    public static void main(String[] args) 
    {
     BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
     String nome1 = "", nome2 = "", nome3 = "";
        
    try 
    {
       System.out.println("Digite a palavra 1:");
       nome1=dataln.readLine();
       System.out.println("Digite a palavra 2:");
       nome2=dataln.readLine();
       System.out.println("Digite a palavra 3:");
       nome3=dataln.readLine();
    }
    catch (IOException e)
    {
       System.out.println("Error!");
    }
    //vai no bra�o:
    System.out.println("\n\n"+nome1+" "+nome2+" "+nome3+"\n");
    System.out.println(nome1+" "+nome3+" "+nome2+"\n");
    System.out.println(nome2+" "+nome1+" "+nome3+"\n");
    System.out.println(nome2+" "+nome3+" "+nome1+"\n");
    System.out.println(nome3+" "+nome1+" "+nome2+"\n");
    System.out.println(nome3+" "+nome2+" "+nome1+"\n");
//NO JOPTION    
    JOptionPane.showMessageDialog(null,"AGORA NO JOptionPane");
    nome1 = JOptionPane.showInputDialog("Digite a palavra 1: ");
    nome2 = JOptionPane.showInputDialog("Digite a palavra 2: ");
    nome3 = JOptionPane.showInputDialog("Digite a palavra 3: ");
    JOptionPane.showMessageDialog(null,nome1+" "+nome2+" "+nome3+"\n"
				      +nome1+" "+nome3+" "+nome2+"\n"
				      +nome2+" "+nome3+" "+nome1+"\n"
				      +nome2+" "+nome1+" "+nome3+"\n"
				      +nome3+" "+nome1+" "+nome2+"\n"
				      +nome3+" "+nome2+" "+nome1+"\n");

    }
   
    
 
}
