package com.company;

import java.util.LinkedList;
public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList<Person> Persons = new LinkedList<>();
        Person person = new Person("Atai","asd","asd");
        if (Persons.contains(person)){
            throw  new Exception("Error");
        }
        else{
            Persons.add(person);
        }
        Person person1 = new Person("Atai","asd","asd");
        if (Persons.contains(person1)){
            throw  new Exception("Eror");
        }
        else{
            Persons.add(person1);
        }
    }
}
