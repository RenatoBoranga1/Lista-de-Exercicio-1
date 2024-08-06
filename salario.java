import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual seu nome? \n ");
        String nome = input.nextLine();

        System.out.print("Qual seu salário? \n ");
        double salario = input.nextDouble();

        System.out.print("Qual sua idade? \n ");
        int idade = input.nextInt();

        System.out.print("Qual sua altura?\n  ");
        double altura = input.nextDouble();

        System.out.print("Qual seu sexo: ");
        input.nextLine();
        String sexo = input.nextLine();

        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Salário: %.2f\n", salario);
        System.out.printf("Idade: %d\n", idade);
        System.out.printf("Altura: %.2f metros\n", altura);
        System.out.printf("Sexo: %s\n", sexo);

    }
}
