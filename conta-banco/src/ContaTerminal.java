import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in);

        //Declarando as variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //Agora vamos solicitar e ler os dados de cada cliente
        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        //exibindo as informações
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta número " + numero + "e seu saldo " + saldo + "já está disponível para saque.");

        //fechamento do scanner
        scanner.close();
    }
}
