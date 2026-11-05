public class BankController {
    private BankAccount model;
    private BankView view;

    public BankController(BankView view) {
        this.view = view;
    }

    public void start() {

        String name = view.getAccountHolder();
        double balance = view.getInitialBalance();

        model = new BankAccount(name, balance);

        double deposit = view.getDepositAmount();

        if (model.deposit(deposit)) {
            view.displayMessage("Deposit successful!");
        } else {
            view.displayMessage("Invalid deposit amount!");
        }

        double withdraw = view.getWithdrawAmount();

        if (model.withdraw(withdraw)) {
            view.displayMessage("Withdrawal successful!");
        } else {
            view.displayMessage("Withdrawal failed! Insufficient balance or invalid amount.");
        }

        view.displayAccount(
            model.getAccountHolder(),
            model.getBalance()
        );
    }
}