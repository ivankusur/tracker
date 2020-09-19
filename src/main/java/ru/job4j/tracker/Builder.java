package ru.job4j.tracker;

import java.util.Date;

public class Builder extends Engineer {
    private String name;
    private String surname;
    private String education;
    private Date birthDay;
    private String kindProject;


    public Builder(String name, String surname, String education, Date birthDay, String specialization) {
        super(name, surname, education, birthDay, specialization);
    }

    public String getKindProject() {
        return kindProject;
    }


    public void controlBuildMaterial() {

    }
}
