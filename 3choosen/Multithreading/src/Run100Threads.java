public class Run100Threads {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { //запустить 10 потоков
            MyThread thread = new MyThread("Thread" + i);
            System.out.println(thread.getName() + " - " + thread.getState());
            thread.start();
            System.out.println(thread.getName() + " - " + thread.getState());
        }
    }
}
