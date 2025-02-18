import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // Criando um objeto Scanner 
        try (Scanner scanner = new Scanner(System.in)) {

            // Declarando variáveis
            int numero;
            String agencia;
            String nomeCliente;
            double saldo = 237.48; // Saldo fixo inicial

            // número da conta com validação
            System.out.println("Digite o Número da Conta:");
            while (true) {
                String input = scanner.nextLine();
                if (input.length() <= 6 && input.matches("\\d+")) {
                    numero = Integer.parseInt(input);
                    break;
                } else {
                    System.out.println("Número inválido! Digite no máximo 6 dígitos numéricos:");
                }
            }

            // Dados da agência com validação
            System.out.println("Digite a Agência:");
            while (true) {
                agencia = scanner.nextLine();
                if (agencia.length() <= 5) {
                    break;
                } else {
                    System.out.println("Agência inválida! Digite no máximo 5 caracteres.");
                }
            }

            // Nome do cliente
            System.out.println("Digite o Nome impresso no Cartão:");
            nomeCliente = scanner.nextLine();

            // Exibir saldo ao pressionar ENTER
            System.out.println("Pressione ENTER para visualizar o saldo...");
            scanner.nextLine();

            // Mensagem Final
            System.out.println("\nOlá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco.");
            System.out.printf("Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n",
                    agencia, numero, saldo);
        }
    }
}
