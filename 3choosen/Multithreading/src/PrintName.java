public class PrintName {
    public static void main(String[] args) {
        Thread thread1 = new Thread("Thread1") {
            @Override
            public void run() {
                System.out.println(this.getName());
            }
        };
        Thread thread2 = new Thread("Thread2") {
            @Override
            public void run() {
                System.out.println(this.getName());
            }
        };
        for (int i = 0; i < 10; i++) {
            thread1.run();
            thread2.run();
        }
    }
}
