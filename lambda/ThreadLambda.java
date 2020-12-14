public class ThreadLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(()-> {System.out.println("Hello World");});
        thread.start();
    }
}
