package contaBancaria;

public interface OperacoesConta {
    void depositar(double saldo);
    void sacar(double saldo);
    double consultarSaldo();
    void transferir(ContaBancaria destino, double valor);
}
