import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        if (altura <= 0) {
            System.out.println("Altura inválida. Deve ser maior que zero.");
            return;
        }

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc < 24.9) {
            System.out.println("Peso normal.");
        } else if (imc < 29.9) {
            System.out.println("Sobrepeso.");
        } else {
            System.out.println("Obesidade.");
        }

    }
}
