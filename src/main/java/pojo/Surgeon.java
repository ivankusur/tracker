package pojo;

import java.util.Date;

@SuppressWarnings("checkstyle:LineLength")
public class Surgeon extends Doctor {
    private String name;
    private String surname;
    private String education;
    private Date birthDay;
    private String specialization;
    private int numbersOfOperations;

    public Surgeon(String name, String surname, String education, Date birthDay, String specialization) {
        super(name, surname, education, birthDay, specialization);
    }


    public int getNumbersOfOperations() {
        return numbersOfOperations;
    }


    public void operating(String patient) {
    }
}
