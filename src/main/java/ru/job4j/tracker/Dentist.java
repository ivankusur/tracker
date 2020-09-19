package ru.job4j.tracker;

import java.util.Date;

public class Dentist extends Doctor {
    private String name;
    private String surname;
    private String education;
    private Date birthDay;
    private String specialization;
    private String specializationOfDentist;


    public Dentist(String name, String surname, String education, Date birthDay, String specialization) {
        super(name, surname, education, birthDay, specialization);
    }

    public String getSpecializationOfDentist() {
        return specializationOfDentist;
    }


    public void fill(String patient){
    }
}
