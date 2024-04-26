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
Questão 04: Faça um programa em Java que leia um número inteiro x e depois mostre o resultado
da seguinte expressão: ((x + 5) * (20 – x))/x, faça primeiro utilizando a classe Scanner e depois a
classe JoptionPane.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Elaine04_SomaX
{
    public static void main(String[] args) 
    {
//Scanner
	Scanner sc = new Scanner(System.in);  
        System.out.println("Digite o valor de X: ");
        Integer x = sc.nextInt();
        Integer soma = ((x + 5)*(20-x)/x);
        System.out.println("\n\n\n(("+x+" + 5) * (20 - "+x+"))/"+x+" = "+soma);
//JOption        
	JOptionPane.showMessageDialog(null,"AGORA NO JOptionPane"); 
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite X: "));
        soma = ((x + 5)*(20-x)/x);
        JOptionPane.showMessageDialog(null,"(("+x+" + 5) * (20 - "+x+"))/"+x+" = "+soma); 
    } 
}
