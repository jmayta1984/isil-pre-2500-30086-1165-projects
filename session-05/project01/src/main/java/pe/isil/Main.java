package pe.isil;

import pe.isil.models.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee01 = new Employee("Francisco", "Salas", 1500, false);

        Employee employee02 = new Employee("Ana", "Paredes", 1800, true);

        System.out.println(Employee.minSalary);

        System.out.println(employee01.toString());
        System.out.println(employee02.toString());

     
    }
}