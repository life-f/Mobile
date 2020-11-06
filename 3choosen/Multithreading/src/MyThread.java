public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int j = 1; j <= 100; j++) {
            System.out.println(this.getName() + " - number " + j);
        }
    }
}
