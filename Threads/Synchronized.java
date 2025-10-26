package Threads;

public class Synchronized {
    public static void main(String[] args) {
        Conta conta = new Conta();

        Thread thread1 = new Thread(() -> CaixaEletronico.sacar(conta, 100.0));
        Thread thread2 = new Thread(() -> CaixaEletronico.sacar(conta, 100.0));

        thread1.start();
        thread2.start();
    }

    static public class Conta {
        Double saldo = 100.0;

        public Double getSaldo() {
            return this.saldo;
        }

        public void setSaldo(Double saldo) {
            this.saldo = saldo;
        }
    }

    static public class CaixaEletronico {
        static public synchronized void sacar(Conta conta, Double valor) {
            if (conta.getSaldo() < valor) {
                System.out.println("Saldo insuficiente.");
            } else {
                conta.setSaldo(conta.getSaldo() - valor);
                System.out.println("Saque realizado no valor de " + valor);
            }
        }
    }
}
