import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("Selecione a figura geométrica para calcular a área:");
            System.out.println("1: Retângulo");
            System.out.println("2: Triângulo");
            System.out.println("3: Círculo");
            System.out.println("4: Trapézio");
            System.out.println("0: Sair");

            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1: 
                    System.out.print("Digite a largura do retângulo: ");
                    double largura = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double altura = scanner.nextDouble();
                    double areaRetangulo = largura * altura;
                    System.out.printf("Área do retângulo: %.2f\n", areaRetangulo);
                    break;

                case 2: 
                    System.out.print("Digite a base do triângulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Digite a altura do triângulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    double areaTriangulo = (base * alturaTriangulo) / 2;
                    System.out.printf("Área do triângulo: %.2f\n", areaTriangulo);
                    break;

                case 3: 
                    System.out.print("Digite o raio do círculo: ");
                    double raio = scanner.nextDouble();
                    double areaCirculo = Math.PI * raio * raio;
                    System.out.printf("Área do círculo: %.2f\n", areaCirculo);
                    break;

                case 4: 
                    System.out.print("Digite a base maior do trapézio: ");
                    double baseMaior = scanner.nextDouble();
                    System.out.print("Digite a base menor do trapézio: ");
                    double baseMenor = scanner.nextDouble();
                    System.out.print("Digite a altura do trapézio: ");
                    double alturaTrapezio = scanner.nextDouble();
                    double areaTrapezio = ((baseMaior + baseMenor) * alturaTrapezio) / 2;
                    System.out.printf("Área do trapézio: %.2f\n", areaTrapezio);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
