package com.company;
import java.util.Objects;
public class Person {

        String surname;
        String name;
        String papa;
        public Person(String name, String firstname, String patronymic) {
            this.surname = name;
            this.name = firstname;
            this.papa = patronymic;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(surname, person.surname) &&
                    Objects.equals(name, person.name) &&
                    Objects.equals(papa, person.papa);
        }
        @Override
        public int hashCode() {
            return Objects.hash(surname, name, papa);
        }
    }

