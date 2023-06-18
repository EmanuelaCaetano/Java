package faccat;
import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o valor da temperatura em graus Fahrenheit: ");
		float fahrenheit=sc.nextFloat();
		float celsius=((fahrenheit-32)*5)/9;
		System.out.println("izemos a conversão e a temperatura em graus Celsius é: "+celsius+"°C");
		sc.close();
		
	}
}
