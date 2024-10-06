class Transferencia implements OperacaoBancaria {
    private ContaBancaria origem;
    private ContaBancaria destino;
    private double valor;

    public Transferencia(ContaBancaria origem, ContaBancaria destino, double valor) {
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
    }

    @Override
    public void executar() {
        if (valor > 0 && valor <= origem.getSaldo()) {
            origem.atualizarSaldo(-valor);
            destino.atualizarSaldo(valor);
            origem.adicionarAoExtrato("Transferência de R$ " + valor + " para " + destino.getTitular());
            destino.adicionarAoExtrato("Recebimento de R$ " + valor + " de " + origem.getTitular());
        } else {
            System.out.println("Transferência inválida ou saldo insuficiente!");
        }
    }
}