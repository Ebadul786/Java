public class Main {
    public static void main(String[] args) {

        BankView view = new BankView();

        BankController controller = new BankController(view);

        controller.start();
    }
}