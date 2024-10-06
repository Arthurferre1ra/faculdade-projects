class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void atualizarSaldo(double valor) {
        this.saldo += valor;  // pode haver lógica de juros aqui no futuro
    }
}