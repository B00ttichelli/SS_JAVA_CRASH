package LabTasks.exceptionsBank;

public class InsufficientAmountException extends Exception {
    private double amount;
    public InsufficientAmountException(double needs) {
        this.amount = needs;
    }

    public String getAmount() {
        return ""+ amount;
    }

    @Override
    public String getMessage() {
        return "Sorry, but you are short $"+ amount;
    }
}
