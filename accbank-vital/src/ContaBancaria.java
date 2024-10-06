import java.util.ArrayList;
import java.util.List;

interface OperacaoBancaria {
    void executar();
}

abstract class ContaBancaria {
    private String titular;
    protected double saldo;
    private List<String> extrato;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.extrato = new ArrayList<>();
        adicionarAoExtrato("Conta criada com saldo inicial de R$ " + saldoInicial);
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionarAoExtrato(String transacao) {
        extrato.add(transacao);
    }

    public void exibirExtrato() {
        System.out.println("Extrato da conta de " + titular + ":");
        for (String transacao : extrato) {
            System.out.println(transacao);
        }
    }

    public abstract void atualizarSaldo(double valor);
}