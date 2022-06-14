public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {

            for (int i = 5; i >=0; i--) {
                System.out.println("Countdown... " + i);
                Thread.sleep(1000);
            }
            System.out.println("Hello world!");

    }
}
