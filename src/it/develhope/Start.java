package it.develhope;

public class Start {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Marco");
        person.setSurName("Abbondanza");
        person.setHeight(1.80);
        person.setAge(24);

        System.out.println(person.toString());

    }
}
