package pojo;

import java.util.Date;

public class Engineer extends Profession {
    private String name;
    private String surname;
    private String education;
    private Date birthDay;
    private String specialization;

    public Engineer(String name, String surname, String education,
                    Date birthDay, String specialization) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthDay = birthDay;
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void preparationTechnicalDoc() {
    }

}
