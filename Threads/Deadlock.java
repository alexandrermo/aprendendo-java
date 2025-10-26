package Threads;

public class Deadlock {
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
            synchronized (vasilha) {
                System.out.println("c2: Segurando a vasilha");
                System.out.println("c2: Esperando a colher");

                synchronized (colher) {
                    System.out.println("c2: Segurando a colher");

                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
