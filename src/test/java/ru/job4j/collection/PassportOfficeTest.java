package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void addApproved() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void addForbidden() {
        Citizen petr = new Citizen("2f44a", "Petr Arsentev");
        Citizen ivan = new Citizen("2f44a", "Ivan Nikolaev");
        PassportOffice office = new PassportOffice();
        office.add(petr);
        office.add(ivan);
        assertThat(office.get(ivan.getPassport()), is(petr));
    }
}