package pojo;

import java.util.Date;

public class Programmer extends Engineer {
    private String name;
    private String surname;
    private String education;
    private Date birthDay;
    private String specialization;
    private String kindProject;


    public Programmer(String name, String surname, String education, Date birthDay, String specialization) {
        super(name, surname, education, birthDay, specialization);
    }


    public String getKindProject() {
        return kindProject;
    }


    public void program() {

    }








}
