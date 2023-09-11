public class Main {
    public static void main(String[] args) {
        NumberThread n1 = new NumberThread(1,100,500);
        n1.start();
    }
}