package faccat;
import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		int nota01=sc.nextInt();
		System.out.println("Digite a segunda nota: ");
		int nota02=sc.nextInt();
		System.out.println("Digite a terceira nota: ");
		int nota03=sc.nextInt();
		float mediaFinal=(nota01+nota02+nota03)/3;
		System.out.println("A m�dia final do aluno � de: "+mediaFinal);
		sc.close();}
				
}
