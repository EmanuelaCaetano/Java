package faccat;
import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o n�mero total de eleitores: ");
		int totalEleitores=sc.nextInt();
		System.out.println("Digite o n�mero de votos brancos: ");
		int votosBrancos=sc.nextInt();
		System.out.println("Digite o n�mero de votos nulos: ");
		int votosNulos=sc.nextInt();
		System.out.println("Digite o n�mero de votos v�lidos: ");
		int votosValidos=sc.nextInt();
		float percentualBrancos=(votosBrancos*100)/totalEleitores;
		float percentualNulos=(votosNulos*100)/totalEleitores;
		float percentualValidos=(votosValidos*100)/totalEleitores;
		System.out.printf("O percentual de votos brancos �: "+percentualBrancos);
		System.out.printf("O percentual de votos brancos �: "+percentualNulos);
		System.out.printf("O percentual de votos brancos �: "+percentualValidos);
		sc.close();
		
	}
}
