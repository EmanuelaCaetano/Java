package exemplos;
import java.util.Scanner;

public class ExemploSub {
	public static void main(String[]args) {
		Scanner SC=new Scanner(System.in);
		System.out.println("digite um numero: ");
		int numero01=SC.nextInt();
		System.out.println("digite um numero: ");
		int numero02=SC.nextInt();
		int subtracao=numero01-numero02;
		System.out.println("o resultado é: "+subtracao);
		SC.close();
	}

}
