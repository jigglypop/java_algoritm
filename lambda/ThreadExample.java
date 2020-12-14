public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable(){
            public void run(){
                System.out.println("Hello World");
            }
        });
        thread.start();
    }
}
