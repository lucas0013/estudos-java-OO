package utilizandointerface;

public class Principal {
        
        public static void main(String args[ ]) {
                
                ContaCorrente contaCorrente = new ContaCorrente();
                contaCorrente.depositar(2500.78);
                contaCorrente.sacar(250);
                System.out.println("\nSaldo da Conta corrente: "+contaCorrente.getSaldo());
                
                ContaPoupanca contaPoupanca = new ContaPoupanca();
                contaPoupanca.depositar(5000.50);
                System.out.println("\nSaldo da Conta Poupan�a: "+contaPoupanca.getSaldo());
                contaPoupanca.sacar(445);
                
                System.out.println("\nSaldo da Conta corrente: "+contaCorrente.getSaldo());
                System.out.println("\nSaldo da Conta Poupan�a: "+contaPoupanca.getSaldo());
                
        } // fim do main
}//fim classe

