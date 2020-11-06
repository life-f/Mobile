public class Increment {
    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 1; i <= 100; i++) { //запустить 100 потоков
            Thread thread = new Thread("Thread" + i) {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        counter.increment();
                    }
                }
            };
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(counter.getCount()); //Вывело в первый раз 1000, сделала static - вывело 29000
        //добавила ожидание завершения потоков - вывело 100000
    }
}
