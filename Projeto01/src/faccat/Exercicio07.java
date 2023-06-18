package faccat;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[]args) {
		Scanner SC=new Scanner(System.in);
		System.out.println("digite quantos anos voce tem");
		int anos = SC.nextInt();
		System.out.println("digite quantos meses voce tem");
		int meses = SC.nextInt();
		System.out.println("digite o dia de hoje");
		int dias = SC.nextInt();
		int resultado = (anos*365) + (meses*30) + dias;
		System.out.println("sua idade em dias é igual" + resultado);
		SC.close();
	}
	
}
