package pe.isil.models;

public class Person {

    /*
     * Atributos
     */

    private String name;
    private int age;

    /*
     * Constructor
     */

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
     * Getters & setters
     */

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /*
     * Métodos
     */

    public void eat() {
        System.out.println(name + " está comiendo.");
    }

    public void sleep() {
        System.out.println(name + " está durmiendo.");
    }

}
