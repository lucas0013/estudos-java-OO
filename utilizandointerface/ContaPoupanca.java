package utilizandointerface;

public class ContaPoupanca implements Conta {
        
        //atributo
        private double saldo;
        
        //métodos
        public void depositar(double quantia) {
                this.saldo += quantia;
        }
        
        public void sacar(double quantia) {
                this.saldo -= quantia;
        }
        
        public double getSaldo(){
                return saldo;
        }
}//fim classe