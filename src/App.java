import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

   
        System.out.print("Digite o primeiro número: ");
        double num1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = leitor.nextDouble();

        // 2. Menu de opções
        System.out.println("Operações: 1-Soma  2-Subtração  3-Multiplicação  4-Divisão");
        System.out.print("Escolha: ");
        int escolha = leitor.nextInt();


        switch (escolha) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
              
                if (num2 == 0) {
                    System.out.println("Erro: divisão por zero não é permitida.");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;
            default:
          
                System.out.println("Erro: Código de operação inválido.");
                break;
        }

        leitor.close();
    }
}