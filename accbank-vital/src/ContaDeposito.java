class Deposito implements OperacaoBancaria {
    private ContaBancaria conta;
    private double valor;

    public Deposito(ContaBancaria conta, double valor) {
        this.conta = conta;
        this.valor = valor;
    }

    @Override
    public void executar() {
        if (valor > 0) {
            conta.atualizarSaldo(valor);
            conta.adicionarAoExtrato("Depósito de R$ " + valor);
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }
}