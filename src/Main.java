public class Main {
    public static String first = "";
    public static void main(String[] args) {
        Thread egg = new Thread(new EggOrChicken("Яйцо"));
        Thread chicken = new Thread(new EggOrChicken("Курица"));
        egg.start();
        chicken.start();
        try {
            Thread.sleep(500);
            egg.interrupt();
            chicken.interrupt();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(first + " появилось сначала");
    }
}
