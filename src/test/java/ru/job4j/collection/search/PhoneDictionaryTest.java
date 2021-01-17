package ru.job4j.collection.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phone = new PhoneDictionary();
        phone.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phone.find("Petr");
        assertThat(persons.get(0).getName(), is("Petr"));
    }
}