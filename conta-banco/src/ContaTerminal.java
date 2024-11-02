import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String agencia;
        int numero;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Identifique-se com o seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.print("Informe a sua agência: ");
        agencia = sc.nextLine();

        System.out.print("Número da conta da agência: ");
        numero = sc.nextInt();

        System.out.print("Informe o saldo para a sua conta: ");
        saldo = sc.nextDouble();

        sc.close();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n", nomeCliente, agencia, numero, saldo);
    }
}
