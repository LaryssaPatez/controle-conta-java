import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Amanda Burgos";
        String tipoConta = "Corrente";
        double saldoInicial = 3500.00;
        int opcao = 0;

        //print informações
        System.out.println("************************************");
        System.out.println("\nOlá, " + nome + "!");
        System.out.println("Conta: " + tipoConta);
        System.out.println("Saldo disponível: " + saldoInicial);
        System.out.println("\n************************************");

        //text box
        String menu = """
                 
                 ** OPERAÇÕES **
                 1- Consultar saldo
                 2- Receber valor
                 3- Transferência de valor
                 4- Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            System.out.println("Digite a opção desejada: ");
            opcao = leitura.nextInt();

            if ( opcao == 1) {
                System.out.println("Saldo disponível: " + saldoInicial);
            } else if (opcao == 2) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                if (valor > saldoInicial) {
                    System.out.println("Saldo insuficiente para realizar a transferência.");
                } else {
                    saldoInicial += valor;
                }
            } else if (opcao == 3) {
                System.out.println("Qual é o valor da transferência?");
                double valor = leitura.nextDouble();
                saldoInicial -= valor;

            } else if (opcao != 4) {
                System.out.println("Opção inválida.");
            }
        }
    }
}