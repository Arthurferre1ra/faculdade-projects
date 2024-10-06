class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void atualizarSaldo(double valor) {
        this.saldo += valor;
    }
}