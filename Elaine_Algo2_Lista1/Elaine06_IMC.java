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
                 Lista de Exercícios de Algoritmo e Programção II
Questão 06: Faça um programa em Java que leia o nome de uma pessoa, depois seu peso e sua
altura, por fim calcule se IMC(Índice de Massa Corporal) = peso/ altura2 , então mostre uma
mensagem contendo o valor do IMC, faça primeiro utilizando a classe Scanner e depois a classe
JoptionPane.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.Integer;
import java.util.InputMismatchException;
public class Elaine06_IMC
{
    public static void main(String[] args) 
    {
//Scanner
	Scanner sc = new Scanner(System.in);  
	System.out.println("Digite o seu nome:");
	String nome = sc.next();
        System.out.println("Digite o seu peso: ");
        double peso = sc.nextDouble();
	System.out.println("Digite a sua altura: ");
        double altura = sc.nextDouble();
        double imc = peso/(altura*altura);
        System.out.println("\n\n\n"+nome+", seu IMC e = "+imc);
//JOption        
	JOptionPane.showMessageDialog(null,"AGORA NO JOptionPane"); 
	nome = (JOptionPane.showInputDialog("Digite seu nome: "));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: "));
 	altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
        imc = peso/(altura*altura);
        JOptionPane.showMessageDialog(null,nome+", seu IMC e = "+imc); 
    } 
}
