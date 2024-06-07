import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String Agencia;
        String NomeCliente;
        float saldo;

        System.out.println("Por favor, digite o número da Agência: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite qual agência: ");
        Agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        NomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o valor de deposito: ");
        saldo = scanner.nextFloat();

        System.out
                .println("Olá " + NomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + Agencia
                        + ", sua conta " + numero + " e seu saldo de " + saldo + "já está disponivel para saque");

        scanner.close();
    }
}