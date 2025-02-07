package pe.isil;

import java.util.Scanner;

import pe.isil.models.BankAccount;

public class Main {
    public static void main(String[] args) {
       BankAccount bankAccount01 = new BankAccount("Aldo Vega", "5401389", 0);

       System.out.println("Ingrese el monto a depositar");

       Scanner scanner = new Scanner(System.in);
       double quantity = scanner.nextDouble();

       bankAccount01.deposit(quantity);

       System.out.println("Ingrese el monto a retirar");
       double amount = scanner.nextDouble();
       bankAccount01.withDraw(amount);


       scanner.close();
    }
}