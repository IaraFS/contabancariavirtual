import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nomeCliente = "Iara Franzina Serra";
        String tipoDeConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;


        double valorRecebido = 0;
        double valorTransferido = 0;

        System.out.println("""
                *************************
                Dados iniciais do Cliente:
                
                Nome: """ + nomeCliente);

        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("*************************");

        String menu = ("""
                
                Operações 
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                """);

        Scanner leitura = new Scanner(System.in);


        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("Seu saldo atual é de R$ " + saldo);

            } else if (opcao == 2){
                System.out.println("Digite o valor a ser recebido: ");
                valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.println("O valor de R$ " + valorRecebido);

                System.out.println("foi recebido corretamente. Seu saldo atual é de R$ " + saldo);

            } else if (opcao == 3) {
                System.out.println("Digite o valor a ser transferido: ");
                valorTransferido = leitura.nextDouble();
                    if (valorTransferido > saldo){
                        System.out.println("Você não possui saldo suficiente para a transação.");
                    } else if (valorTransferido <= saldo) {
                        saldo -= valorTransferido;
                        System.out.println("O valor de R$ " + valorTransferido);
                        System.out.println("foi transferido corretamente. Seu saldo atual é de R$ " + saldo);
                    }

            } else if (opcao == 4) {
                System.out.println("Obrigado, volte sempre!");
                break;

            }


        }






    }
}