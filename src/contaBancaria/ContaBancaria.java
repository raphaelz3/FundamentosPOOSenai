package contaBancaria;

public class ContaBancaria implements OperacoesConta{
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    @Override
    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    @Override
    public void sacar(double saldo) {
        if (saldo <= this.saldo)
            this.saldo -= saldo;
        else
            System.out.println("Saldo Insuficiente.\n");
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public void transferir(ContaBancaria destino, double valor) {
        sacar(valor);
        destino.depositar(valor);

    }
}
