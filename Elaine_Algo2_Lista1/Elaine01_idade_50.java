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
Quest�o 01: Fa�a um programa em Java que leia o nome de uma pessoa e sua idade e depois mostre
em uma �nica frase o nome da pessoa mais quantos anos ela ter� daqui a 50 anos, fa�a primeiro
utilizando a classe Scanner e depois a classe JoptionPane.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Elaine01_idade_50{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        System.out.println("Digite sua idade: ");
        Integer idade = sc.nextInt();
        idade = idade + 50;
        System.out.println("\n\n\n"+nome+", daqui a 50 anos sua idade sera: "+idade+" anos.\n\n\n");
        JOptionPane.showMessageDialog(null,"AGORA NO JOptionPane"); 
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        JOptionPane.showMessageDialog(null,nome+", sua idade daqui a 50 anos ser�: "+(idade+50)+" anos"); 
    } 
}
