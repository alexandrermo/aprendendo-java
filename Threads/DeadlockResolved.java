package Threads;

public class DeadlockResolved {
    static Object colher = new Object();
    static Object vasilha = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (colher) {
                System.out.println("c1: Segurando a colher");
                System.out.println("c1: Esperando a vasilha.");

                synchronized (vasilha) {
                    System.out.println("c1: Segurando a vasilha");

                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (colher) {
                System.out.println("c2: Segurando a colher");
                System.out.println("c2: Esperando a vasilha");

                synchronized (vasilha) {
                    System.out.println("c2: Segurando a vasilha");

                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
