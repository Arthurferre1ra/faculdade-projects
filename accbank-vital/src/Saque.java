class Saque implements OperacaoBancaria {
    private ContaBancaria conta;
    private double valor;

    public Saque(ContaBancaria conta, double valor) {
        this.conta = conta;
        this.valor = valor;
    }

    @Override
    public void executar() {
        if (valor > 0 && valor <= conta.getSaldo()) {
            conta.atualizarSaldo(-valor);
            conta.adicionarAoExtrato("Saque de R$ " + valor);
        } else {
            System.out.println("Saque inválido ou saldo insuficiente!");
        }
    }
}