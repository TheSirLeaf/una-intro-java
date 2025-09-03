/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    System.out.println("Digite o primeiro número");
		int numA = scanner.nextInt();
		System.out.println("Digite o segundo número");
		int numB= scanner.nextInt();
		scanner.close();
		System.out.println("Soma: " + (numA + numB));
	    System.out.println("Subtração: " + (numA - numB));
		System.out.println("Multiplicação: " + numA * numB);
		System.out.println("Divisão: " + numA / numB);
	}
}