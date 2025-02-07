package pe.isil.models;

public class BankAccount {
    /*
     * Atributos de instancia
     */
    private String customer;
    private String account;
    private double amount;

    /*
     * Constructor
     */

    public BankAccount(String customer, String account, double amount) {
        this.customer = customer;
        this.account = account;
        this.amount = amount;
    }

    /*
     * Getters & setters
     */

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    /*
     * Métodos de instancia
     */

    public void deposit(double quantity) {
        if (quantity > 0) {
            amount += quantity;
            System.out.println("El nuevo saldo es: " + amount);

        } else {
            System.out.println("El depósito debe ser mayor a 0.");
        }
    }

    public void withDraw(double quantity) {
        if (quantity <= 0) {
            System.out.println("El monto del retiro debe ser mayor a 0.");
            return;
        }

        if (quantity > amount) {
            System.out.println("No cuentas con saldo disponible para el monto a retirar.");
            return;
        }

        amount -= quantity;
        System.out.println("El nuevo saldo es: " + amount);

    }
}
