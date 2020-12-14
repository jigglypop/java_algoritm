public class ThreadRunnable {
    public static void main(String[] args) {
        Runnable runImpl = () -> System.out.println("Hello World");
        Thread thread = new Thread(runImpl);
        thread.start();
    }
}
