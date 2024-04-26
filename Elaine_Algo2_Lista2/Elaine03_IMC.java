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
Questão 03: Faça um programa em Java que leia o nome de uma pessoa, depois seu peso e sua
altura, por fim calcule se IMC(Índice de Massa Corporal) = peso/ altura2 , então mostre uma
mensagem de acordo com o resultado do IMC, conforme segue abaixo:
IMC < 20 = Peso abaixo do normal
IMC >= 20 e IMC < 25 = Peso normal
IMC >= 25 e IMC <30 = Sobrepeso
IMC >= 30 = Obesidade
faça primeiro utilizando a classe Scanner e depois a classe JoptionPane.
*************************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Elaine03_IMC
{
    public static void main(String[] args) 
    {
//Scanner
	Scanner sc = new Scanner(System.in);  
	System.out.println("Digite o seu nome:");
	String nome = sc.next();
        System.out.println("Digite o seu peso: ");
        float peso = sc.nextFloat();
	System.out.println("Digite a sua altura: ");
        float altura = sc.nextFloat();
        float imc = peso/(altura*altura);
	if(imc<20)
		        System.out.println("\n\n\n"+nome+", IMC < 20 = Peso abaixo do normal");
	else if(imc>=20 && imc<25)
		        System.out.println("\n\n\n"+nome+", IMC >= 20 e IMC < 25 = Peso normal");
	else if(imc>=25 && imc<30)
		        System.out.println("\n\n\n"+nome+", IMC >= 25 e IMC <30 = Sobrepeso");
	else 
		        System.out.println("\n\n\n"+nome+", IMC >= 30 = Obesidade");
//JOption        
	JOptionPane.showMessageDialog(null,"AGORA NO JOptionPane"); 
	nome = (JOptionPane.showInputDialog("Digite seu nome: "));
        peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso: "));
 	altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura: "));
        imc = peso/(altura*altura);
	if(imc<20)
		        JOptionPane.showMessageDialog(null,nome+", IMC < 20 = Peso abaixo do normal");
	else if(imc>=20 && imc<25)
		        JOptionPane.showMessageDialog(null,nome+", IMC >= 20 e IMC < 25 = Peso normal");
	else if(imc>=25 && imc<30)
		        JOptionPane.showMessageDialog(null,nome+", IMC >= 25 e IMC <30 = Sobrepeso");
	else 
		        JOptionPane.showMessageDialog(null,nome+", IMC >= 30 = Obesidade");        
 
//
    } 
}
