import java.util.Scanner;

public class captura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        input.nextLine();

        System.out.print("Digite sua profissão: ");
        String profissao = input.nextLine();

        System.out.print("Nome: ");
        System.out.println(nome);
        System.out.printf("Idade: %d\n", idade);
        System.out.println("Profissão: " + profissao);

    }
}
