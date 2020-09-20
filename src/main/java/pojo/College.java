package pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Ivan Nikolaev");
        student.setGroup("java");
        student.setBirtDay("15.07.1990");
        System.out.println(student.getName() + " " + student.getBirtDay() + " group: " + student.getGroup());
    }
}
