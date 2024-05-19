import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conheer e importar a classe Scanner
        // Exibir as mensages para o nosso usuario
        // Obter pela classe Scanner os valores digitados no terminal
        // Exibir  a mensagem da conta criada
        // Criação do objeto Scanner para leitura de entrada do usuário

        Scanner scanner = new Scanner(System.in);

        // Exibir mensagem para o usuário e obter os valores digitados
        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine(); // Alterado para nextLine() para capturar a agência completa

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();

        double saldo = 100.50;

        // Exibir a mensagem da conta criada
        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numeroConta +
                " e seu saldo de R$ " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
