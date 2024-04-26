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
Questão 07: Faça um programa em Java que leia o nome de um produto e seu valor, no pagamento a
vista o produto terá 10% de desconto, mostre duas mensagens uma com o valor do desconto e outra
contendo o valor a ser pago pelo cliente, faça primeiro utilizando a classe Scanner e depois a
classe JoptionPane.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;
//import java.lang.Integer;
//import java.util.InputMismatchException;
public class Elaine07_Desconto
{
    public static void main(String[] args) 
    {
//Scanner
	Scanner sc = new Scanner(System.in);  
	System.out.print("\n\n\nNome do produto:");
	String nome = sc.next();
        System.out.print("Valor: ");
        double valor = sc.nextDouble();
        double desconto = (valor/100)*10;
        double pagto = valor - desconto;
        System.out.println("\n\n\nO valor do desconto e: "+desconto);
        System.out.println("\nO valor do(a) "+nome+" a ser pago com o desconto: "+pagto);
//JOption        
	JOptionPane.showMessageDialog(null,"AGORA NO JOptionPane"); 
	nome = (JOptionPane.showInputDialog("Nome do produto: "));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
 	desconto = (valor/100)*10;
        pagto = valor - desconto;
        JOptionPane.showMessageDialog(null,"O valor do desconto e: "+desconto); 
	JOptionPane.showMessageDialog(null,"O valor do(a) "+nome+" a ser pago com o desconto: "+pagto);
    } 
}
