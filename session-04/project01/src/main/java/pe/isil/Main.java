package pe.isil;

import pe.isil.models.Person;

public class Main {
    public static void main(String[] args) {
       Person person01 = new Person("Jorge Fuentes", 35);
       person01.sleep();

       System.out.println(person01.getAge());

       Person person02 = new Person("Luis Medina", 20);
       person02.sleep();
    }
}