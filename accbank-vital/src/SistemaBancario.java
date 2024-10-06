public class SistemaBancario {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaCorrente("João", 1000);
        ContaBancaria conta2 = new ContaPoupanca("Maria", 500);

        // Depósito
        OperacaoBancaria deposito = new Deposito(conta1, 200);
        deposito.executar();

        // Saque
        OperacaoBancaria saque = new Saque(conta1, 150);
        saque.executar();

        // Transferência
        OperacaoBancaria transferencia = new Transferencia(conta1, conta2, 300);
        transferencia.executar();

        // Exibir extratos
        conta1.exibirExtrato();
        conta2.exibirExtrato();
    }
}