package utilizandointerface;

public class ContaCorrente implements Conta{
        
        //atributos
        private double saldo = 0;
        private double taxaOperacao = 0.2;

        //m�todos
        public void depositar(double quantia) {
                this.saldo += quantia - taxaOperacao;
        }
        
        public void sacar(double quantia) {
                this.saldo -= quantia - taxaOperacao;
        }
        
        public double getSaldo() {
                return saldo;
        }
}//fim classe