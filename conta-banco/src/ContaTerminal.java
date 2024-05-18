import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // pegando o nome do cliente
        System.out.println("Digite seu Nome e Sobrenome:");
        String nomeCliente = scanner.nextLine();
        // pegando o número da conta
        System.out.println("Por favor, digite o número da sua Conta:");
        int conta = scanner.nextInt();
        // pegando a agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();
        // pegando o saldo
        System.out.println("Por favor, digite o seu Saldo:");
        double saldo = scanner.nextDouble();

        // imprimindo as informações
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco sua agência é "
                + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
