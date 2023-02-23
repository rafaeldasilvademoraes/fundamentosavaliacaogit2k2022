import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Olá, mundo!");
		System.out.println("Olá, dev!");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o seu nome:");
		String nome = scanner.next();
		System.out.println("Olá, " + nome + "!");
		scanner.close();
	}
}
