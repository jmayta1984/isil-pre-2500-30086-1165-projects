package pe.isil.models;

public class Employee {

    /*
     * Atributos de instancia
     */

    private String firstName;
    private String lastName;
    private double salary;
    private boolean hasChildren;

    /*
     * Atributo de clase
     */
    public static double minSalary = 1130;

    /*
     * Constructor
     */

    public Employee(String firstName, String lastName, double salary, boolean hasChildren) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.hasChildren = hasChildren;
    }

    /*
     * Getters & setters
     */

     public String getFirstName() {
        return firstName;
     }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public boolean getHasChildren() {
        return hasChildren;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    @Override
    public String toString(){
        return "FirstName: " + firstName + ", LastName: " + lastName;
    }

}
