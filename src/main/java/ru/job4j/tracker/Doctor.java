package ru.job4j.tracker;

import java.util.Date;

public class Doctor extends Profession {
    private String name;
    private String surname;
    private String education;
    private Date birthDay;
    private String specialization;

    public Doctor(String name, String surname, String education, Date birthDay, String specialization) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthDay = birthDay;
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
}
